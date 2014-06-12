package co.electrovan.structse.dao;

import org.springframework.dao.DataAccessException;

import co.electrovan.structse.modelo.RolUsuarioTbl;

public interface RolUsuarioDao
{
	void save(RolUsuarioTbl rolUsuarioTbl) throws DataAccessException;
	void update(RolUsuarioTbl rolUsuarioTbl) throws DataAccessException;
	void delete(RolUsuarioTbl rolUsuarioTbl) throws DataAccessException;
}
