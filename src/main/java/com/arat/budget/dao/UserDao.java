package com.arat.budget.dao;



public interface UserDao {
	com.arat.budget.model.Users findByUserName(String username);
}
