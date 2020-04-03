package pruebas;

import org.testng.annotations.Test;

import Utilidades.DatosXml;

import org.testng.annotations.DataProvider;

public class NewTest {
  @Test
  public void f() throws Exception {
	  
	  DatosXml.data();
	  
  }

  @DataProvider
  public Object[][] dp() {
    Object[][] datos=new Object[2][2];
    datos[0][0]="usuario";
    datos [0][1]="cont";
    
	  return datos;
    
  }
}
