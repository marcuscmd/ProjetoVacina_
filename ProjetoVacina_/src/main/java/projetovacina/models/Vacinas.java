package projetovacina.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import projetovacina.tipoenum.TipoVacinaEnum;

@Entity
public class Vacinas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String nome;
	
	private int qnt_dose;
	
	@Enumerated(EnumType.STRING)
	private TipoVacinaEnum tipo;
	
	private String peridoVencimento;
	
	private String descricao;
	
	private boolean inativo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQnt_dose() {
		return qnt_dose;
	}

	public void setQnt_dose(int qnt_dose) {
		this.qnt_dose = qnt_dose;
	}

	public TipoVacinaEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoVacinaEnum tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getPeridoVencimento() {
		return peridoVencimento;
	}

	public void setPeridoVencimento(String peridoVencimento) {
		this.peridoVencimento = peridoVencimento;
	}

	public boolean isInativo() {
		return inativo;
	}

	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}

	
}
