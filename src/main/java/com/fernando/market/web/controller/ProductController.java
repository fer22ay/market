/**
 * 
 */
package com.fernando.market.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.market.domain.Product;
import com.fernando.market.domain.service.ProductService;

/**
 * Controlador de la api rest de la tabla productos.
 * 
 * @author Fernando Ambrosio
 * @since : 04/10/2020
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {

	private ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping(value = "/all")
	public List<Product> getAll() {
		return productService.getAll();
	}

	@GetMapping(value = "/{productId}")
	public Optional<Product> getProduct(@PathVariable("productId") long productId) {
		return productService.getProduct(productId);
	}
	
	@GetMapping(value = "/category/{categoryId}")
	public Optional<List<Product>> getByCategory(@PathVariable("categoryId") long categoryId) {
		return productService.getByCategory(categoryId);
	}

	@PostMapping(value = "/save")
	public Product save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@DeleteMapping(value = "/delete/{productId}")
	public boolean delete(@PathVariable("productId") long productId) {
		return productService.delete(productId);
	}
	
}







