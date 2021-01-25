package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Pecas;

@RequestScoped
public class PecasDAO  extends DAO<Pecas>{

	@Inject
	public PecasDAO(EntityManager em) {
		super(em, Pecas.class);
	}
	
	@Deprecated public PecasDAO(){this(null);}
 
}
