package com.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {
Sum ob = new Sum();
int actualres = ob.add(10,5);
@Test 
public void addtest() {
	assertEquals(15,actualres);
}

}
