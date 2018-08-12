package angular5_springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}
