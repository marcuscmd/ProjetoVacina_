package projetovacina.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "rua", column = @Column(name="endereco_rua")),
		@AttributeOverride(name = "numero", column = @Column(name="endereco_numero")),
		@AttributeOverride(name = "bairro", column = @Column(name="endereco_bairro")),
		@AttributeOverride(name = "cidade", column = @Column(name="endereco_cidade")),
		@AttributeOverride(name = "estado", column = @Column(name="endereco_estado"))
	})
	private Endereco endereco;
	
	@Column(unique = true)
	private String cnpj;
	
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean isInativo() {
		return inativo;
	}

	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}
	
}
