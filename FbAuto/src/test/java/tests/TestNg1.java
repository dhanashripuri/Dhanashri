package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg1 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method.........");
	}
    
	@Test (priority = 1, dependsOnMethods = {"testB", "testD"})
	public void testA()
	{
		System.out.println("test A");
	}
	
	@Test (invocationCount = 2)
	public void testB()
	{
		System.out.println("test B");
	}
	
	@Test (enabled = false) //(timeOut = 3000)
	public void testC()
	{
		System.out.println("test C");
	}
	
	@Test (priority = 2)
	public void testD()
	{
		System.out.println("test D");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
}
