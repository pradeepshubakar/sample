package com.naukri.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.naukri.generics.BaseClass1;
import com.naukri.generics.FileLib1;
import com.naukri.generics.webDrivernCommonLib;
import com.naukri.pom.HomePage1;
import com.naukri.pom.LoginPage1;
@Listeners(com.naukri.generics.Listeners.class)
public class UploadResume extends BaseClass1 {
@Test
public void testUploadResume() throws IOException, InterruptedException {
	HomePage1 h=new HomePage1(driver);
	LoginPage1 l=new LoginPage1(driver);
	FileLib1 f=new FileLib1();
	
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
