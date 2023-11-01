package com.app.enrollment.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.enrollment.Entity.Student;
import com.app.enrollment.Repository.StudentRepository;

@Service
public class StudentImpl implements StudentService {
	
	StudentRepository studentRepository;
	
	public StudentImpl(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getAllStudent(Integer student_id) {
		return studentRepository.findById(student_id).get();
	}
	
	@Override
	public String createStudent(Student student) {
		this.studentRepository.save(student);
		return("Successfully Created");
	}

	@Override
	public String updateStudent(Student student) {
		this.studentRepository.save(student);
		return ("Successfully Updated");
	}

	@Override
	public String deleteStudent(Integer student_id) {
		this.studentRepository.deleteById(student_id);
		return ("Successfully Deleted");
	}

}
