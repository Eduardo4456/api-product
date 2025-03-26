package mappers;

import br.com.primeshoes.api.entites.Product;
import dtos.ProductDTO;

public class ProductMapper {
	public static ProductDTO toDTO(Product product) {
		
		return new ProductDTO(product.getName(), product.getPrice(), product.getStock());
		
	}
public static Product toEntity(ProductDTO productDTO) {
	
	Product product = new Product();
	product.setName(productDTO.name());
	product.setPrice(productDTO.price());
	product.setStock(productDTO.stock());
	return product;
}
}
