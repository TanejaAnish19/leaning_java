package com.rakuten.training.serivce;

import java.util.List;

import com.rakuten.training.domain.Review;

public interface ReviewService {

	Review addReviewToProduct(Review r, int product_id);

	Review findById(int id);

	List<Review> findByProduct_Id(int pid);

}