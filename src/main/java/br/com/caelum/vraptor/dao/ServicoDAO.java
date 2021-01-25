package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Servico;

@RequestScoped
public class ServicoDAO  extends DAO<Servico>{

	@Inject
	public ServicoDAO(EntityManager em) {
		super(em, Servico.class);
		
	}
	
	@Deprecated public ServicoDAO() {this(null);}

}
