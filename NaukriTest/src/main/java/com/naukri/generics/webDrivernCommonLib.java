package com.naukri.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class webDrivernCommonLib extends BaseClass1 {
public Actions a=new Actions(driver);
	public void actionsMoveToElement(WebElement element) {
		
		a.moveToElement(element).perform();
	}
}
