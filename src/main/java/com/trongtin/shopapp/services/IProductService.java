package com.trongtin.shopapp.services;

import com.trongtin.shopapp.dtos.ProductDTO;
import com.trongtin.shopapp.dtos.ProductImageDTO;
import com.trongtin.shopapp.models.Product;
import com.trongtin.shopapp.models.ProductImage;
import com.trongtin.shopapp.responses.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

public interface IProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<ProductResponse> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO) throws Exception;

}
