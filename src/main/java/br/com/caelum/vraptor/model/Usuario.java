package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Usuario extends Model{

	@NotEmpty(message = "{Usuario.nomeUsuario.emBranco}") @Size(min = 4, max = 50, message = "{Usuario.nomeUsuario.size}")
	private String nomeUsuario;
	
	@NotEmpty(message = "{Usuario.loginUsuario.emBranco}") @Size(min = 4, max = 20, message = "{Usuario.loginUsuario.size}")
	private String loginUsuario;
	
	@NotEmpty(message = "{Usuario.senhaUsuario.emBranco}") @Size(min = 6, max = 20, message = "{Usuario.senhaUsuario.size}")
	private String senhaUsuario;
	
	@NotEmpty @Email
	private String emailUsuario;
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getLoginUsuario() {
		return loginUsuario;
	}
	
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	
}
