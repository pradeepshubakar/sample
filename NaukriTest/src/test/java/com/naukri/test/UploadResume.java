package com.naukri.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.naukri.generics.BaseClass;
import com.naukri.generics.FileLib;
import com.naukri.generics.webDrivernCommonLib;
import com.naukri.pom.HomePage;
import com.naukri.pom.LoginPage;

public class UploadResume extends BaseClass {
@Test
public void testUploadResume() throws IOException, InterruptedException {
	HomePage h=new HomePage(driver);
	LoginPage l=new LoginPage(driver);
	FileLib f=new FileLib();
	
	webDrivernCommonLib w=new webDrivernCommonLib();
	driver.get(f.getPropertyFileData("url"));
	l.clickLoginLink();
	l.getUserNameTbx().sendKeys(f.getPropertyFileData("username"));
	l.getPasswordTbx().sendKeys(f.getPropertyFileData("password"));
	l.clickLoginButton();
	h.clickNameLink();
	h.clickUpdateLink();
	File relPath=new File("./src/test/resources/data/pradeep resume .docx");
	String absPath = relPath.getAbsolutePath();
	h.getAttachCv().sendKeys(absPath);
	Thread.sleep(3000);
	w.actionsMoveToElement(driver.findElement(By.xpath("//div[.='My Naukri']")));
	h.clickOnLogout();
	driver.quit();
	
}

}
