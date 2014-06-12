package co.electrovan.structse.bo;

import java.util.List;

import co.electrovan.structse.modelo.EventosLoginTbl;

public interface EventoLoginBo
{
	
	boolean save(EventosLoginTbl eventosLoginTbl);
	boolean update(EventosLoginTbl eventosLoginTbl);
	boolean delete(EventosLoginTbl eventosLoginTbl);
	List<EventosLoginTbl> eventosPorLogin(String login);

}
