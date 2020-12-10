package com.clearminds.impl;

import com.clearminds.interfaces.InstanceExceptions;
import com.clearminds.interfaces.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) throws InstanceExceptions {
		// TODO Auto-generated method stub
		PersonaManager per = new PersonaManager();
		try {
			per.insertarPersona(new Persona("paul", "guaman", "121232"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
