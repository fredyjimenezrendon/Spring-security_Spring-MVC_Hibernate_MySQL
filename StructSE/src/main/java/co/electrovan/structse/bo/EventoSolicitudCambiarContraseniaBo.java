package co.electrovan.structse.bo;

import java.util.List;

import co.electrovan.structse.modelo.EventosCambioClaveTbl;

public interface EventoSolicitudCambiarContraseniaBo 
{
	boolean save(EventosCambioClaveTbl eventosCambioClaveTbl);
	List<EventosCambioClaveTbl> eventosPorCambioClave(String claveNueva);// Qué debe ir? ClaveNueva

}
