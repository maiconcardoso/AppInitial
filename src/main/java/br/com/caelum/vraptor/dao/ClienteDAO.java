package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Cliente;

@RequestScoped
public class ClienteDAO extends DAO<Cliente>{
	
	@Inject
	public ClienteDAO(EntityManager em) {
		super(em, Cliente.class);
	}
	
	@Deprecated public ClienteDAO() {this(null);}
}
