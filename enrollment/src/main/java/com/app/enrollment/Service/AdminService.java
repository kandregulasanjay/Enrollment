package com.app.enrollment.Service;

import com.app.enrollment.Entity.Admin;

public interface AdminService {
	
	Admin authenticateUser(String email, String password);
	int updatePassword(String id,String password);

}
