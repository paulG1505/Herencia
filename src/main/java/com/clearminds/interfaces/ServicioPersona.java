package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public interface ServicioPersona {
	public boolean insertar(Persona perona);
	public boolean actualizar(Persona persona);
	public boolean eleiminar (Persona persona);
}
