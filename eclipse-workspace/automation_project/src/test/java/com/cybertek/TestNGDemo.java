package com.cybertek;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDemo {

	
	
	@BeforeClass
	public void setUpClass() {
		System.out.println("runs before a class");
	}
	
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("runs before every method");
	}

	@Test
	public void test1() {
		System.out.println("First one");
	}
	
	
	@Test
	public void test2() {
		System.out.println("Second one");
	}
	
	@AfterMethod
	
	public void tearDownMethod() {
		System.out.println("runs after every method");
	}

	@AfterClass
	public void tearDownClass() {
		System.out.println("runs after a class");
	}
	
}
