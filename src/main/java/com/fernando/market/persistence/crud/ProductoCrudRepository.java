/**
 * 
 */
package com.fernando.market.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.fernando.market.persistence.entity.Producto;

/**
 * @author : Fernando Ambrosio
 * @since : 02/10/2020
 *
 */
public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {

	/**
	 * Metodo para buscar productos por medio de su id de categoria.
	 * 
	 * @param idCategoria de tipo Long
	 * @return Retorna todos los productos que tenga el id categoria buscado.
	 */
	List<Producto> findByIdCategoriaOrderByNombreAsc(Long idCategoria);

	/**
	 * Metodo para listar los productos que tienen poco stock en bodega y que esten
	 * activos. LessThan = Menor que
	 * 
	 * @param cantidadStock de tipo long
	 * @param estado        de tipo boolean
	 * @return Stock del producto y su estado activo
	 */
	Optional<List<Producto>> findByCantidadStockLessThanAndEstado(long cantidadStock, boolean estado);

}
