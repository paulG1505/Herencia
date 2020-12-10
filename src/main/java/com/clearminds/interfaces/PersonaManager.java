package com.clearminds.interfaces;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.clearminds.model.Persona;

public class PersonaManager {
	ServicioPersona srv;
	String res;
	public  String leerPropiedad(String propiedad) {
		File f=new File("conexion.properties");
//		System.out.println("ruta:"+f.getAbsoluteFile());
		try {

			FileReader reader = new FileReader("config.properties");
			Properties p = new Properties();
			p.load(reader);
			res= (p.getProperty(propiedad));
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
	public PersonaManager() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String var=leerPropiedad("archivo");
		Class<?> clase =Class.forName(var);
		srv=(ServicioPersona)clase.newInstance();

	}
	
	public void insertarPersona(Persona persona) {
		srv.insertar(persona);
	}
}
