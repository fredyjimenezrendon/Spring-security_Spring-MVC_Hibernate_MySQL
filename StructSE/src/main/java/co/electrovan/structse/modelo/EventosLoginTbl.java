package co.electrovan.structse.modelo;

import java.util.Date;


public class EventosLoginTbl implements java.io.Serializable
{

	private int idEventoLogin;
	private String login;
	private Date fecha;
	private String observaciones;

	public EventosLoginTbl()
	{
	}

	public EventosLoginTbl(int idEventoLogin, String login, Date fecha, String observaciones)
	{
		this.idEventoLogin = idEventoLogin;
		this.login = login;
		this.fecha = fecha;
		this.observaciones = observaciones;
	}

	public int getIdEventoLogin()
	{
		return this.idEventoLogin;
	}

	public void setIdEventoLogin(int idEventoLogin)
	{
		this.idEventoLogin = idEventoLogin;
	}

	public String getLogin()
	{
		return this.login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public Date getFecha()
	{
		return this.fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public String getObservaciones()
	{
		return this.observaciones;
	}

	public void setObservaciones(String observaciones)
	{
		this.observaciones = observaciones;
	}

}
