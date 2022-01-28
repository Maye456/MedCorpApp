package com.gcu.data;

import com.gcu.model.LoginModel;

public interface IUserDataAccess<T> 
{
	public int createUser(T newUser);
	//boolean login(T model);
}
