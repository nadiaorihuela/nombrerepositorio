package pruebas;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Test_Laboratorio3_E1 {
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		driver= new ChromeDriver();
		//Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver","..\\Drivers\\chromedriver.exe");
		//Ir a url
		
	}
	
	@BeforeTest
	public void irUrl() {
		driver.get("https://www.facebook.com/");
	}
	
	@BeforeClass 
	
	public void maxVentana() {
		driver.manage().window().maximize();
	}
	@Test (enabled=false)
  public void registroUsuario() {
		//Defino variable para espera explicita antes de asignar Elemento
				WebDriverWait myWait = new WebDriverWait(driver, 10);
				
				//Nombre de usuario
				WebElement txtNombre=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("firstname"))));
						txtNombre.sendKeys("Moni");
				//Apellido de usuario
				WebElement txtApe=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='u_0_o']"))));
				txtApe.sendKeys("Argento");
				
				//Email o telefono
				WebElement txtMailTel=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("reg_email__"))));
				txtMailTel.sendKeys("dasdasdasd");
				
				//Contraseña
				WebElement txtContrasena=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("u_0_w"))));
				txtContrasena.sendKeys("12345678");
				
				//Desplegable Mes
				Select dropMes=new Select(myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("month")))));
				dropMes.selectByValue("5");
				
				//Radio Sexo
				WebElement radSex=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[contains(@type,'radio') and @value=1 ]"))));
				radSex.click();
				
				//Boton Registrar
				WebElement btnRegistrar=myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[text()='Registrarte'])[1]"))));
				btnRegistrar.click();
				
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
			
  }
	
	@AfterClass
	public void finPrueba() {
		System.out.println("Fin de prueba");
	}
	
	@AfterTest 
	public void cierreNavegador() {
		driver.quit();
		
	}
	@AfterSuite
	public void finSuite() {
		System.out.println("Fin Suite");
	}
	
}
