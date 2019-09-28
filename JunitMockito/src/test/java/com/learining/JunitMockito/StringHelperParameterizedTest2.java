package com.learining.JunitMockito;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest2 {
	StringHelper helper = new StringHelper();

	String input;
	
	public StringHelperParameterizedTest2(String input) {
		super();
		this.input = input;
	}
	// AB => true , ABAB => true
	 
	
	
	
	@Parameters
	public static List<String[]> testConditions() {
		String strArr[][] = { {"AB"},  {"ABAB"}   };
		return Arrays.asList(strArr);	
	}

//	@Test
//	public void testReplaceAinFirst2charactes() {
//		System.out.println("testReplaceAinFirst2charactes");
//		assertEquals(expectedOutput, helper.replaceAinFirst2charactes(input));
//	}

	@Test
	public void testareFirstAndLast2CharsSame() {
	
		System.out.println("testareFirstAndLast2CharsSame");
		assertTrue(helper.areFirstAndLast2CharsSame(input));		
	}

}
