package co.electrovan.structse.modelo;

public class RolUsuarioTbl implements java.io.Serializable
{

	private Integer idUsuarioRol;
	private UsuarioTbl usuarioTbl;
	private String rol;

	public RolUsuarioTbl()
	{
	}

	public RolUsuarioTbl(UsuarioTbl usuarioTbl, String rol)
	{
		this.usuarioTbl = usuarioTbl;
		this.rol = rol;
	}

	public Integer getIdUsuarioRol()
	{
		return this.idUsuarioRol;
	}

	public void setIdUsuarioRol(Integer idUsuarioRol)
	{
		this.idUsuarioRol = idUsuarioRol;
	}

	public UsuarioTbl getUsuarioTbl()
	{
		return this.usuarioTbl;
	}

	public void setUsuarioTbl(UsuarioTbl usuarioTbl)
	{
		this.usuarioTbl = usuarioTbl;
	}

	public String getRol()
	{
		return this.rol;
	}

	public void setRol(String rol)
	{
		this.rol = rol;
	}

}
