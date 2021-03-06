package com.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountServiceTest {

	@Test
	void createNewAccount_Must_Return_Valid_Id_When_Balance_GTEQ_MinBalance() {
		//AAA
		//Arrange
		AccountService objectUnderTest = new AccountService();
		
		//Act
		int accountId = objectUnderTest.createNewAccount("SA", objectUnderTest.MIN_BAL);
		
		//Assert
		assertTrue(accountId > 0);
		
	}
	@Test
	void createNewAccount_Must_Return_Zero_Id_When_Balance_LT_MinBalance() {
		//AAA
		//Arrange
		AccountService objectUnderTest = new AccountService();
		
		//Act
		int accountId = objectUnderTest.createNewAccount("SA", objectUnderTest.MIN_BAL-1);
		
		//Assert
		assertTrue(accountId == 0);
		
	}

}
