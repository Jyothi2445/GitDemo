package Inheritance;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class parentClass {

	public void ToDOTest()
	{
		System.out.println("I am executing from Parent class");

	}
	@BeforeTest
	public void beforeRun()
	{
		System.out.println("Run me First");
	}
	@AfterTest
	public void afterRun()
	{
		System.out.println("Run me last");
	}

}
