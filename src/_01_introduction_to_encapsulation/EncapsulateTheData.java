package _01_introduction_to_encapsulation;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	public void setItemsRecieved(int _itemsReceived)
	{
		if(_itemsReceived < 0)
			itemsReceived = 0;
		else
			itemsReceived = _itemsReceived;
	}
	public int getItemsRecieved()
	{
		return itemsReceived;
	}
	public void setDegreesTurned(float _degreesTurned)
	{
		if(_degreesTurned < 0)
			degreesTurned = 0;
		else if(_degreesTurned > 360)
			degreesTurned = 360;
		else
			degreesTurned = _degreesTurned;
	}
	public float getDegreesTurned()
	{
		return degreesTurned;
	}
	public void setNomenclature(String str)
	{
		if(str.length() == 0)
			nomenclature = " ";
		else
			nomenclature = str;
	}
	public String getNomenclature()
	{
		return nomenclature;
	}
	public void setMemberObj(Object _memberObj)
	{
		if(_memberObj instanceof String )
			memberObj = new Object();
		else
			memberObj = _memberObj;
	}
	public Object getMemberObj()
	{
		return memberObj;
	}
	//public static void main(String[] args) {
	//}
	@Test
	void testItemsRecieved()
	{
		this.setItemsRecieved(3);
		assertEquals(this.getItemsRecieved(), 3);
		this.setItemsRecieved(-1);
		assertEquals(this.getItemsRecieved(), 0);
	}
	@Test
	void testDegreesTurned()
	{
		this.setDegreesTurned(3);
		assertEquals(this.getDegreesTurned(), 3);
		this.setDegreesTurned(-1);
		assertEquals(this.getDegreesTurned(), 0);
		this.setDegreesTurned(1000);
		assertEquals(this.getDegreesTurned(), 360);
	}
	@Test
	void testNomenclature()
	{
		this.setNomenclature("");
		assertEquals(this.getNomenclature(), " ");
		this.setNomenclature("testtime");
		assertEquals(this.getNomenclature(), "testtime");
	}
	@Test
	void testMemberObj()
	{
		this.setMemberObj(3);
		assertEquals(this.getMemberObj(), 3);
		this.setMemberObj("eww strings");
		assertFalse(this.getMemberObj() instanceof String);
	}
}
