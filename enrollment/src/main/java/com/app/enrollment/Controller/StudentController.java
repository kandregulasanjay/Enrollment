package com.app.enrollment.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.enrollment.Entity.Student;
import com.app.enrollment.Service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	StudentService studentService ;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService=studentService;
	}
	
		//localhost:8080/student/allStudents
		@GetMapping("allstudents")
		public List<Student> getAllEnrollmenrtStudents() {
			return studentService.getAllStudents();
		}
		
		//localhost:8080/student/student_id
		@GetMapping("{student_id}")
		public Student getAllEnrollmenrtStudent(@PathVariable("student_id") Integer student_id) {
		    return studentService.getAllStudent(student_id);
		}
		
		//localhost:8080/student/add
		@PostMapping("add")
		public String createAllEnrollmenrtStudent(@RequestBody Student student){
			studentService.createStudent(student);	
			return ("Successfully Created");
		}
		
		//localhost:8080/student/delete/id
		@DeleteMapping("delete/student_id")
		public String deleteAllEnrollmenrtStudent(@PathVariable ("id") Integer student_id){
			studentService.deleteStudent(student_id);
			return ("Successfully Deleted");			 
		}
		
		//localhost:8080/student/update
		@PutMapping("update")
		public String updateAllEnrollmenrtStudent(@RequestBody Student student) {
			studentService.updateStudent(student);	
			return ("Successfully Updated");
		}

}
