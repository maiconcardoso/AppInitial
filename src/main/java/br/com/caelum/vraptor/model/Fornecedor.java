package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Fornecedor extends Model{
	@NotEmpty(message = "{Fornecedor.nomeFornecedor.emBranco}" ) @Size(min = 4, max = 60, message = "{Fornecedor.nomeFornecedor.size}")
	private String nomeFornecedor;
	
	@Size(max = 20)
	private String cpfFornecedor;
	
	@Size(max = 60)
	private String enderecoFornecedor;
	
	@Size(max = 8)
	private String cepFornecedor;
	
	@Size(max = 30)
	private String cidadeFornecedor;
	
	@Size(max = 20)
	private String whatsappFornecedor;
	
	@Size(max = 20)
	private String telefoneFornecedor;
	
	@Size(max = 60) @Email
	private String emailFornecedor;
	
	public String getEmailFornecedor() {
		return emailFornecedor;
	}
	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}
	private String informacoesAdFornecedor;
	
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public String getCpfFornecedor() {
		return cpfFornecedor;
	}
	public void setCpfFornecedor(String cpfFornecedor) {
		this.cpfFornecedor = cpfFornecedor;
	}
	public String getEnderecoFornecedor() {
		return enderecoFornecedor;
	}
	public void setEnderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}
	public String getCepFornecedor() {
		return cepFornecedor;
	}
	public void setCepFornecedor(String cepFornecedor) {
		this.cepFornecedor = cepFornecedor;
	}
	public String getCidadeFornecedor() {
		return cidadeFornecedor;
	}
	public void setCidadeFornecedor(String cidadeFornecedor) {
		this.cidadeFornecedor = cidadeFornecedor;
	}
	public String getWhatsappFornecedor() {
		return whatsappFornecedor;
	}
	public void setWhatsappFornecedor(String whatsappFornecedor) {
		this.whatsappFornecedor = whatsappFornecedor;
	}
	public String getTelefoneFornecedor() {
		return telefoneFornecedor;
	}
	public void setTelefoneFornecedor(String telefoneFornecedor) {
		this.telefoneFornecedor = telefoneFornecedor;
	}
	public String getInformacoesAdFornecedor() {
		return informacoesAdFornecedor;
	}
	public void setInformacoesAdFornecedor(String informacoesAdFornecedor) {
		this.informacoesAdFornecedor = informacoesAdFornecedor;
	}
	
}
