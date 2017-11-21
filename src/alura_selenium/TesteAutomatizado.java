package alura_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {
	
	
	public static void main (String[] args) {
	
	FirefoxDriver driver;
		
	// por ser uma nova versão preciso setar o webdriver
	// System.setProperty("webdriver.firefox.marionette", "C:\\Users\\12129\\OneDrive - Underwriters Laboratories\\11.Test Automation\\Selinium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\afilipem\\Documents\\Instaladores\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	
	// acessa o site do google
	driver.get("http://www.google.com.br/");
	
	// digita no campo com nome "q" do google
	WebElement campoDeTexto = driver.findElement(By.name("q"));
	campoDeTexto.sendKeys("Caelum");
	
	// submete o form
	campoDeTexto.submit();
	
/*	public static void main(String[] args) {
		
		TesteAutomatizado myObj = new TesteAutomatizado();
		myObj.invokeBrowser();

	}*/

	
	}
}
