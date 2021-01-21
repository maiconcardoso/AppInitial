package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.UsuarioDAO;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.validator.Validator;

@Controller
@Path("login")
public class LoginController {

	@Get("")
	public void login () {}
	
	@Inject EntityManager em;
	@Inject Result result;
	@Inject UsuarioDAO usuarioDao;
	@Inject Validator validador;
	
	@Post("logarusuario")
	public void logarUsuario(@Valid Usuario user) {
		
		//validando
		validador.onErrorRedirectTo(this).login();
		
		//logando usuario
		usuarioDao.selectPorId(user);
		
		//redirencionando
		result.redirectTo(IndexController.class).index();
	}
}
