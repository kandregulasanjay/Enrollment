package com.app.enrollment.Service;

import java.util.List;

import com.app.enrollment.Entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public  String createStudent(Student student) ;
	
	public String updateStudent(Student student);
	
	public Student getAllStudent(Integer student_id);

	public String deleteStudent(Integer student_id);

}
