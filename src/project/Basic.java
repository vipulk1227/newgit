package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

}
