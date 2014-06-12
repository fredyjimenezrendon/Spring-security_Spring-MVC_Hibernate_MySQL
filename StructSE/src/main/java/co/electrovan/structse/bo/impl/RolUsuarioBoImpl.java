package co.electrovan.structse.bo.impl;

import org.apache.log4j.Logger;

import co.electrovan.structse.bo.RolUsuarioBo;
import co.electrovan.structse.dao.RolUsuarioDao;
import co.electrovan.structse.modelo.RolUsuarioTbl;

public class RolUsuarioBoImpl implements RolUsuarioBo
{

	private RolUsuarioDao rolUsuarioDao;
	private static Logger loger = Logger.getRootLogger();
	
	public RolUsuarioDao getRolUsuarioDao()
	{
		return rolUsuarioDao;
	}
	public void setRolUsuarioDao(RolUsuarioDao rolUsuarioDao)
	{
		this.rolUsuarioDao = rolUsuarioDao;
	}
	
	public boolean save(RolUsuarioTbl rolUsuarioTbl)
	{
		// TODO Auto-generated method stub
		return false;
	}
	public boolean update(RolUsuarioTbl rolUsuarioTbl)
	{
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delete(RolUsuarioTbl rolUsuarioTbl)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
