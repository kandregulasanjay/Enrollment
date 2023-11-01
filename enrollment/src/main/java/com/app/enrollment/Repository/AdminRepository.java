package com.app.enrollment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.enrollment.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

	Admin findByUsernameAndPassword(String email, String password);
	 @Modifying
     
	 @Query(value = "UPDATE Admin Set password=:pw WHERE username = :id")
     int updatePassword(@Param("pw") String password, @Param("id") String username);

}
