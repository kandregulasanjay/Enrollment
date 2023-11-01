package com.app.enrollment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.enrollment.Entity.Student;

public interface StudentRepository extends JpaRepository< Student, Integer>{

}
