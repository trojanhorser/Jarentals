package com.jarentals.common.util;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class UtilTest {
	
	//Mock Data
	private String data1 = null;
	private Object data2 = null;
	private Object data3 = new Object();
	private String data4 = "";
	private String data5 = "String that is not empty";
	
	///Should return false if any of the objects in the list is null
	@Test
	public void testShouldReturnFalseIfAnyOfTheParametersAreNull(){
		assertTrue(Util.isObjectEmpty(data1,data2));
	}
	
	///if object is a string and has no characters it should return false
	@Test
	public void testShouldReturnFalseIfEmptyStringIsParameter(){
		assertTrue(Util.isObjectEmpty(data4));
	}
	
	//Should return true if objects are not null
	@Test
	public void testShouldReturnFalseIfObjectsAreNotNull(){
		assertFalse(Util.isObjectEmpty(data3,data5));
	}
	
}
