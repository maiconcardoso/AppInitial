package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.PecasDAO;
import br.com.caelum.vraptor.model.Pecas;
import br.com.caelum.vraptor.validator.Validator;

@Controller
@Path("cadastropecas")
public class CadastropecasController {
	
	@Get("")
	public void cadastropecas() {}

	@Inject Result resultPecas;
	@Inject PecasDAO pecasDao;
	@Inject Validator validadorPecas;
	
	@Post("salvapecas")
	public void salvapecas(@Valid Pecas pecas) {
		//valido cadastro de pecas
		validadorPecas.onErrorRedirectTo(this).cadastropecas();
		
		//salvado cadastro de pecas
		pecasDao.insertOrUpdate(pecas);
		
		//redirecionando pagina
		resultPecas.redirectTo(CadastropecasController.class).cadastropecas();
		
	}
}
