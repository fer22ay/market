/**
 * 
 */
package com.fernando.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.fernando.market.domain.Product;

/**
 * Interfaz que define los metodos crud que accesan a la base de datos.
 * 
 * @author : Fernando Ambrosio
 * @since : 03/10/2020
 *
 */
public interface ProductRepository {

	List<Product> getAll();

	Optional<List<Product>> getByCategory(long categoryId);

	Optional<List<Product>> getScarseProducts(long quantity);

	Optional<Product> getProduct(long productId);

	Product save(Product product);

	void delete(long productId);

}
