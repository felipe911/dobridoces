package br.com.dobridoces.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class OrdemCompra {

	private long id;

	private Cliente cliente;
	private List<Brigadeiro> brigadeiros;
	private List<Long> qtdBrigadeiros;
	private Double valorRecebido;
	private Double valorVenda;
	private LocalDate dataVenda;

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

	public List<Brigadeiro> getBrigadeiros() {
		return brigadeiros;
	}

	public void setBrigadeiros(List<Brigadeiro> brigadeiros) {
		this.brigadeiros = brigadeiros;
	}

	public List<Long> getQtdBrigadeiros() {
		return qtdBrigadeiros;
	}

	public void setQtdBrigadeiros(List<Long> qtdBrigadeiros) {
		this.qtdBrigadeiros = qtdBrigadeiros;
	}

	public Double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(Double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brigadeiros == null) ? 0 : brigadeiros.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataVenda == null) ? 0 : dataVenda.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((qtdBrigadeiros == null) ? 0 : qtdBrigadeiros.hashCode());
		result = prime * result + ((valorRecebido == null) ? 0 : valorRecebido.hashCode());
		result = prime * result + ((valorVenda == null) ? 0 : valorVenda.hashCode());
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
		OrdemCompra other = (OrdemCompra) obj;
		if (brigadeiros == null) {
			if (other.brigadeiros != null)
				return false;
		} else if (!brigadeiros.equals(other.brigadeiros))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataVenda == null) {
			if (other.dataVenda != null)
				return false;
		} else if (!dataVenda.equals(other.dataVenda))
			return false;
		if (id != other.id)
			return false;
		if (qtdBrigadeiros == null) {
			if (other.qtdBrigadeiros != null)
				return false;
		} else if (!qtdBrigadeiros.equals(other.qtdBrigadeiros))
			return false;
		if (valorRecebido == null) {
			if (other.valorRecebido != null)
				return false;
		} else if (!valorRecebido.equals(other.valorRecebido))
			return false;
		if (valorVenda == null) {
			if (other.valorVenda != null)
				return false;
		} else if (!valorVenda.equals(other.valorVenda))
			return false;
		return true;
	}

}
