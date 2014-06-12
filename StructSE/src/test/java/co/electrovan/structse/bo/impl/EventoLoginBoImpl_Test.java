package co.electrovan.structse.bo.impl;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.electrovan.structse.bo.EventoLoginBo;
import co.electrovan.structse.modelo.EventosLoginTbl;

public class EventoLoginBoImpl_Test
{

	@Test
	public void persistirEventoLogin()
	{
		EventosLoginTbl eventoLogin = new EventosLoginTbl();
		eventoLogin.setLogin("prueba");
		eventoLogin.setFecha(new Date());
		eventoLogin.setObservaciones("Ok");

		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		EventoLoginBo eventoLoginBo = (EventoLoginBo) appContext.getBean("EventoLoginBo");
		boolean guardo = eventoLoginBo.save(eventoLogin);
		
		Assert.assertTrue(guardo);

	}

}
