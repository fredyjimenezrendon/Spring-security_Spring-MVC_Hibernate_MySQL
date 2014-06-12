package co.electrovan.structse.bo;

import co.electrovan.structse.modelo.RolUsuarioTbl;

public interface RolUsuarioBo
{
	boolean save(RolUsuarioTbl rolUsuarioTbl);
	boolean update(RolUsuarioTbl rolUsuarioTbl);
	boolean delete(RolUsuarioTbl rolUsuarioTbl);

}
