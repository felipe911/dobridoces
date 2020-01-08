package br.com.dobridoces.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@NotNull
	@Column(name = "CAMINHO_FOTO")
	private String caminhoFoto;
	
	@NotNull
	@Column(name = "SABOR_MAIS_CONSUMIDO")
	private String saborMaisConsumido;

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

	public String getSaborMaisConsumido() {
		return saborMaisConsumido;
	}

	public void setSaborMaisConsumido(String saborMaisConsumido) {
		this.saborMaisConsumido = saborMaisConsumido;
	}

	public String getCaminhoFoto() {
		return caminhoFoto;
	}

	public void setCaminhoFoto(String caminhoFoto) {
		this.caminhoFoto = caminhoFoto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caminhoFoto == null) ? 0 : caminhoFoto.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((saborMaisConsumido == null) ? 0 : saborMaisConsumido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (caminhoFoto == null) {
			if (other.caminhoFoto != null)
				return false;
		} else if (!caminhoFoto.equals(other.caminhoFoto))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (saborMaisConsumido == null) {
			if (other.saborMaisConsumido != null)
				return false;
		} else if (!saborMaisConsumido.equals(other.saborMaisConsumido))
			return false;
		return true;
	}

}
