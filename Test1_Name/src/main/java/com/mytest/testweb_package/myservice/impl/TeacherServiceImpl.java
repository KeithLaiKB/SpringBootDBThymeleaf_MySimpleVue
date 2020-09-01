package com.mytest.testweb_package.myservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytest.testweb_package.mymodel.Teacher;
import com.mytest.testweb_package.myrepository.TeacherRepository;
import com.mytest.testweb_package.myservice.TeacherService;

//最好写上 接口的名字 ，当然不写也可以，不过不写的话代码的可读性肯能没那么好
@Service(value = "TeacherService")
public class TeacherServiceImpl implements TeacherService{

	
	@Autowired
	TeacherRepository teacherRepository1;

	/*private final TeacherRepository teacherRepository1;*/
	
/*  @Autowired
  public TeacherServiceImpl(TeacherRepository teacherRepository1)
  {
  	this.teacherRepository1=teacherRepository1;
  	
  }*/
  
  
  
	@Override
	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository1.findAllTeachers();
	}

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository1.addTeacher(teacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository1.updateTeacher(teacher);
		
	}

	@Override
	public Teacher findTeacherById(int id) {
		return teacherRepository1.findTeacherById(id);
	}

	@Override
	public void deleteTeacherById(int id) {
		// TODO Auto-generated method stub
		teacherRepository1.deleteTeacherById(id);
	}
	
	
	

/*	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository1.addTeacher(teacher);
	}
*/
	


}