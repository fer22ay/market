/**
 * 
 */
package com.fernando.market.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.market.domain.Product;
import com.fernando.market.domain.repository.ProductRepository;

/**
 * Clase que contiene los servicios de nuestra API. Implementa los metodos del
 * repositorio que nos ayudan con los métodos crud {@link ProductRepository}
 * 
 * @author : Fernando Ambrosio
 * @since : 03/10/2020
 *
 */
@Service
public class ProductService {

	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	/**
	 * Metodo que obtiene o lista los productos de la tabla productos de la base de
	 * datos.
	 * 
	 * @return lista de productos.
	 */
	public List<Product> getAll() {
		return productRepository.getAll();
	}

	/**
	 * Metodo para obtener los datos de un producto por su indentificador.
	 * 
	 * @param productId de tipo Long
	 * @return los datos del producto.
	 */
	public Optional<Product> getProduct(long productId) {
		return productRepository.getProduct(productId);
	}

	/**
	 * Metodo para obtener todos los productos por medio de su identificador de
	 * categoria.
	 * 
	 * @param categoryId de tipo Long
	 * @return todos los productos que se encuentre en la categoria.
	 */
	public Optional<List<Product>> getByCategory(long categoryId) {
		return productRepository.getByCategory(categoryId);
	}

	/**
	 * Metodo para guardar un producto en la tabla productos de la base de datos.
	 * 
	 * @param product de tipo Product
	 * @return
	 */
	public Product save(Product product) {
		return productRepository.save(product);
	}

	/**
	 * Metodo para eliminar un producto de la tabla productos, antes de eliminar
	 * verificar que exista. Por ello utilizamos el metodo getProduct().
	 * 
	 * @param productId de tipo Long
	 * @return
	 */
	public boolean delete(long productId) {
		return getProduct(productId).map(product -> {
			productRepository.delete(productId);
			return true;
		}).orElse(false);
	}

}
