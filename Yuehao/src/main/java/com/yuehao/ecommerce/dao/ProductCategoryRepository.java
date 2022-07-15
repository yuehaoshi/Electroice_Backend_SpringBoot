package com.yuehao.ecommerce.dao;

import com.yuehao.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
//"productCategory" is Name of JSON entry, "product-category" is the reference to the path
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
