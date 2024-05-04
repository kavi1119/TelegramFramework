package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class register {
	@Test(groups = "FT")

	public void register_001() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	System.out.println("FT");
	driver.quit();
	}
	}

