package co.electrovan.structse.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.electrovan.structse.dao.EventoLoginDao;
import co.electrovan.structse.modelo.EventosLoginTbl;

public class EventoLoginDaoImpl extends HibernateDaoSupport implements EventoLoginDao
{

	public void save(EventosLoginTbl eventosLoginTbl) throws DataAccessException
	{
		
		getHibernateTemplate().save(eventosLoginTbl);

	}

	public void update(EventosLoginTbl eventosLoginTbl) throws DataAccessException
	{
		// TODO Auto-generated method stub

	}

	public void delete(EventosLoginTbl eventosLoginTbl) throws DataAccessException
	{
		// TODO Auto-generated method stub

	}

	public List<EventosLoginTbl> eventosPorLogin(String login) throws DataAccessException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
