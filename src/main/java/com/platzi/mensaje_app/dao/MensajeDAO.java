package com.platzi.mensaje_app.dao;

import com.platzi.mensaje_app.Mensajes;

public interface MensajeDAO {

	public void CrearMensajesDB(Mensajes mensaje); 
	public void LeerMensajes();
	public void BorrarMensajesDB(int id_mensaje);
	public void ActualizarMensaje(Mensajes mensaje);
}
