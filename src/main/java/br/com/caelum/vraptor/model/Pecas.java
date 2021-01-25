package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Pecas extends Model{

	@NotEmpty(message = "{Pecas.nomePeca.emBranco}") @Size(min=4, max=60, message="{Pecas.nomePeca.size}")
	private String nomePeca;
	
	@Size(max = 30)
	private String codPeca;
	
	@Size(max = 60)
	private String motorPeca;
	
	@Size(max = 60)
	private String marcaPeca;
	
	private Integer qtdPeca;
	
	private Integer valorPeca;
	
	private String informacoesAdPeca;
	
	public String getNomePeca() {
		return nomePeca;
	}
	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}
	public String getCodPeca() {
		return codPeca;
	}
	public void setCodPeca(String codPeca) {
		this.codPeca = codPeca;
	}
	public String getMotorPeca() {
		return motorPeca;
	}
	public void setMotorPeca(String motorPeca) {
		this.motorPeca = motorPeca;
	}
	public String getMarcaPeca() {
		return marcaPeca;
	}
	public void setMarcaPeca(String marcaPeca) {
		this.marcaPeca = marcaPeca;
	}
	public Integer getQtdPeca() {
		return qtdPeca;
	}
	public void setQtdPeca(Integer qtdPeca) {
		this.qtdPeca = qtdPeca;
	}
	public Integer getValorPeca() {
		return valorPeca;
	}
	public void setValorPeca(Integer valorPeca) {
		this.valorPeca = valorPeca;
	}
	public String getInformacoesAdPeca() {
		return informacoesAdPeca;
	}
	public void setInformacoesAdPeca(String informacoesAdPeca) {
		this.informacoesAdPeca = informacoesAdPeca;
	}
	
	
	
	
}
