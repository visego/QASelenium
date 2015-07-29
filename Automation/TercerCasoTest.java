package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
 
import org.openqa.selenium.firefox.FirefoxDriver;

public class TercerCasoTest {


		public static void main(String[] args) {
			
			 WebDriver driver = new FirefoxDriver();
			 
			 long time_start, time_end;
			 
			 String web = "http://www.amazon.es";
			 
			 System.out.println("Entrando a: " + web);
			 
			 time_start = System.currentTimeMillis();
			 driver.get(web);
			 
			 System.out.println("Carga de: " + web + "finalizada");
			 
			 //Maximizamos la web
			 driver.manage().window().maximize();
			 
			 //Pulsamos el botón para logarnos en amazon
			 driver.findElement(By.id("nav-link-yourAccount")).click();
			 
			 System.out.println("Botón Identificarse pulsado");
			 
			//Buscamos el elemento para introducir el usuario
			 WebElement element;
			 element = driver.findElement(By.id("ap_email"));
			 element.sendKeys("visego@gmail.com");
			 
			 System.out.println("Email introducido");
			 
			 //Buscamos el elemento para introducir la  contraseña
			 WebElement element2;
			 element2 = driver.findElement(By.id("ap_password"));
			 element2.sendKeys("Kuuz0nQvoRp9zcg72Nh8");
			 
			 System.out.println("Contraseña introducida");
			 
			 //Pulsamos botón para logarnos
			 
			 driver.findElement(By.id("signInSubmit-input")).click();
			 
			 System.out.println("Login completado en: " + web);
			 
			 time_end = System.currentTimeMillis();
			 double  time_total= time_end - time_start;
			 System.out.println("the task has taken "+ (time_total) +" milliseconds");
			 
			 double time_total_s = time_total/1000;
			 System.out.println("the task has taken "+ (time_total_s) +" seconds");
			
			// TODO Auto-generated method stub

		}

	}

