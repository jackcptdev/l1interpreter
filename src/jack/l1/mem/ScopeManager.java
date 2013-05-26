package jack.l1.mem;

import jack.l1.impl.Identity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class ScopeManager {

	private final List<Scope> scopes = new ArrayList<Scope>();
	private volatile Scope currentScope = null;
	private final Scope globalFunctionScope = new Scope();

	private final Scope callFunctionParamValues = new Scope();

	private Identity returnValue;

	private ScopeManager() {

	}

	public void pushFunctionParameterValue(String key, Identity value) {
		this.callFunctionParamValues.refreshPut(key, value);
	}

	public void moveFunctionParameterValuesToCurrentScope() {
		for (Entry<String, Identity> entry : this.callFunctionParamValues
				.getMemory().entrySet()) {
			this.currentScope.refreshPut(entry.getKey(), entry.getValue());
		}
		this.callFunctionParamValues.clearScope();
	}

	public static ScopeManager newScopeManager() {
		ScopeManager sm = new ScopeManager();
		sm.enterNewScope();
		return sm;
	}

	public void enterNewScope() {
		Scope newScope = new Scope();
		scopes.add(newScope);
		this.currentScope = newScope;
	}

	public void exitNewScope() {
		if (scopes.size() > 0) {
			scopes.remove(scopes.size() - 1);
		}
		if (scopes.size() > 0) {
			this.currentScope = scopes.get(scopes.size() - 1);
		} else {
			this.currentScope = null;
		}
	}

	public void putIdentity(String key, Identity value) {
		Scope dest = findKeyBelongTo(key);
		if (dest != null) {
			dest.refreshPut(key, value);
		} else {
			this.currentScope.refreshPut(key, value);
		}
	}

	public Identity getIdentity(String key) {
		Scope dest = findKeyBelongTo(key);
		if (dest != null) {
			return dest.get(key);
		}
		return null;
	}

	public boolean putFunction(String functionName, Identity functionDef) {
		return this.globalFunctionScope.conditionPut(functionName, functionDef);
	}

	public Identity getFunction(String functionName) {
		return this.globalFunctionScope.get(functionName);
	}

	private Scope findKeyBelongTo(String key) {
		for (int i = this.scopes.size() - 1; i >= 0; i--) {
			Scope s = this.scopes.get(i);
			if (s.isContainKey(key)) {
				return s;
			}
		}
		return null;
	}

	public Identity getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(Identity returnValue) {
		this.returnValue = returnValue;
	}

	public void prepareForCallFunction() {
		this.callFunctionParamValues.clearScope();
	}

}
