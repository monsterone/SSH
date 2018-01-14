package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import common.BaseDao;
import model.Student;

@Repository
public class StudentDaoImpl {

	@Autowired
	private BaseDao baseDao;
	
	public List<Student> queryAll(Student student) {
		return (List<Student>)baseDao.getHibernateTemplate().find("from Student");
	}

	public void save(Student student) {
		baseDao.getHibernateTemplate().save(student);
	}

	public void edit(Student student) {
		baseDao.getHibernateTemplate().saveOrUpdate(student);	
	}

	public Student info(Student student) {
		return baseDao.getHibernateTemplate().get(Student.class,student.getId());
	}

	public void remove(Student student) {
		baseDao.getHibernateTemplate().delete(student);
	}
	
}
