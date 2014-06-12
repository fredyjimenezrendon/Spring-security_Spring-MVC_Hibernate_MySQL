package co.electrovan.structse.dao.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.electrovan.structse.dao.UsuarioDao;
import co.electrovan.structse.modelo.UsuarioTbl;

public class UsuarioDaoImpl extends HibernateDaoSupport implements UsuarioDao
{

	public void save(UsuarioTbl usuarioTbl) throws DataAccessException
	{
		// TODO Auto-generated method stub

	}

	public void update(UsuarioTbl usuarioTbl) throws DataAccessException
	{
		getHibernateTemplate().update(usuarioTbl);
	}

	public void delete(UsuarioTbl usuarioTbl) throws DataAccessException
	{
		// TODO Auto-generated method stub

	}

}
