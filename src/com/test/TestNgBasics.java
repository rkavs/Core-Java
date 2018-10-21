package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	// @BeforeSuite -- setup system property for chrome -- I
	// @BeforeTest--launchBrowser -- II
	// @BeforeClass--login to app -- III

	// @BeforeMethod--enter URL -- IV
	// @Test--google Logo Test
	// @AfterMethod --logout from app

	// @BeforeMethod--enter URL
	// @Test--Google Title Test
	// @AfterMethod --logout from app

	// @BeforeMethod--enter URL
	// @Test--search test
	// @AfterMethod --logout from app
	// @AfterClass-close Browser
	// @AfterTest--deleteAllCookies
	// @AfterSuite--generateTestReport

	// Pre-condition annotations -- starting with @Before
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("@BeforeTest--launchBrowser");
	}

	@BeforeClass // 3
	public void login() {
		System.out.println("@BeforeClass--login to app");
	}

	// @BeforeMethod
	// @Test-1
	// @AfterMethod

	// @BeforeMethod
	// @Test-2
	// @AfterMethod

	// @BeforeMethod
	// @Test-3
	// @AfterMethod

	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("@BeforeMethod--enter URL");
	}

	// test case -- starting with @Test
	@Test // 5
	public void googleTitleTest() {
		System.out.println("@Test--Google Title Test");
	}

	@Test // 5
	public void searchTest() {
		System.out.println("@Test--search test");
	}

	@Test // 5
	public void googleLogoTest() {
		System.out.println("@Test--google Logo Test");
	}

	// Post-condition annotations -- starting with @After
	@AfterMethod // 6
	public void logOut() {
		System.out.println("@AfterMethod --logout from app");
	}

	@AfterClass // 7
	public void closeBrowser() {
		System.out.println("@AfterClass-close Browser");
	}

	@AfterTest // 8
	public void deleteAllCookies() {
		System.out.println("@AfterTest--deleteAllCookies");
	}

	@AfterSuite // 9
	public void generateTestReport() {
		System.out.println("@AfterSuite--generateTestReport");
	}

}
