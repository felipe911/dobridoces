package br.com.dobridoces.model;

import javax.persistence.Entity;

@Entity
public class Estoque {

	private long id;
	private long qtdTotal;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQtdTotal() {
		return qtdTotal;
	}

	public void setQtdTotal(long qtdTotal) {
		this.qtdTotal = qtdTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (qtdTotal ^ (qtdTotal >>> 32));
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
		Estoque other = (Estoque) obj;
		if (id != other.id)
			return false;
		if (qtdTotal != other.qtdTotal)
			return false;
		return true;
	}

}
