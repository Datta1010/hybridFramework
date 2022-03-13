package com.utilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class AcionClass extends BaseClass{
	public static Actions act;
	
	public static void mouseOnElement(WebElement wb) {
	 act = new Actions(driver);
		act.moveToElement(wb).build().perform();
		}
	public static void clickOnElement(WebElement wb) {
		act.click(wb).build().perform();
	}
	public static void dragDropElement(WebElement scr , WebElement target) {
		act.dragAndDrop(scr, target).build().perform();
	}
	public static void rightClick(WebElement wb) {
		act.contextClick(wb).build().perform();
	}
	
	public static void doubleClick(WebElement wb) {
		act.doubleClick(wb).build().perform();
	}
	
	public static void dropandhold(WebElement wb) {
		act.release(wb);
	}
	
	
	
	
}
