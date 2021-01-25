package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Servico extends Model{

	@NotEmpty(message = "{Servico.nomeServico.emBranco}") @Size(min=4, max=60, message="{Servico.nomeServico.size}")
	private String nomeServico;
	
	private Integer valorServico;

	private Integer qtdServico;
	
	@Size(max = 60)
	private String marcaMotorServico;
	
	@Size(max = 60)
	private String motorCarroServico;
	
	public String getMotorCarroServico() {
		return motorCarroServico;
	}
	public void setMotorCarroServico(String motorCarroServico) {
		this.motorCarroServico = motorCarroServico;
	}
	private String informacoesAdServico;
	
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public Integer getValorServico() {
		return valorServico;
	}
	public void setValorServico(Integer valorServico) {
		this.valorServico = valorServico;
	}
	public Integer getQtdServico() {
		return qtdServico;
	}
	public void setQtdServico(Integer qtdServico) {
		this.qtdServico = qtdServico;
	}
	public String getMarcaMotorServico() {
		return marcaMotorServico;
	}
	public void setMarcaMotorServico(String marcaMotorServico) {
		this.marcaMotorServico = marcaMotorServico;
	}
	public String getInformacoesAdServico() {
		return informacoesAdServico;
	}
	public void setInformacoesAdServico(String informacoesAdServico) {
		this.informacoesAdServico = informacoesAdServico;
	}
	
	
}
