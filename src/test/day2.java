package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I will excecute before executing any methods in the class");
	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("I will execute last");
	}
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("I will execute first");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("I will excecute after executing all methods in the class");
	}
}
