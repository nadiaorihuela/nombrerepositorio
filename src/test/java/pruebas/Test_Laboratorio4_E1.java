package pruebas;

import paginas.paginaInicio;
import paginas.paginaLogin;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utilidades.DatosExcel;
import Utilidades.Screenshots;

public class Test_Laboratorio4_E1 {
	WebDriver driver;
	String driverPath = "..\\EducacionIt\\Drivers\\chromedriver.exe";
	String urlTest = "http://automationpractice.com/index.php";
	String rutaEvidencias = "..\\EducacionIt\\Evidencias";

	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
		// Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver.get(urlTest);
	}

	@Test(priority = 0, description = "Prueba de Registro", dataProvider = "datos login invalido")
	public void irRegistroLogin(String usuario, String clave) throws Exception {
		paginaInicio inicio = new paginaInicio(driver);
		inicio.clickLogin();

		paginaLogin login = new paginaLogin(driver);

		login.inicioSesion(usuario, clave);
		String titulo = login.getTextTitleForm();

		Assert.assertEquals(titulo, "AUTHENTICATION");
		Screenshots.screenshot(rutaEvidencias, "TestRegistroinvalido", driver);

	}

	@DataProvider(name = "datos login invalido")
	public static Object[][] datos() throws Exception {
		String rutaExcel = "C:\\Users\\norihuela.INDRA\\Documents\\Indra\\Capacitacion\\EdIT\\Clase2\\EducacionIt\\EducacionIt\\Recursos\\Datos.xlsx";
		String nombreHoja = "Hoja1";

		Object datosExcel[][] = DatosExcel.leerExcel(rutaExcel, nombreHoja);

		return datosExcel;
	}

	@AfterSuite
	public void close() {
		driver.quit();
	}
}