package co.electrovan.structse.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class UsuarioTbl implements java.io.Serializable
{

	private Integer idUsuario;
	private String login;
	private String clave;
	private byte habilitado;
	private Date fechaAlta;
	private Date fechaBaja;
	private Set rolUsuarioTbls = new HashSet(0);

	public UsuarioTbl()
	{
	}

	public UsuarioTbl(String login, String clave, byte habilitado)
	{
		this.login = login;
		this.clave = clave;
		this.habilitado = habilitado;
	}

	public UsuarioTbl(String login, String clave, byte habilitado, Date fechaAlta, Date fechaBaja, Set rolUsuarioTbls)
	{
		this.login = login;
		this.clave = clave;
		this.habilitado = habilitado;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.rolUsuarioTbls = rolUsuarioTbls;
	}

	public Integer getIdUsuario()
	{
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario)
	{
		this.idUsuario = idUsuario;
	}

	public String getLogin()
	{
		return this.login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getClave()
	{
		return this.clave;
	}

	public void setClave(String clave)
	{
		this.clave = clave;
	}

	public byte getHabilitado()
	{
		return this.habilitado;
	}

	public void setHabilitado(byte habilitado)
	{
		this.habilitado = habilitado;
	}

	public Date getFechaAlta()
	{
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta)
	{
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja()
	{
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja)
	{
		this.fechaBaja = fechaBaja;
	}

	public Set getRolUsuarioTbls()
	{
		return this.rolUsuarioTbls;
	}

	public void setRolUsuarioTbls(Set rolUsuarioTbls)
	{
		this.rolUsuarioTbls = rolUsuarioTbls;
	}

}
