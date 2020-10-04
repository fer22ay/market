/**
 * 
 */
package com.fernando.market.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author : Fernando Ambrosio
 * @since : 30/09/2020
 *
 */
@Entity
@Table(name = "compras_productos", schema = "market")
public class ComprasProducto {

	@EmbeddedId
	private ComprasProductoPK id;
	
	private Long cantidad;
	
	private Double total;
	
	private Boolean estado;
	
	@ManyToOne
	@JoinColumn(name = "id_compra", insertable = false, updatable = false)
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", insertable = false, updatable = false)
	private Producto producto;

	public ComprasProductoPK getId() {
		return id;
	}

	public void setId(ComprasProductoPK id) {
		this.id = id;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}
