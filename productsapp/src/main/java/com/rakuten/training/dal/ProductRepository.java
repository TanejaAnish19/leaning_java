package com.rakuten.training.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rakuten.training.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {


	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	
	public List<Product> findByPrice(float p);
	public List<Product> findByPriceLessThan(float p);
	public List<Product> findByNameLike(String s);
	
	
	// This is done when we not use named functions as above.. so we have to tell the repository about the query to take place with parameterized args.
	@Query("select p from Product as p where p.qoh=:q")
	public List<Product> someQuery(@Param("q") int i);
	
}
