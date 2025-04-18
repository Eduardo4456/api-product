package br.com.primeshoes.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.entites.Product;
import br.com.primeshoes.api.repository.ProductRepository;
import dtos.ProductDTO;
import mappers.ProductMapper;
@Service
public class ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * Save new product
	 * @param productDTO
	 */
	public Product store(ProductDTO productDTO)
	{
		Product product = ProductMapper.toEntity(productDTO);
		return productRepository.save(product);
	}

	public List<Product> getALL(){
		return productRepository.findAll();
		
	}
}