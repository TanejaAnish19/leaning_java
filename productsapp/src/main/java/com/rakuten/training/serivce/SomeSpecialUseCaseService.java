package com.rakuten.training.serivce;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rakuten.training.dal.ProductDAO;


// this class is made to access secondary repository whenever required.
@Service
public class SomeSpecialUseCaseService {

	@Autowired
	@Qualifier("productDAOInMemImpl")
	ProductDAO dao;
	
	@PostConstruct
	public void playWithDAO()
	{
		System.out.println(" Type of dao in SomeSpecialUseCaseService is: "+ dao.getClass().getName());
	}
	
	
}
