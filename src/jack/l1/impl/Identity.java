package jack.l1.impl;

public class Identity {

	public static final int ID = 0x01;
	public static final int NUMBER = 0x02;
	public static final int STRING = 0x03;
	public static final int FUN = 0x04;
	public static final int BLOCK = 0x05;
	public static final int BOOL = 0x06;
	public static final int NULL = 0x07;
	public static final int PARAMETERS = 0x08;
	public static final int PARAMETER_VALUES = 0x09;
	public static final int ARRAY = 0x10;

	private int identityType = 0;
	private Object constantValue;

	public Identity(int identityType, Object constantValue) {
		this.identityType = identityType;
		this.constantValue = constantValue;
	}

	public int getIdentityType() {
		return identityType;
	}

	public Object getConstantValue() {
		return constantValue;
	}

	public void setConstantValue(Object constantValue) {
		this.constantValue = constantValue;
	}

	public Identity lightClone() {
		Identity r = new Identity(this.identityType, this.constantValue);
		return r;
	}

	public void setIdentityType(int identityType) {
		this.identityType = identityType;
	}

	
}
