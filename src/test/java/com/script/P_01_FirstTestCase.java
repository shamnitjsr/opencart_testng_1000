package com.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_01_FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		// 1) Launch browser (chrome)
		// ChromeDriver driver=new ChromeDriver();

		// Chrome Browser
		WebDriver driver = new ChromeDriver(); // For chrome browser
		// WebDriver driver=new EdgeDriver(); //For Edge browser
		// WebDriver driver=new FirefoxDriver(); //For Forefox browser
		// ChromiumDriver driver=new ChromeDriver(); //For chrome browser

		// 2) Open URL https://demo.opencart.com/

		driver.get("https://demo.opencart.com/");

		driver.manage().window().maximize();

//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("https://www.flipkart.com/");

//		driver.manage().window().maximize();
//
//		WebDriver driver2 = new ChromeDriver();
//		driver2.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=11885142430230430328&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
//
//		driver.manage().window().maximize();

		// 3) Validate title should be "Your Store"

		String act_title = driver.getTitle();

		System.out.println(act_title);

		if (act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(5000);

		// 4) close browser
		//driver.close();
		driver.quit();

	}

}
