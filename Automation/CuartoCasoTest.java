package Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CuartoCasoTest {

		public static void main(String args[]) throws InterruptedException
		{
		       System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
	           WebDriver driver=new ChromeDriver(); 
			   driver.get("http://www.bbits.es/");	
			   
			//Maximizamos la web
			   driver.manage().window().maximize();
			
			   
			//Generamos una alerta
			   JavascriptExecutor javascript = (JavascriptExecutor) driver;
			   javascript.executeScript("alert('Test Case Execution Is started Now..');");
			   Thread.sleep(2000);
			   driver.switchTo().alert().accept();
			   
			   String title = driver.getTitle();
			   System.out.println(title);
			   String DomainUsingJS=(String)javascript.executeScript("return document.domain");  
			   System.out.println("My Current URL Is  : "+DomainUsingJS);
		}
}
