package com.mytest.testweb_package.myrepository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mytest.testweb_package.mymodel.Teacher;

/*
 * 接口 
 * 
 * mybatis-mapper中的 xml里面 会需要 找到  TeacherDaoInterface
 * 
 * */

@Mapper
public interface TeacherRepository {
	/* public Teacher addTeacher(Teacher teacher); */
	public int addTeacher(Teacher teacher);

	public int updateTeacher(Teacher teacher);
	//
	//
	// find
	public abstract Teacher findTeacherById(int id);

	public abstract List<Teacher> findAllTeachers();
	
	public abstract void deleteTeacherById(int id);
}