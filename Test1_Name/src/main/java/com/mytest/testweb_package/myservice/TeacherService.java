package com.mytest.testweb_package.myservice;

import java.util.List;

import com.mytest.testweb_package.mymodel.Teacher;

public interface TeacherService {
	//Teacher addTeacher(String teacherId,String teacherName,String gender);
/*	Teacher addTeacher(Teacher teacher);*/
	public abstract Teacher findTeacherById(int id);
	public abstract void addTeacher(Teacher teacher);
	public abstract void updateTeacher(Teacher teacher);
	public abstract List<Teacher> findAllTeachers();
	public abstract void deleteTeacherById(int id);
}
