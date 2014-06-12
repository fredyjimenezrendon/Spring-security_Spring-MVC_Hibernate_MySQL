package co.electrovan.structse.bo.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import co.electrovan.structse.bo.EventoSolicitudCambiarContraseniaBo;
import co.electrovan.structse.dao.EventoSolicitudCambiarContraseniaDao;
import co.electrovan.structse.modelo.EventosCambioClaveTbl;

public class EventoSolicitudCambiarContraseniaBoImpl implements	EventoSolicitudCambiarContraseniaBo 
{

	private EventoSolicitudCambiarContraseniaDao eventoSolicitudCambiarContraseniaDao;
	private static Logger loger = Logger.getRootLogger();
	
	
	
	public EventoSolicitudCambiarContraseniaDao getEventoSolicitudCambiarContraseniaDao()
	{
		return eventoSolicitudCambiarContraseniaDao;
	}

	public void setEventoSolicitudCambiarContraseniaDao(EventoSolicitudCambiarContraseniaDao eventoSolicitudCambiarContraseniaDao)
	{
		this.eventoSolicitudCambiarContraseniaDao = eventoSolicitudCambiarContraseniaDao;
	}

	public boolean save(EventosCambioClaveTbl eventosCambioClaveTbl) 
	{
		try
		{
			eventoSolicitudCambiarContraseniaDao.save(eventosCambioClaveTbl);
			return true;
		}
		catch(DataAccessException e)
		{
			loger.error("No se puedo realizar la transacción: ", e);
			return false;
		}
	
	}

	public List<EventosCambioClaveTbl> eventosPorCambioClave(String claveNueva) {
		// TODO Auto-generated method stub
		return null;
	}

}
