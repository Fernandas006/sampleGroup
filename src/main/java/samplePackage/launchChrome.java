package samplePackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("//span[@class='hidden-xs hidden-sm hidden-md' and contains(text(),'Currency')]")).click();
		//driver.findElement(By.xpath("//button[@data-toggle='dropdown' and @class='btn btn-link dropdown-toggle']")).click();
		//driver.findElement(By.cssSelector("#form-currency button[class='btn btn-link dropdown-toggle']")).click();
		//driver.findElement(By.cssSelector("#top-links i[class='fa fa-phone']")).click();
		}

	}

