package _04_hospital;

public class Patient {
	boolean caredFor = false;
	void checkPulse()
	{
		caredFor = true;
	}
	public void setCaredFor(boolean _caredFor)
	{
		caredFor = _caredFor;
	}
	public boolean feelsCaredFor()
	{
		return caredFor;
	}
}
