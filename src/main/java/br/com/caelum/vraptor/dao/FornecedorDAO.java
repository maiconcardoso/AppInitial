package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.caelum.vraptor.model.Fornecedor;

@RequestScoped
public class FornecedorDAO  extends DAO<Fornecedor>{

	@Inject
	public FornecedorDAO(EntityManager em) {
		super(em, Fornecedor.class);
		
	}
	
	@Deprecated public FornecedorDAO() {this(null);} 

}
