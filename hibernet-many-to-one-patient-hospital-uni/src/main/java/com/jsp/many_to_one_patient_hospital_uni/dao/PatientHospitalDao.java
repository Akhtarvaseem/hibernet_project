package com.jsp.many_to_one_patient_hospital_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.many_to_one_patient_hospital_uni.dto.Hospital;
import com.jsp.many_to_one_patient_hospital_uni.dto.Patient;

public class PatientHospitalDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("akhtar");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
// Inserted data in HospitalAndPatient
	public void patHosInsert(List<Patient> patient, Hospital hospital) {
		
		if(hospital!=null) {
			entityTransaction.begin();
			for (Patient patient2 : patient) {
				
				if(patient2!=null) {
					
					entityManager.persist(patient2);
				}
				else {
					System.out.println("Plese! Enter patient details....");
				}
			}
			
			entityManager.persist(hospital);
			entityTransaction.commit();
		}
		else {
			System.out.println("Plese! Enter Hospital details..");
		}
		
		System.out.println(" Data Successfull inserted");
	}
	
//  Method is use for PatientHospital Update 
	
	@SuppressWarnings("unused")
	public void updateHospPat(int hospId,String hospName, int patId, String patName) {
		
		Patient patient=entityManager.find(Patient.class, patId);
		Hospital hospital=entityManager.find(Hospital.class, hospId);
		
		System.out.println(hospital.gethName());
		
		if(patient!=null) {
			patient.setPname(patName);
			hospital.sethName(hospName);
			entityTransaction.begin();
			
			entityManager.merge(patient);
			if(hospital!=null) {
				entityManager.merge(hospital);
				
			}
			else {
				System.out.println(" hospital details not persent ..");
			}
			entityTransaction.commit();
		}
		else {
			
			System.out.println("Data is not persent...");
			
		}
		
		System.out.println(" Update Successfully....");
		
	}
	
// Update hospital 
	public void updateHospital(int id,String address) {
		

		Hospital hospital=entityManager.find(Hospital.class, id);
		
			if(hospital!=null) {
				hospital.sethAddress(address);
				entityTransaction.begin();
				entityManager.merge(hospital);
				entityTransaction.commit();
			}
			else {
				System.out.println(" hospital details not persent ..");
			}
		
		System.out.println(" Update Successfully....");
		
	}
	
// delete patienthHospital
	public void deleteHospPat(int patientId) {
	
		Patient patient=entityManager.find(Patient.class, patientId);
		if(patient!=null) {
			entityTransaction.begin();
			entityManager.remove(patient);
			Hospital hospital=patient.getHospital();
			if(hospital!=null) {
				entityManager.remove(hospital);
			}
			
			entityTransaction.commit();
		}
		else {
			System.out.println("Id not found..");
		}
		
		System.out.println(" data successfully deleted....");
	}
	
/// delete patient only
	
	public void deletePatient(int patientId) {
		Patient patient=entityManager.find(Patient.class, patientId);
		if(patient!=null) {
			entityTransaction.begin();
			entityManager.remove(patient);
			entityTransaction.commit();
		}
		else {
			System.out.println("Id not found..");
		}
		
		System.out.println(" data successfully deleted....");
	}
	
/// delete hospital   ** ** its not delete these data because its dependent ***
	public void deleteHospital(int hospitalId) {
		
		Hospital hospital=entityManager.find(Hospital.class, hospitalId);
		
		if(hospital!=null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
		}
		else {
			System.out.println("Id not found..");
		}
		
		System.out.println(" data successfully deleted....");
	}
	
// display the datapatientHospital
	
	public List<Patient> displayHosPat(){
		
		String select="Select h from Patient h";
		Query query=entityManager.createQuery(select);
		
		return query.getResultList();
	}
}
