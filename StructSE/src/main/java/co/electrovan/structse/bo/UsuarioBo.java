package co.electrovan.structse.bo;

import co.electrovan.structse.modelo.UsuarioTbl;

public interface UsuarioBo
{
	boolean save(UsuarioTbl usuarioTbl);
	boolean update(UsuarioTbl usuarioTbl);
	boolean delete(UsuarioTbl usuarioTbl);

}
