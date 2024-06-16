package com.example.demo;

import java.util.List;



public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> fetchStudentList();
	public Student fetchStudentById(int studentId);
	public void deleteStudentById(int studentId);
	public Student updateStudentById(int studentId, Student student);

}
