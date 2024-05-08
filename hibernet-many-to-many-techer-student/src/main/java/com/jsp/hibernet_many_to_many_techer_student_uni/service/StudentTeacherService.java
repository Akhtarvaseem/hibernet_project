package com.jsp.hibernet_many_to_many_techer_student_uni.service;

import java.util.List;

import com.jsp.hibernet_many_to_many_techer_student_uni.dao.StudentTeacherDao;
import com.jsp.hibernet_many_to_many_techer_student_uni.dto.Student;
import com.jsp.hibernet_many_to_many_techer_student_uni.dto.Teacher;

public class StudentTeacherService {

	StudentTeacherDao dao=new StudentTeacherDao();
//  Insert StudentTeacher 
	public void studentTeacherInsert(List<Student> student,List<Teacher> teacher) {
		dao.studentTeacherInsert(student, teacher);
	}

//Display TeacherAndStudent
	
		public List<Teacher> dispStudentTeacher(){
			return dao.dispStudentTeacher();
		}
	
// Delete TeacherAndStudent
		
		public void deleteStudentTeacher(int teacherId) {
			dao.deleteStudentTeacher(teacherId);
		}
		
// Update TeacherAndStudent 
		public void updateStudentTeacher(int teacherId, int studentId, String teacherName,String studentName) {
			dao.updateStudentTeacher(teacherId, studentId, teacherName, studentName);
		}
		
}
