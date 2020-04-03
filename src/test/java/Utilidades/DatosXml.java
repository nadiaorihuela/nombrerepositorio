package Utilidades;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DatosXml {
	public static void data() throws Exception {
	File file = new File("C:\\EducacionIt\\Recursos\\datos.xml");
	FileInputStream inputStream = new FileInputStream(file);
	
	// Creo una instancia de DocumentBuilderFactory
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	// Creo un documentBuilder
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document document =builder.parse(file);
   	document.getDocumentElement().normalize();
   
   	System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
 
   	NodeList listaEmpleados = document.getElementsByTagName("empleado");
    
   	for (int temp = 0; temp < listaEmpleados.getLength(); temp++) {
        Node nodo = listaEmpleados.item(temp);
        System.out.println("Elemento:" + nodo.getNodeName());
        if (nodo.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nodo;
            System.out.println("id: " + element.getAttribute("id"));
            System.out.println("Nombre: " + element.getElementsByTagName("nombre").item(0).getTextContent());
            System.out.println("username: " + element.getElementsByTagName("username").item(0).getTextContent());
            System.out.println("password: " + element.getElementsByTagName("password").item(0).getTextContent());
        }
    }

	}
}