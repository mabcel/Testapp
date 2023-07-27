package com;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DemoTest {

	public static void main(String[] args) {
		// We need to load the driver for browser.
		//String key ="webdriver.driverName.driver";
		//String key  = "web.chrome.driver";
		//String value ="C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\chromedriver_win32\\chromedriver.exe";
		// Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "C:\\\\JavaFSD\\\\Repository\\\\Testapp\\\\Java Phase 5\\\\chromedriver_win32\\\\chromedriver.exe");
		// Edge Browser 
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\edgedriver_win64\\msedgedriver.exe");
		System.out.println("Set driver property");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		//EdgeDriver driver = new EdgeDriver();
		driver.get("\"file:///C:/JavaFSD/Repository/Testapp/Java%20Phase%205/Selenium%20Programs/SeleniumDemoApp/index.html");
		
//		String title = driver.getTitle();
//		String url = driver.getCurrentUrl();
//		String sourceCode = driver.getPageSource();
//		System.out.println(url);
//		System.out.println(title);
//		System.out.println(sourceCode);
		WebElement h2TagRef = driver.findElement(By.tagName("h2"));
		System.out.println(h2TagRef.getText());
		
		WebElement pTagRef = driver.findElement(By.tagName("h2"));
		System.out.println(pTagRef.getText());
		
		WebElement divTagRef = driver.findElement(By.tagName("h2"));
		System.out.println(divTagRef.getText());
		
		List<WebElement> listOfPTag	 = driver.findElements(By.tagName("p"));
		Iterator<WebElement> ii = listOfPTag.iterator();
		while(ii.hasNext()) {
			WebElement we = ii.next();
			System.out.println(we.getText());
		
		driver.close();
	}

}
