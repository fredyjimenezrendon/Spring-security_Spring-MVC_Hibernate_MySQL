package co.electrovan.structse.dao;

import org.springframework.dao.DataAccessException;

import co.electrovan.structse.modelo.UsuarioTbl;

public interface UsuarioDao
{
	void save(UsuarioTbl usuarioTbl) throws DataAccessException;
	void update(UsuarioTbl usuarioTbl) throws DataAccessException;
	void delete(UsuarioTbl usuarioTbl) throws DataAccessException;
}
