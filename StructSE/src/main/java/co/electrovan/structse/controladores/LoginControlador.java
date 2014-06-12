package co.electrovan.structse.controladores;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.electrovan.structse.bo.EventoLoginBo;
import co.electrovan.structse.modelo.EventosLoginTbl;

@Controller
public class LoginControlador
{

	@RequestMapping(value = "/ingreso")
	public ModelAndView adminPage()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("login");

		return model;

	}

	@RequestMapping(value = "/inicio")
	public ModelAndView paginaInicio()
	{

		//Optenemos el usuario que se logeo
		User springUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		//Modelo
		EventosLoginTbl eventoLogin = new EventosLoginTbl();
		eventoLogin.setLogin(springUser.getUsername());
		eventoLogin.setFecha(new Date());
		eventoLogin.setObservaciones("Ingreso ok");

		//Usamos el BO que por dentro tiene su propio DAO para persistir el modelo
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		EventoLoginBo eventoLoginBo = (EventoLoginBo) appContext.getBean("EventoLoginBo");
		eventoLoginBo.save(eventoLogin);

		//Mandamos  a la vista
		ModelAndView model = new ModelAndView();
		model.addObject("mensaje", "holaMundo");
		model.setViewName("bienvenido");
		return model;
	}

	@RequestMapping(value = "/loginError")
	public ModelAndView paginaErrorLogin(@RequestParam(value = "error", required = false) String error)
	{
		System.out.println(error);

		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}

}
