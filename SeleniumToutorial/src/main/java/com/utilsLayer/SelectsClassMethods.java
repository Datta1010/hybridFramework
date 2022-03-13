package com.utilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;
			
public class SelectsClassMethods  {
	private static Select sel;
	
		public static void selectDropDounValue(WebElement wb ,String value) {
			
			 sel =new Select (wb);
			sel.selectByVisibleText(value);
			
		}
	public static void caputeDroupDounSelectValue(WebElement dpelement ) {
		 sel =new Select (dpelement);
			WebElement wb =sel.getFirstSelectedOption();
			wb.getText();
		
		
	}
	
	
	
	
	
}
