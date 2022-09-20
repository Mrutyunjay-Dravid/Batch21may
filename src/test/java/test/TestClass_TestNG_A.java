package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_TestNG_A {


	@BeforeClass 
	public void beforeClass(){
		System.out.println("beforeClass_A");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod_A");
	}
	
	@Test 
	public void testB() {
		System.out.println("testB_A");

	}
	
	@Test 
	public void testA() {
		System.out.println("testA_A");
	
	}
	
	@Test 
	public void testC () {
		System.out.println("testC_A");

	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod_A");

	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass_A");

	}
	
}
