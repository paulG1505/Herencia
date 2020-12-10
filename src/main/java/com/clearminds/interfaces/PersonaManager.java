package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public class PersonaManager {
	ServicioPersona srv;
	public PersonaManager() {
		ServicioPersonaBdd srvbbd= new ServicioPersonaBdd();
		srv=srvbbd;
	}
	
	public void insertarPersona(Persona persona) {
		srv.insertar(persona);
	}
}
