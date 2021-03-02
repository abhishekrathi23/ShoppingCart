package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.model.Filters;
import com.student.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	Product findByproductName(String name);
	
	@Query(value="SELECT *" + 
			"  FROM Product p" + 
			" INNER JOIN product_filter pf" + 
			"    ON ( pf.productId = p.productId )" + 
			" INNER JOIN Filters f" + 
			"    ON ((Select f.filterId from Filters f WHERE f.filterName = filter.filterName AND f.filterValue = filter.filterValue)=pf.filterId)"
			,nativeQuery = true)
	Product findByfilter(Filters filter);

	

}
