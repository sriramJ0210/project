package com.unitTest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayTest {
ArrayDemo ad = new ArrayDemo();
String ar[] = ad.disp();
String ar1[] = {"apple", "orange"};
@Test 
public void arrayTest() {
	
	
	
	assertArrayEquals(ar1,ar);
}
}
