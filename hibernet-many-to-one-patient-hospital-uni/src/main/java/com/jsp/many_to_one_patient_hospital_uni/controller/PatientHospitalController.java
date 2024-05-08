package com.jsp.many_to_one_patient_hospital_uni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.many_to_one_patient_hospital_uni.dto.Hospital;
import com.jsp.many_to_one_patient_hospital_uni.dto.Patient;
import com.jsp.many_to_one_patient_hospital_uni.service.PatientHospitalService;

public class PatientHospitalController {

	public static void main(String[] args) {

		Patient patient=null;
		Hospital hospital= new Hospital();
		
		PatientHospitalService service= new PatientHospitalService();
		Scanner sc=new Scanner(System.in);
	    
		List<Patient> list=new ArrayList<Patient>();
		while(true){
			
			System.out.println("1.InsertHosPat\n2.updateHosPat\n3.deleteHosPat\n4.deltePatient \n5.displayHosPat\n6.UpdateHospital\n7.deleteHospital");
			System.out.println("Enter your choice...");
			
			int ch=sc.nextInt();
		     switch(ch) {
		     case 1:{
		    	     
		    	 
		    	 System.out.println("Enter Hospital detail");
		    	 
		    	 System.out.println("Enter Hospital id ");
		    	 hospital.sethId(sc.nextInt());
		    	 
		    	 System.out.println("Enter Hospital Name ");
		    	 hospital.sethName(sc.next());
		    	 
		    	 System.out.println("Enter hospital Address..");
		    	 hospital.sethAddress(sc.next());
		    	 
		    	 
System.out.println("Enter how data you wnat to store ...........");
		    	  
		    	  
		    	  int size=sc.nextInt();
		    	  
		    	  for(int i=0;i<size;i++) {
		    		  
		    		  patient= new Patient();
		    		  
		    		  System.out.println("Enter  Patient ID ");
		    		  patient.setPid(sc.nextInt());
		    		  
		    		  System.out.println("Enter Patient Name  ");
		    		  patient.setPname(sc.next());
		    		  
		    		  System.out.println("Enter patient Age ");
		    		  patient.setPage(sc.nextInt());
		    		  
		    		  System.out.println("Enter Patient Gender ");
		    		  patient.setPgender(sc.next());
		    		  
		    		  System.out.println("Ente Patien Insurence In Price ");
		    		  patient.setPinsurence(sc.next());
		    		  
		    		  patient.setHospital(hospital);
		    		    
		    		  list.add(patient);
		    	  }
		    	    
		    	 service.patHosInsert(list, hospital);
		    	 
		     }
		     break;
		     case 2:{
                 System.out.println("Enter Hospital detail");
		    	 
		    	 System.out.println("Enter Hospital id ");
		    	 int hId=sc.nextInt();
		    	 
		    	 System.out.println("Enter Hospital Name ");
		    	 String hospName=sc.next();
		    	 
                 System.out.println("Enter Hospital detail");
		    	 
		    	 System.out.println("Enter Patient id ");
		    	 int Pid=sc.nextInt();
		    	 
		    	 System.out.println("Enter Patient Name ");
		    	 String Pname=sc.next();
		   
		    	 service.updateHospPat(hId, hospName, Pid, Pname);
		     }
		     
		     break;
		     case 3:{
		    	 System.out.println("Enter Patient id ");
		    	 int Pid=sc.nextInt();
		    	 service.deleteHospPat(Pid);
		    	 
		    	 
		     }break;
		     case 4:{
		    	 System.out.println("Enter Patient id ");
		    	 int Pid=sc.nextInt();
		    	   service.deletePatient(Pid);
		     }
		     case 5:{
		    	     List<Patient> list2=service.displayHosPat();
		    	     int HospitalId=0;
		    	     String HospitalName=null;
		    	     String HospitalAddress=null;
		    	     
		    	     for (Patient patient2 : list2) {
						System.out.println(patient2.getPid());
						System.out.println(patient2.getPname());
						System.out.println(patient2.getPgender());
						System.out.println(patient2.getPinsurence());
						System.out.println("--------------------------------");
						 HospitalId=patient2.getHospital().gethId();
						 HospitalName=patient2.getHospital().gethName();
					     HospitalAddress=patient2.getHospital().gethAddress();
					}
		    	     
		    	     System.out.println("===========================");
		    	     
		    	     System.out.println(HospitalId);
		    	     System.out.println(HospitalName);
		    	     System.out.println(HospitalAddress);
		    	     
		    	     System.out.println("============================");
		    	     
		     }
		     break;
		     case 6:{
		    	 System.out.println("Enter Hospital id ");
		    	 int id=sc.nextInt();
		    	 
		    	 System.out.println("Enter Hospital Address ");
		    	 String address=sc.next();
		    	 
		    	 service.updateHospital(id, address);
		     }
		     break;
		     case 7:
		     {
		    	/// delete hospital   ** ** its not delete these data because its dependent ***
		    	 System.out.println("Enter Hospital id ");
		    	 int id=sc.nextInt();
		    	 
		    	 service.deleteHospital(id);
		     }
		     }
			
		}
		

	}

}
