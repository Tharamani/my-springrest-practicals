/**
 * 
 */
package com.javalearning.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.springdemo.entity.Student;

/**
 * @author Thara Created date and time : 30 Dec 2020 11:33:26 am
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {

	// define field
	List<Student> studentList;

	// define @postconstruct to load the student data....only once
	@PostConstruct
	public void loadData() {
		studentList = new ArrayList<Student>();
		studentList.add(new Student("Mary", "Mathew"));
		studentList.add(new Student("Berny", "Deo"));
		studentList.add(new Student("Annie", "Besant"));
	}
	// define endpoint for "/students"

	/**
	 * define endpoint for "/students"
	 */
	@GetMapping("/students")
	public List<Student> getStudents() {

		studentList.stream().forEach(Student::getFirstName);
		return studentList;
	}

	// define endpoint for "/students/{studentId}" - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		System.out.println(studentId);

		// check studentId against the list
		if ((studentId >= studentList.size()) || studentId < 0) {
			throw new StudentNotFoundException("student id not found : " + studentId);
		}
		// just index into the list...keep it simple for now
		return studentList.get(studentId);
	}
}
