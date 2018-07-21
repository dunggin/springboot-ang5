package angular5_springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import angular5_springboot.dao.StudentRepo;
import angular5_springboot.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;

	@Override
	public List<Student> getAllStudents() {
		List<Student> rsList = new ArrayList<>();
		repo.findAll().forEach(e -> rsList.add(e));
		return rsList;
	}

}
