package om.qsp.one_to_many_job_condidates_uni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import om.qsp.one_to_many_job_condidates_uni.dto.Condidates;
import om.qsp.one_to_many_job_condidates_uni.dto.Job;
import om.qsp.one_to_many_job_condidates_uni.service.JobCondidateService;

public class JobCondidatesController {

	public static void main(String[] args) {

		JobCondidateService service=new JobCondidateService();
		Job job=new Job();
		Condidates condidates=null;
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Insert \n2.Update \n3.Delete \n4.Display");
			System.out.println("Enter your choice ...");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				
				
				  List<Condidates> list=new ArrayList<Condidates>();
				  
				  System.out.println("How offen condidates store the data ..");
				  int size=sc.nextInt();
				  System.out.println("Enter here Condidates deteials");
				  
				  for(int i=0;i<size;i++) {
					  condidates=new Condidates();
					  System.out.println("Enter Condidates id ");
					  condidates.setId(sc.nextInt());
					  
					  System.out.println("Enter Condidates Name");
					  condidates.setName(sc.next());
					  
					  System.out.println("Enter Condidates Email ");
					  condidates.setEmail(sc.next());
					  
					  System.out.println("Enter Condidates cellNumber in Long");
					  condidates.setCellNum(sc.nextLong());
					  list.add(condidates);
				  }
				  System.out.println(" Here you fill the company details ");
				  
				  System.out.println("Enter Company Id");
				  job.setCompId(sc.nextInt());
				  
				  System.out.println("Enter Company Name ");
				  job.setComName(sc.next());
				  
				  System.out.println("Enter the Company Position ");
				  job.setComPosition(sc.next());
				  
				 System.out.println(" Enter the Salary in double ");
				 job.setPackage(sc.nextDouble());
				 
				 job.setCondidates(list);
				  
				service.jobCondidatesInsert(list, job);
			}
			break;
			case 2:{
				
				 System.out.println("Enter Company Id");
				 int companyid=sc.nextInt();
				
				 System.out.println("Enter Company Name ");
				 String companyname=sc.next();
				
				  System.out.println("Enter Condidates id ");
				  int cId=sc.nextInt();
				  
				  System.out.println("Enter Condidates Name");
				  String cName=sc.next();
				  
				  
				  service.jobCondidatesUpdate(companyid, cId, companyname, cName);
			}
			break;
			case 3:{
				System.out.println("Enter Company Id");
				 int companyid=sc.nextInt();
				 service.jobCondidatesDelete(companyid);
			}
			break;
			case 4:{
				
				for (Job list : service.displayjobCondidates()) {
					
					System.out.println(list.getCompId());
					System.out.println(list.getComName());
					System.out.println(list.getComPosition());
					System.out.println(list.getPackage());
					
					System.out.println("-----------");
					
					List<Condidates> list2=list.getCondidates();
					
					for (Condidates list3 : list2) {
						System.out.println(list3.getId());
						System.out.println(list3.getName());
						System.out.println(list3.getEmail());
						System.out.println(list3.getCellNum());
						System.out.println(".........................");
					}
				}
			}
			break;
			}
		}
	}

}
