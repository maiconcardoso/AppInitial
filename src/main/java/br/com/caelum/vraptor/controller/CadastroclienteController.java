package br.com.caelum.vraptor.controller;
import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.ClienteDAO;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.model.Cliente;
import br.com.caelum.vraptor.validator.Validator;

@Controller
@Path("cadastrocliente")
public class CadastroclienteController {

	@Get("")
	public void cadastrocliente() {	}
	
	@Inject Result resultCliente;
	@Inject ClienteDAO clienteDAO;
	@Inject Validator validadorCliente;
	
	@IncludeParameters
	@Post("salvacliente")
	public void salvacliente(@Valid Cliente cliente) {
		
		//validando cliente
		validadorCliente.onErrorRedirectTo(this).cadastrocliente();
				
		//salvando cliente
		clienteDAO.insert(cliente);
				
		//redirecionando para tela de cadastro cliente
		resultCliente.redirectTo(CadastroclienteController.class).cadastrocliente();
	}
}
