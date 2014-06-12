package co.electrovan.structse.bo.impl;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.electrovan.structse.bo.UsuarioBo;
import co.electrovan.structse.modelo.UsuarioTbl;

public class Usuario_Test
{
	
	@Test
	public void ActualizarContraseñaUsuarioMario()
	{
		UsuarioTbl usuario = new UsuarioTbl();
		usuario.setIdUsuario(2);
		usuario.setLogin("mario.mono");
		usuario.setHabilitado((byte)1);
		usuario.setClave("nuevaClave");


		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		UsuarioBo usuarioBo = (UsuarioBo) appContext.getBean("UsuarioBo");
		boolean guardo = usuarioBo.update(usuario);
		
		Assert.assertTrue(guardo);

	}

}
