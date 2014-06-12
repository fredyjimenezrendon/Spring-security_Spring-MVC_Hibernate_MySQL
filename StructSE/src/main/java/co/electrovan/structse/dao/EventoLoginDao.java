package co.electrovan.structse.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import co.electrovan.structse.modelo.EventosLoginTbl;

public interface EventoLoginDao
{
	void save(EventosLoginTbl eventosLoginTbl) throws DataAccessException;
	void update(EventosLoginTbl eventosLoginTbl) throws DataAccessException;
	void delete(EventosLoginTbl eventosLoginTbl) throws DataAccessException;
	List<EventosLoginTbl> eventosPorLogin(String login) throws DataAccessException;

}
