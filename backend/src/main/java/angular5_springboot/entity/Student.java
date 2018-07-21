package angular5_springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "student_id")
	String student_id;

	@Column(name = "student_name")
	String student_name;

	@Column(name = "classroom")
	String classroom;

	@Column(name = "birthday")
	String birthday;

	public Student() {
	}

	public Student(String student_id, String student_name, String classroom, String birthday) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.classroom = classroom;
		this.birthday = birthday;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
