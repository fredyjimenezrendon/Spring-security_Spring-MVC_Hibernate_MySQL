package co.electrovan.structse.bo.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import co.electrovan.structse.bo.EventoLoginBo;
import co.electrovan.structse.dao.EventoLoginDao;
import co.electrovan.structse.modelo.EventosLoginTbl;

public class EventoLoginBoImpl implements EventoLoginBo
{

	private EventoLoginDao eventoLoginDao;
	private static Logger loger = Logger.getRootLogger();

	public EventoLoginDao getEventoLoginDao()
	{
		return eventoLoginDao;
	}

	public void setEventoLoginDao(EventoLoginDao eventoLoginDao)
	{
		this.eventoLoginDao = eventoLoginDao;
	}

	public boolean save(EventosLoginTbl eventosLoginTbl)
	{
		try
		{
			eventoLoginDao.save(eventosLoginTbl);
			return true;
		}
		catch(DataAccessException e)
		{
			loger.error("No se puedo realizar la transacción: ", e);
			return false;
		}
		
	}

	public boolean update(EventosLoginTbl eventosLoginTbl)
	{
		// TODO Auto-generated method stub
		return false;

	}

	public boolean delete(EventosLoginTbl eventosLoginTbl)
	{
		// TODO Auto-generated method stub
		return false;

	}

	public List<EventosLoginTbl> eventosPorLogin(String login)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
