package com.wiprojuly.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


// Before :- STCM = Suite, Test, Class, Methods
// After :- MCTS = Methods, Class, Test, Suite  
@Listeners(TestNGListnersEg.class)
public class TestNGAnnotations {
	
	@BeforeTest
	public void Beforetest() {
		System.out.println("Checking products");
	}
	
	@AfterTest
	public void Aftertest() {
		System.out.println("Removing products");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Opening the API Connection");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Closing the API Connection");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Opening the DB Connection");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Closing the DB Connection");
	}
	
	@Test
	public void Testcase1() {
		System.out.println("Testcase1 is executed");
	}
	
	@Test
	public void Testcase2() {
		System.out.println("Testcase2 is executed");
	}
	
	@Test
	public void Testcase3() {
		System.out.println("Testcase3 is executed");
	}
	
}
