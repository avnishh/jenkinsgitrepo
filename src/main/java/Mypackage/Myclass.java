package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Myclass {
	
		public void methods() {
	    //System.setProperty("webdriver.chrome.driver","E:\\Avnish\\auto\\Coding\\Eclipse_workspace\\chromedriver\\chromedriver.exe");
			
			ChromeDriverManager.getInstance().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");	
			String url = driver.getCurrentUrl();
			System.out.println(url);

			
			
			

		}

	}



