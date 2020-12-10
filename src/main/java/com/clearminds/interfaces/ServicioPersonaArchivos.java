package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona{
	@Override
	public boolean insertar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Insertando persona archivo"+persona);
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("actualizando persona archivo"+persona);
		return true;
	}

	@Override
	public boolean eleiminar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("eliminando persona archivo"+persona);
		return true;
	}
}
