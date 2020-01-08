package br.com.dobridoces.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class ContaReceber {

	private long id;
	private Cliente cliente;
	private Double valorAReceber;
	private LocalDate dataRecebimento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorAReceber() {
		return valorAReceber;
	}

	public void setValorAReceber(Double valorAReceber) {
		this.valorAReceber = valorAReceber;
	}

	public LocalDate getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(LocalDate dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataRecebimento == null) ? 0 : dataRecebimento.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((valorAReceber == null) ? 0 : valorAReceber.hashCode());
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
		ContaReceber other = (ContaReceber) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataRecebimento == null) {
			if (other.dataRecebimento != null)
				return false;
		} else if (!dataRecebimento.equals(other.dataRecebimento))
			return false;
		if (id != other.id)
			return false;
		if (valorAReceber == null) {
			if (other.valorAReceber != null)
				return false;
		} else if (!valorAReceber.equals(other.valorAReceber))
			return false;
		return true;
	}

}
