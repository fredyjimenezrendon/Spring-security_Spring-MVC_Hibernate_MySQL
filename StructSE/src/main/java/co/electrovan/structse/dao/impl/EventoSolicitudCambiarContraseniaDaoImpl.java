package co.electrovan.structse.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.electrovan.structse.dao.EventoSolicitudCambiarContraseniaDao;
import co.electrovan.structse.modelo.EventosCambioClaveTbl;

public class EventoSolicitudCambiarContraseniaDaoImpl  extends HibernateDaoSupport implements EventoSolicitudCambiarContraseniaDao 
{

	public void save(EventosCambioClaveTbl eventosCambioClaveTbl) throws DataAccessException 
	{
		getHibernateTemplate().save(eventosCambioClaveTbl);
	}

	public List<EventosCambioClaveTbl> eventosCambioClave(String login) throws DataAccessException 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
