package Edit.EducacionIt;
import java.sql.Time;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
/*
1-Agregar dependencia en archivo pom.xml -> se puede encontrar en https://selenium.dev/
2-Descargar driver de Selenium para chrome y firefox y ubicar ejecutables en ruta deseada
3-Verificar dependencia Junit en archivo pom.xml
4-Instanciar chrome Driver 
5-setear propiedades de chrome driver
6-Ir a url de prueba: http://newtours.demoaut.com/ 
7-Cerrar navegador
8-Repetir los pasos 4 a 7 pero para navagador Firefox


*/
public class Clase1 {
	//WebDriver d= new ChromeDriver();
	WebDriver d2= new FirefoxDriver();
	@Test
public void login(){
	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	System.setProperty("webdriver.gecko.driver","C:\\workplaces\\Trunk\\EducacionIt\\Recursos\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","C:\\workplaces\\Trunk\\EducacionIt\\Recursos\\chromedriver63.exe");
	//d.get("http://newtours.demoaut.com/");
	d2.get("https://selenium.dev/");
	d2.findElement(By.id("gsc-i-id1")).sendKeys("maven");
	d2.findElement(By.id("gsc-i-id1")).sendKeys(Keys.ENTER);
	
	//d2.quit();
		
}

}
