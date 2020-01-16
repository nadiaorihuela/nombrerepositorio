package Edit.EducacionIt;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
/*
 Ejercicio 
1-Agregar dependencia en archivo pom.xml -> se puede encontrar en https://selenium.dev/
2-Descargar driver de Selenium para chrome y firefox y ubicar ejecutables en ruta deseada
3-Verificar dependencia Junit en archivo pom.xml
4-Importar libreria de selenium: import org.openqa.selenium.*; 
5-Instanciar chrome Driver e importar libreria: import org.openqa.selenium.chrome.ChromeDriver
6-setear propiedades de chrome driver
7-Ir a url de prueba: http://newtours.demoaut.com/ 
8-Cerrar navegador
9-Repetir los pasos 4 a 7 pero para navagador Firefox: importar libreria firefox:import org.openqa.selenium.firefox.*;
10-Localizar elemento por ID
11-Enviar datos a elementos con sendkeys
12-Cerrar navegador
13-Modificar script y asignar elemento encontrado a una variable WebElement
14-Agregar una espera antes de cerrar:  import java.util.concurrent.TimeUnit;

*/
public class Clase1 {
	//instanciar Driver de Chrome + importar libreria org.openqa.selenium.chrome.ChromeDriver
	//WebDriver d= new ChromeDriver();
	
	//Instancias Driver de Firefox + importar libreria 
	WebDriver d2= new FirefoxDriver();
	@Test
public void login(){
		
	//Propiedades para ejecutar el driver de Firefox	
	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		
	//Propiedades para Ejecutar el driver de Chrome System.setProperty(		
	System.setProperty("webdriver.gecko.driver","C:\\workplaces\\Trunk\\EducacionIt\\Recursos\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","C:\\workplaces\\Trunk\\EducacionIt\\Recursos\\chromedriver63.exe");
	//d.get("http://newtours.demoaut.com/");
	d2.get("https://selenium.dev/");
	//Sin asignacion de variables
	//d2.findElement(By.id("gsc-i-id1")).sendKeys("maven");
	//d2.findElement(By.id("gsc-i-id1")).sendKeys(Keys.ENTER);
	
	//Con asignacion de elemento a variable
	WebElement textBuscador = d2.findElement(By.id("gsc-i-id1"));
	textBuscador.sendKeys("Maven");
	textBuscador.sendKeys(Keys.ENTER);
	
	//espera implicita antes de cerrar
	d2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//Cerrar el navegador
	d2.quit();
		
}

}
