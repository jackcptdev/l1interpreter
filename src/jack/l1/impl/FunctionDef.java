package jack.l1.impl;

public class FunctionDef {

	private String functionName;
	private String[] parameters;
	private Object functionBody;

	public FunctionDef(String functionName, String[] parameters,
			Object functionBody) {
		this.functionName = functionName;
		this.parameters = parameters;
		this.functionBody = functionBody;
	}

	public String getFunctionName() {
		return functionName;
	}

	public String[] getParameters() {
		return parameters;
	}

	public Object getFunctionBody() {
		return functionBody;
	}

	public void print() {
		System.out.println("FunctionName: " + this.functionName);
		System.out.print("Parameters: ");
		for (int i = 0; i < this.parameters.length; i++) {
			System.out.print(this.parameters[i] + " ");
		}
		System.out.println();
		System.out.println("Block Context: " + this.functionBody);
	}

}
