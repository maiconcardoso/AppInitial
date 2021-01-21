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
@Path("register")
public class RegisterController {

	@Get("")
	public void register() {}
	
	@Inject EntityManager em;
	@Inject Result result;
	@Inject UsuarioDAO usuarioDao;
	@Inject Validator validador;
	
	
	@Post("salvausuario")
	public void salvaUsuario(@Valid Usuario user) {
		
		//validando usuário
		validador.onErrorRedirectTo(this).register();
		
		//salvando usuario
		usuarioDao.insertOrUpdate(user);
		
		//redirecionando para tela de login
		result.redirectTo(LoginController.class).login();
	}
}
