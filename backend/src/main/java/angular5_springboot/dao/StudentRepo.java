package angular5_springboot.dao;

import org.springframework.data.repository.CrudRepository;

import angular5_springboot.entity.Student;

public interface StudentRepo extends CrudRepository<Student, String> {

}
