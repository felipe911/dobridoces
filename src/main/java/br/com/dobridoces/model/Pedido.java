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
@Table(name = "PEDIDO")
public class Pedido {

	@Id
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "BRIGADEIRO")
	private Brigadeiro brigadeiro;
	
	@NotNull
	@Column(name = "QUANTIDADE")
	private long qtd;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Brigadeiro getBrigadeiro() {
		return brigadeiro;
	}

	public void setBrigadeiro(Brigadeiro brigadeiro) {
		this.brigadeiro = brigadeiro;
	}

	public long getQtd() {
		return qtd;
	}

	public void setQtd(long qtd) {
		this.qtd = qtd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brigadeiro == null) ? 0 : brigadeiro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (qtd ^ (qtd >>> 32));
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
		Pedido other = (Pedido) obj;
		if (brigadeiro == null) {
			if (other.brigadeiro != null)
				return false;
		} else if (!brigadeiro.equals(other.brigadeiro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (qtd != other.qtd)
			return false;
		return true;
	}

}
