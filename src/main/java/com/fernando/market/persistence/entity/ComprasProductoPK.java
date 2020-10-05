/**
 * 
 */
package com.fernando.market.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Clase que representa una llave compuesta de la base de datos.
 * 
 * @author : Fernando Ambrosio
 * @since : 30/09/2020
 *
 */
@Embeddable
public class ComprasProductoPK implements Serializable {

	private static final long serialVersionUID = -726744389732347832L;

	@Column(name = "id_compra")
	private Long idCompra;

	@Column(name = "id_producto")
	private Long idProducto;

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCompra == null) ? 0 : idCompra.hashCode());
		result = prime * result + ((idProducto == null) ? 0 : idProducto.hashCode());
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
		ComprasProductoPK other = (ComprasProductoPK) obj;
		if (idCompra == null) {
			if (other.idCompra != null)
				return false;
		} else if (!idCompra.equals(other.idCompra))
			return false;
		if (idProducto == null) {
			if (other.idProducto != null)
				return false;
		} else if (!idProducto.equals(other.idProducto))
			return false;
		return true;
	}
	
}


