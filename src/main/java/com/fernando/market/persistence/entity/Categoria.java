/**
 * 
 */
package com.fernando.market.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase que representa la tabla categorias de la base de datos.
 * 
 * @author : Fernando Ambrosio
 * @since : 30/09/2020
 *
 */
@Entity
@Table(name = "categorias", schema = "market")
public class Categoria implements Serializable {

	private static final long serialVersionUID = -69313447195809993L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Long idCategoria;

	private String descripcion;

	private Boolean estado;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Producto> productos;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
