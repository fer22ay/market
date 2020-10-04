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
 * Clase que expondra los servicios de nuestra API
 * 
 * @author : Fernando Ambrosio
 * @since : 03/10/2020
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAll() {
		return productRepository.getAll();
	}

	public Optional<Product> getProduct(long productId) {
		return productRepository.getProduct(productId);
	}

	public Optional<List<Product>> getByCategory(long categoryId) {
		return productRepository.getByCategory(categoryId);
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}

	public boolean delete(long productId) {
		return getProduct(productId).map(product -> {
			productRepository.delete(productId);
			return true;
		}).orElse(false);
	}

}
