package br.com.primeshoes.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.entites.Product;
import br.com.primeshoes.api.services.ProductService;
import dtos.ProductDTO;
import mappers.ProductMapper;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
		ProductDTO productResponseDTO = ProductMapper.toDTO(productService.store(productDTO));
	 return new ResponseEntity<>(productResponseDTO, HttpStatus.CREATED);
	}
	@GetMapping("/list")
	public List<Product> listALL(){
		
		return productService.getALL();
	}
	
}
