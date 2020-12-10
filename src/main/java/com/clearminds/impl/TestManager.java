package com.clearminds.impl;

import com.clearminds.interfaces.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		PersonaManager per = new PersonaManager();
		per.insertarPersona(new Persona("paul", "guaman", "121232"));
	}

}
