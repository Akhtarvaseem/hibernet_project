package com.jsp.many_to_one_patient_hospital_uni.service;

import java.util.List;

import com.jsp.many_to_one_patient_hospital_uni.dao.PatientHospitalDao;
import com.jsp.many_to_one_patient_hospital_uni.dto.Hospital;
import com.jsp.many_to_one_patient_hospital_uni.dto.Patient;

public class PatientHospitalService {
   
	PatientHospitalDao dao=new PatientHospitalDao();
// Use for inserted data in PatientHospital
	public void patHosInsert(List<Patient> patient, Hospital hospital) {
		
		dao.patHosInsert(patient, hospital);
	}

	
//  Method is use for PatientHospital Update 
	public void updateHospPat(int hospId,String hospName, int patId, String patName) {
		
		dao.updateHospPat(hospId, hospName, patId, patName);
	}
	
/// Update hospital 
		public void updateHospital(int id,String address) {
			dao.updateHospital(id, address);
		}
	
// delete patienthHospital
		public void deleteHospPat(int patientId) {
			dao.deleteHospPat(patientId);
		}
		
/// delete patient only
		public void deletePatient(int patientId) {
			dao.deletePatient(patientId);
		}
		
		/// delete hospital   ** ** its not delete these data because its dependent ***
		public void deleteHospital(int hospitalId) {
			dao.deleteHospital(hospitalId);
		}
// display the datapatientHospital
	
		public List<Patient> displayHosPat(){
			return dao.displayHosPat();
		}
		
		
}
