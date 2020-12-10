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
	
	
	public PersonaManager() throws InstanceExceptions{
		String var=leerPropiedad("archivo");
		Class<?> clase;
		try {
			clase = Class.forName(var);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new InstanceExceptions("Error");
		}
		try {
			srv=(ServicioPersona)clase.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceExceptions("Error");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceExceptions("Error");
		}

	}
	
	public void insertarPersona(Persona persona) {
		srv.insertar(persona);
	}
}
