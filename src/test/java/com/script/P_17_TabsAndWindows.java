package com.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_17_TabsAndWindows {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		//Selenium4.x
		//driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://orangehrm.com/");
		
		driver.quit();
		
	}

}
