package com.naukri.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");
}
public static WebDriver driver;
FileLib f=new FileLib();

@BeforeTest
public void launchBrowser() throws IOException {
	String browser = f.getPropertyFileData("browser");
	if (browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

	
}


