package com.hibernet_one_to_many_student_subject_bid.service;

import java.util.List;

import com.hibernet_one_to_many_student_subject_bid.dao.StuSubDao;
import com.hibernet_one_to_many_student_subject_bid.dto.Student;
import com.hibernet_one_to_many_student_subject_bid.dto.Subject;

public class StuSubService {

	  StuSubDao dao=new StuSubDao();
	// insert data in database
		public void insertSubStu(Student student,List<Subject> subject) {
			dao.insertSubStu(student, subject);
		}
}
