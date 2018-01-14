package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.impl.StudentDaoImpl;
import model.Student;
import service.impl.StudentServerImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:application-dao.xml","classpath:application-service.xml"})
public class TestHibernate {
	
	@Autowired
	private StudentServerImpl studentServerImpl;
	
	@Test
	public void testQuery(){
		studentServerImpl.queryAll(null);
	}
	
	@Test
	public void testSave(){
		studentServerImpl.save(new Student("arvin",5));
	}

}
