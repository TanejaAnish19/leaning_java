package com.rakuten.training.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.assertj.core.api.Assertions;
import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.domain.Product;
import com.rakuten.training.serivce.ProductServiceImpl;

class ProductServiceImplTestWithMocks {

	@Test
	void createNewProduct_Must_Return_Id_When_Product_Value_GTEQ_MinValue() {
		// AAA

		// Arrange
		ProductServiceImpl objUnderTest = new ProductServiceImpl();
		Product argToMethod = new Product("test", 10000, 2);
		Product returnedByMethod = new Product("test",10000,2);
		returnedByMethod.setId(1);
		
		ProductDAO mockDAO = Mockito.mock(ProductDAO.class);
		Mockito.when(mockDAO.save(argToMethod)).thenReturn(returnedByMethod);
		objUnderTest.setDao(mockDAO);
		// Act
		int id = objUnderTest.createNewProduct(argToMethod);
		// Assert
		assertTrue(id > 0);
	}
	
	@Test
	void createNewProduct_Must_Return_Exep_When_Product_Value_LTEQ_MinValue() {
		//AAA
		
		//Arrange
		ProductServiceImpl objTest = new ProductServiceImpl();
		Product argToMethod = new Product("test", 1000, 3);
		
		Assertions.assertThatThrownBy(() -> {
			objTest.createNewProduct(argToMethod);
		}).isInstanceOf(IllegalArgumentException.class);

		
		/*
		 * try { objTest.createNewProduct(argToMethod);
		 * Assertions.fail("Did not throw Exception"); }catch(IllegalArgumentException
		 * e) {
		 * 
		 * }
		 */
		
		
	}
	
	@Test
	public void removeExisting_Must_Delete_Product_When_Existing_Product_Value_LT_100k() {
		
		ProductServiceImpl objTest = new ProductServiceImpl();
		int id=1;
		Product returnedByMock = new Product("test", 10000, 2);
		returnedByMock.setId(id);
		
		ProductDAO mockDAO = Mockito.mock(ProductDAO.class);
		Mockito.when(mockDAO.findById(id)).thenReturn(returnedByMock);
		objTest.setDao(mockDAO);
		//Act
		objTest.removeExisting(id);
		Mockito.verify(mockDAO).deleteById(id);
	}

}
