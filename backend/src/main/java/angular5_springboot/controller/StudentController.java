package angular5_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import angular5_springboot.entity.Student;
import angular5_springboot.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping
	public List<Student> getStudent() {
		List<Student> rsList = studentService.getAllStudents();

		return rsList;
	}

}
