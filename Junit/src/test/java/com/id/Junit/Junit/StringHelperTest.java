package com.id.Junit.Junit;

//import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringHelperTest  {
	StringHelper helper=new StringHelper();
	@Test
	public void test() {
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void test1() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
	}

}
