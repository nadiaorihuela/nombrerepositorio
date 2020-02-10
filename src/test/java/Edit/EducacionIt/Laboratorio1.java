package Edit.EducacionIt;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;



/* Ejercicio 
1-Crear un proyecto Maven en Eclipse.
2-Agregar dependencia en archivo pom.xml -> se puede encontrar en https://selenium.dev/
3-Descargar driver de Selenium para chrome y firefox y ubicar ejecutables en ruta deseada
4-Verificar dependencia Junit en archivo pom.xml

5-Crear una clase estandar.
Importar libreria de selenium: import org.openqa.selenium.*; 
Importar libreria junit: import org.junit.*;
importar libreria: import org.openqa.selenium.chrome.ChromeDriver;
-Instanciar chrome Driver
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
public class Laboratorio1 {
	 
	@Ignore
	public void lab1(){
		//instanciar Driver de Chrome + importar libreria org.openqa.selenium.chrome.ChromeDriver
		WebDriver d= new ChromeDriver();
		//Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver","C:\\workplaces\\Trunk\\EducacionIt\\Drivers\\chromedriver63.exe");
		//Ir a url
		d.get("https://selenium.dev/");
		//Cerrar navegador
		d.quit();
	}
	@Test
	public void lab2(){
	
		//Instancias Driver de Firefox + importar libreria	
		
		WebDriver d= new FirefoxDriver();
		
		//Propiedades para ejecutar el driver de Firefox	
		
		System.setProperty("webdriver.gecko.driver","C:\\workplaces\\Trunk\\EducacionIt\\Drivers\\geckodriver.exe");
		
		d.get("https://selenium.dev/");
		
		d.manage().window().maximize();
		//Localizando elementos
		d.findElement(By.id("gsc-i-id1")).sendKeys("maven");
		d.findElement(By.id("gsc-i-id1")).sendKeys(Keys.ENTER);
		
		
		//Cerrar el navegador
		d.quit();
	}
	
	@Test
	public void lab3(){

		WebDriver d= new ChromeDriver();
		//Propiedades para Ejecutar el driver de Chrome.
		System.setProperty("webdriver.chrome.driver","C:\\workplaces\\Trunk\\EducacionIt\\Drivers\\chromedriver63.exe");
		//Ir a url
		d.get("https://selenium.dev/");
		
		//Con asignacion de elemento a variable
		WebElement textBuscador = d.findElement(By.id("gsc-i-id1"));
		textBuscador.sendKeys("Maven");
		textBuscador.sendKeys(Keys.ENTER);
		
		
		//Cerrar navegador
		d.quit();
	}
		
}


