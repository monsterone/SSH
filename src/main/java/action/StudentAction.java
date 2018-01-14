package action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import model.Student;
import service.impl.StudentServerImpl;

@Controller(value = "studentAction")
public class StudentAction {
	@Autowired
	private StudentServerImpl studentServerImpl;
	
	private List<Student> students=new ArrayList<>();
	private Student student;
	
	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String do_query() {
		students=studentServerImpl.queryAll(student);
		return "list";
	}
	
	public String do_save() {
		studentServerImpl.save(student);
		return "save";
	}
	public String to_save() {
		return "save";
	}
	
	public String do_edit() {
		studentServerImpl.edit(student);
		return "edit";
	}
	public String to_edit() {
		student=studentServerImpl.info(student);
		return "edit";
	}
	
	public String do_remove() {
		studentServerImpl.remove(student);
		return "list";
	}
	
	public String do_info() {
		studentServerImpl.info(student);
		return "info";
	}
}
