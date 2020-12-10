package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public class ServicioPersonaBdd implements ServicioPersona{

	@Override
	public boolean insertar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Insertando persona"+persona);
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("actualizando persona"+persona);
		return true;
	}

	@Override
	public boolean eleiminar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("eliminando persona"+persona);
		return true;
	}
	
}
