package com.app.enrollment.Service;

import org.springframework.stereotype.Service;

import com.app.enrollment.Entity.Admin;
import com.app.enrollment.Repository.AdminRepository;

@Service
public class AdminImpl implements AdminService{
	
	AdminRepository adminRepository;

	@Override
	public Admin authenticateUser(String email, String password) {
		return adminRepository.findByUsernameAndPassword(email,password);
	}

	@Override
	public int updatePassword(String id, String password) {
		return this.adminRepository.updatePassword(password, id);		
	}	
}
