package com.web.test.webTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFeatures {
	WebDriver driver;
	
	@Test(groups = {"smoke"} , invocationCount = 5 )
	public void test1() {
		System.out.println("----Test 1----");
	}
	
	@Test(enabled = false)
	public void test2() {
		System.out.println("----Test 2----");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void test3() {
		System.out.println("----Test 3----");
	}
	
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("----Test 4----");
	}

}
