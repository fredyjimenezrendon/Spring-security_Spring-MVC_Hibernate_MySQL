package co.electrovan.structse.bo.impl;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import co.electrovan.structse.bo.UsuarioBo;
import co.electrovan.structse.dao.UsuarioDao;
import co.electrovan.structse.modelo.UsuarioTbl;

public class UsuarioBoImpl implements UsuarioBo
{

	private UsuarioDao usuarioDao;
	private static Logger loger = Logger.getRootLogger();
	
	public UsuarioDao getUsuarioDao()
	{
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao)
	{
		this.usuarioDao = usuarioDao;
	}
	
	public boolean save(UsuarioTbl usuarioTbl)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(UsuarioTbl usuarioTbl)
	{
		try
		{
			usuarioDao.update(usuarioTbl);
			return true;
		}
		catch(DataAccessException e)
		{
			loger.error("No se puedo realizar la transacción: ", e);
			return false;
		}
	}

	public boolean delete(UsuarioTbl usuarioTbl)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
