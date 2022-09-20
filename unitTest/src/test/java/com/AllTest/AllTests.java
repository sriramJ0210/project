package com.AllTest;

//TestSuits - helps to executes all unit test cases together
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


import com.unitTest.ArrayTest;
import com.unitTest.SumTest;

@RunWith(Suite.class)
@SuiteClasses({SumTest.class, ArrayTest.class})
public class AllTests {
	
}
