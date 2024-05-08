package com.hibernet_one_to_many_StudentSubject_bi.service;

import java.util.List;

import com.hibernet_one_to_many_StudentSubject_bi.dao.SubStuDao;
import com.hibernet_one_to_many_StudentSubject_bi.dto.Student;
import com.hibernet_one_to_many_StudentSubject_bi.dto.Subject;

public class SubStuService {

	SubStuDao dao=new SubStuDao();
	public void insertSubStu( Student student,List<Subject> subject) {
		dao.insertSubStu(student,subject);
	}
	
	
	// delete the data
	
		public void deleteSubStu(int id) {
			dao.deleteSubStu(id);
		}
		
		
		// Update the table data 
		
		public void updateSubStu(int id, String StuName, String SubName) {
			dao.updateSubStu(id, StuName, SubName);
		}
		
		// display data 
		
		public List<Subject> displaySubStu(){
			return dao.displaySubStu();
		}
}
