/**
 * 
 */
package com.fernando.market.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fernando.market.domain.Product;
import com.fernando.market.domain.repository.ProductRepository;
import com.fernando.market.persistence.crud.ProductoCrudRepository;
import com.fernando.market.persistence.entity.Producto;
import com.fernando.market.persistence.mapper.ProductMapper;

/**
 * @author : Fernando Ambrosio
 * @since : 02/10/2020
 *
 */
@Repository
public class ProductoRepository implements ProductRepository {

	@Autowired
	private ProductoCrudRepository productoCrudRepository;

	//@Autowired(required = true)
	private ProductMapper mapper;
	
	public ProductoRepository(ProductMapper mapper) {
		this.mapper = mapper;
	}

	/**
	 * Metodo para consultar los datos de la tabla producto.
	 * 
	 * @return devuelve la lista de productos
	 */
	@Override
	public List<Product> getAll() {
		List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
		return mapper.toProducts(productos);
	}

	@Override
	public Optional<List<Product>> getByCategory(long categoryId) {
		List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
		return Optional.of(mapper.toProducts(productos));
	}

	@Override
	public Optional<List<Product>> getScarseProducts(long quantity) {
		Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity,
				true);
		return productos.map(prods -> mapper.toProducts(prods));
	}

	@Override
	public Optional<Product> getProduct(long productId) {
		return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
	}

	@Override
	public Product save(Product product) {
		Producto producto = mapper.toProducto(product);
		return mapper.toProduct(productoCrudRepository.save(producto));
	}

	/**
	 * Metodo para eliminar un producto por medio de su identificar
	 * 
	 * @param idProducto de tipo Long
	 */
	@Override
	public void delete(long productId) {
		productoCrudRepository.deleteById(productId);
	}

}
