package pruebas;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import paginas.paginaInicio;
import paginas.paginaLogin;


public class Test_Laboratorio3_E2 {
	WebDriver driver;
	String driverPath = "..\\EducacionIt\\Drivers\\chromedriver.exe";
	String urlTest ="http://automationpractice.com/index.php";
	
	@BeforeSuite 
	public void setUp() {
		driver= new ChromeDriver();
		//Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver.get(urlTest);
	}
	
	@Test (priority=0, description="Prueba de Registro")
  public void irRegistroLogin()  {
		paginaInicio inicio= new paginaInicio(driver);
		inicio.clickLogin();
		
		paginaLogin login=new paginaLogin(driver);
		String titulo=login.getTextTitleForm();
		
		Assert.assertEquals(titulo, "AUTHENTICATION");
	
		
  }
	@Test (priority=1)
	public void crearCuentaInvalida() throws IOException {
		paginaLogin login=new paginaLogin(driver);
		login.sendKeysEmail("dasdadas");
		login.clickCreate();
		String titulo=login.getTextTitleForm();
		
		Assert.assertEquals(titulo, "AUTHENTICATION");
		
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen,new File("..\\EducacionIt\\Evidencias\\Test.png"));


		
	}
}
