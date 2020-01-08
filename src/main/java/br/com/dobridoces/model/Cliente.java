package br.com.dobridoces.model;

import javax.persistence.Entity;

@Entity
public class Cliente {

	private long id;
	private String nome;
	private String foto;
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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getSaborMaisConsumido() {
		return saborMaisConsumido;
	}

	public void setSaborMaisConsumido(String saborMaisConsumido) {
		this.saborMaisConsumido = saborMaisConsumido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foto == null) ? 0 : foto.hashCode());
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
		if (foto == null) {
			if (other.foto != null)
				return false;
		} else if (!foto.equals(other.foto))
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
