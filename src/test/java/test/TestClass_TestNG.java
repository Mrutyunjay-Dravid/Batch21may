package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass_TestNG {
	

	@BeforeClass 
	public void beforeClass(){
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test 
	public void testB() {
		System.out.println("testB");

	}
	
	@Test (enabled=false)
	public void testA() {
		System.out.println("testA");
	
	}
	
	@Test (timeOut=2000)
	public void testC () throws InterruptedException {
		System.out.println("testC");
		Thread.sleep(5000);

	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");

	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");

	}

}
