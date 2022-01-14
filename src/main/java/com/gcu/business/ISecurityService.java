package com.gcu.business;

import com.gcu.model.LoginModel;
import com.gcu.model.RegisterModel;

public interface ISecurityService 
{
	public boolean isAuthenticated(LoginModel loginModel);
}
