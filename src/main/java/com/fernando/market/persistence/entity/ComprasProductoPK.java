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

}
