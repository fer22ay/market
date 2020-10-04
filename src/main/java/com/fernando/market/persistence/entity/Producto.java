/**
 * 
 */
package com.fernando.market.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Clase que representa la tabla productos de la base de datos.
 * 
 * @author : Fernando Ambrosio
 * @since : 30/09/2020
 *
 */
@Entity
@Table(name = "productos", schema = "market")
public class Producto implements Serializable {

	private static final long serialVersionUID = 5661230508140151410L;

	/**
	 * Se agrego la anotacion column por que el atributo se declaro diferente al
	 * registrado en la base de datos.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Long idProducto;

	private String nombre;

	@Column(name = "id_categoria")
	private Long idCategoria;

	@Column(name = "codigo_barras")
	private String codigoBarras;

	@Column(name = "precio_venta")
	private Double precioVenta;

	@Column(name = "cantidad_stock")
	private Long cantidadStock;

	private Boolean estado;

	/**
	 * Las anotaciones insertable y updatable se utilizan para que no se puede
	 * actualizar desde esta clase, sino que se tenga que hacer directamente de la
	 * clase categoria.
	 */
	@ManyToOne
	@JoinColumn(name = "id_categoria", insertable = false, updatable = false)
	private Categoria categoria;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Long getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(Long cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
