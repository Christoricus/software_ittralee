//package myjunittest;

import static org.junit.Assert.*;

import org.junit.Test;

import college.Student;

public class StudentTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testCreate(){
		Student s=new Student("John");
		String studentname= s.getName();
		assertEquals("John",studentname);
	}
	
	@Test
	public void testCreate1(){
		Student s=new Student("Jane");
		String studentname= s.getName();
		assertFalse("John",studentname);
	}
	
	@Test
	public void testgetName(){
		Student s=new Student("John");
		assertEquals("John",s.getName());
	}
	

}
