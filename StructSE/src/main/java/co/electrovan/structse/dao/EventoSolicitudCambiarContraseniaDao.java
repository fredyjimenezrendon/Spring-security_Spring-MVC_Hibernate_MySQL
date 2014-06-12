package co.electrovan.structse.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import co.electrovan.structse.modelo.EventosCambioClaveTbl;


public interface EventoSolicitudCambiarContraseniaDao 
{
	void save(EventosCambioClaveTbl eventos_cambio_clave_tbl) throws DataAccessException;
	
	List<EventosCambioClaveTbl> eventosCambioClave(String login) throws DataAccessException;

}
