package projetovacina.models;

import javax.persistence.Embeddable;

import projetovacina.tipoenum.TipoEstadosEnum;

@Embeddable
public class Endereco {

	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private TipoEstadosEnum estado;
	
	public Endereco() {
		
	}
	
	public Endereco(String rua, String numero, String bairro, String cidade, TipoEstadosEnum estado) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public TipoEstadosEnum getEstado() {
		return estado;
	}

	public void setEstado(TipoEstadosEnum estado) {
		this.estado = estado;
	}
	
	
}
