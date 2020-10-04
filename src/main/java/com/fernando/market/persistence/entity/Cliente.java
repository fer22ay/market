/**
 * 
 */
package com.fernando.market.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase la tabla clientes de la base de datos.
 * 
 * @author : Fernando Ambrosio
 * @since : 30/09/2020
 *
 */
@Entity
@Table(name = "clientes", schema = "market")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -1832630964150839437L;

	@Id
	@Column(name = "id")
	private String idCliente;

	private String nombre;

	private String apellidos;

	private Long celular;

	private String direccion;

	@Column(name = "correo_electronico")
	private String correoElectronico;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Compra> compras;

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellidos;
	}

	public void setApellido(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

}
