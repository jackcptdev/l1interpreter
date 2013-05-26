package jack.l1.mem;

import jack.l1.impl.Identity;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Scope {

	private final Map<String, Identity> mem = new HashMap<String, Identity>();

	public void refreshPut(String key, Identity value) {
		this.mem.put(key, value);
	}

	public Identity get(String key) {
		return this.mem.get(key);
	}

	public boolean conditionPut(String key, Identity value) {
		if (this.mem.containsKey(key)) {
			return false;
		}
		this.mem.put(key, value);
		return true;
	}

	public Scope deepClone() {
		Scope dest = new Scope();
		for (Entry<String, Identity> entry : this.mem.entrySet()) {
			dest.refreshPut(entry.getKey(), entry.getValue());
		}
		return dest;
	}

	public boolean isContainKey(String key) {
		return this.mem.containsKey(key);
	}

	public Map<String, Identity> getMemory() {
		return mem;
	}

	public void clearScope() {
		this.mem.clear();
	}

}
