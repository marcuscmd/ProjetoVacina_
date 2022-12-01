package projetovacina.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FornecedorVacina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Fornecedor fornecedor;
	
	@ManyToOne
	private Vacinas vacinas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Vacinas getVacinas() {
		return vacinas;
	}

	public void setVacinas(Vacinas vacinas) {
		this.vacinas = vacinas;
	}
	
	

}
