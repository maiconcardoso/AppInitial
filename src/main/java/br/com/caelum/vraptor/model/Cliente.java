package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cliente extends Model{
	
	@NotEmpty(message = "{Cliente.nomeCliente.emBranco}") @Size(min = 4, max = 60, message = "{Cliente.nomeCliente.size}")
	private String nomeCliente;

	@Size(max = 30) 
	private String cpfCliente;
	
	@Size(max = 30)
	private String cepCliente;
	
	@Size(max = 60)
	private String enderecoCliente;
	
	@Size(max = 40)
	private String cidadeCliente;
	
	@Size(max = 20)
	private String whatsappCliente;
	
	@Size(max = 20)
	private String telefoneCliente;
	
	@Size(max = 50) @Email
	private String emailCliente;
	
	private String informacoesAdCliente;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getInformacoesAdCliente() {
		return informacoesAdCliente;
	}
	public void setInformacoesAdCliente(String informacoesAdCliente) {
		this.informacoesAdCliente = informacoesAdCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getWhatsappCliente() {
		return whatsappCliente;
	}
	public void setWhatsappCliente(String whatsappCliente) {
		this.whatsappCliente = whatsappCliente;
	}
	
	
}
