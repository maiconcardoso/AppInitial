package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.FornecedorDAO;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.model.Fornecedor;
import br.com.caelum.vraptor.validator.Validator;

@Controller
@Path("cadastrofornecedor")
public class CadastrofornecedorController {
	
	@Get("")
	public void cadastrofornecedor() {}

	@Inject Result resultFornecedor;
	@Inject FornecedorDAO fornecedorDAO;
	@Inject Validator validadorFornecedor;
	
	@IncludeParameters
	@Post("salvafornecedor")
	public void salvafornecedor(@Valid Fornecedor fornecedor) {
		
		//validar fornecedor
		validadorFornecedor.onErrorRedirectTo(this).cadastrofornecedor();
		
		//salvando fornecedor
		fornecedorDAO.insertOrUpdate(fornecedor);
		
		//redirencionando para tela de fornecedor
		resultFornecedor.redirectTo(CadastrofornecedorController.class).cadastrofornecedor();
	}
}
