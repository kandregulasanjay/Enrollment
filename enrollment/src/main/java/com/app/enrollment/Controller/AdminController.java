package com.app.enrollment.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.enrollment.Entity.Admin;
import com.app.enrollment.Service.AdminService;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	AdminService adminService;

	public AdminController(AdminService adminService) {
		super();
		this.adminService=adminService;
	}
	
	//localhost:8080/admin/login
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Admin admin){
		Map<String,String> map = new HashMap<>();
		try {
			Admin userByUserAndPassword = adminService.authenticateUser(admin.getUsername(), admin.getPassword());
			if (userByUserAndPassword!=null) {
				map.put("username",userByUserAndPassword.getUsername().toString());
			    map.put("token", "123456");
				return new ResponseEntity<>(map,HttpStatus.OK);
			} else {
				map.clear();
				map.put("message","Invalid User");
				map.put("Token",null);
				return new ResponseEntity<>(map,HttpStatus.UNAUTHORIZED);
			}
		} catch (Exception e) {
			map.clear();
			map.put("message",e.getMessage());
			map.put("Token",null);
			return new ResponseEntity<>(map,HttpStatus.UNAUTHORIZED);
		}
	}
	
	//localhost:8080/admin/updatePassword/{username}
	@PutMapping("/updatePassword/{username}")
	public int updatePassword(@PathVariable String username, @RequestBody  @Validated  ObjectNode json) {
		return adminService.updatePassword(username, json.get("password").asText());
	}

}
