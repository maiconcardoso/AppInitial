package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.ServicoDAO;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.model.Servico;
import br.com.caelum.vraptor.validator.Validator;

@Controller
@Path("cadastroservicos")
public class CadastroservicosController {

	@Get("")
	public void cadastroservicos() {}
	
	@Inject Result resultServico;
	@Inject Validator validadorServico;
	@Inject ServicoDAO servicoDAO;
	
	@Post("salvaservico") 
	@IncludeParameters
	public void salvaservico(@Valid Servico servico) {
		
		//validar servico
		 validadorServico.onErrorRedirectTo(this).cadastroservicos();
		
		//salvar servico
	    servicoDAO.insertOrUpdate(servico);	
		
		//redirecionar página
		resultServico.redirectTo(CadastroservicosController.class).cadastroservicos();
		
	}
}
