package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;







@RestController
public class StudentController {
	@Autowired
private StudentService studentservice;
	
}@PostMapping("/students")
public Student saveDepartment(@RequestBody Student student)
{
return StudentService.saveStudent(student);
}
@GetMapping("/stu")
public List<Student>fetchStudentList()
{
return StudentService.fetchStudentList();
}
@GetMapping("/student/{id}")
public Student fetchStudentById(@PathVariable("id") int studentId)
{
return StudentService.fetchDepartmentById(studentId);
}
@DeleteMapping("/student/{id}")
public String deleteStudentById(@PathVariable("id") int studentId)
{
StudentService.deleteStudentById(studentId);
return "Record deleted successfully";
}
@PutMapping("/student/{id}")
public Student updateStudentById(@PathVariable("id") int studentId,
@RequestBody Student student)
{
return StudentService.updateStudenttById(studentId,student);
}

}