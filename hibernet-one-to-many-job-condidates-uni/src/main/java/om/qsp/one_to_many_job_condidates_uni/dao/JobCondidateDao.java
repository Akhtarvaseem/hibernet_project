package om.qsp.one_to_many_job_condidates_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import om.qsp.one_to_many_job_condidates_uni.dto.Condidates;
import om.qsp.one_to_many_job_condidates_uni.dto.Job;

public class JobCondidateDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
// inserted data of JobCondidates
	public void jobCondidatesInsert(List<Condidates> condidates, Job job) {
		
		entityTransaction.begin();
		entityManager.persist(job);
		for (Condidates condidates2 : condidates) {
			entityManager.persist(condidates2);
		}
		entityTransaction.commit();
	    System.out.println("Data Successfully Inserted ");
	}
	
	
// update data of JobCondidates
	@SuppressWarnings("unused")
	public void jobCondidatesUpdate(int companyId, int condidateId,String companyName, String condidateName )
	{
	
		System.out.println(companyId);
		 Job job=entityManager.find(Job.class,  companyId);
		 System.out.println(job);
		
		if(job !=null) {
			
			entityTransaction.begin();
			job.setComName(companyName);
		    entityManager.merge(job);
			
			List<Condidates> condidates=job.getCondidates();
			
			for (Condidates condidate : condidates) {
				
				if(condidate.getId()==condidateId) {
					condidate.setName(condidateName);
					entityManager.merge(condidate);
				}
			}
			
		}
		else 
		{
			System.out.println(" plese enter valid information..");
		}
		entityTransaction.commit();
		
		System.out.println("Data Successfully Updated.. ");
	}

// Delete data from jobCondidate
	
	public void jobCondidatesDelete(int companyId )
	{
	
		
		 Job job=entityManager.find(Job.class,  companyId);;
		
		if(job !=null) {
			
			entityTransaction.begin();	
			entityManager.remove(job);
			
			List<Condidates> condidates=job.getCondidates();
			
			for (Condidates condidate : condidates) {
				
				if(condidate.getId()!=0) {
					entityManager.remove(condidate);
				}
			}
			
		}
		else 
		{
			System.out.println(" plese enter valid information..");
		}
		entityTransaction.commit();
		
		System.out.println("Data Successfully Delete.. ");
	}
	
	
// display jobCondidates
	public List<Job> displayjobCondidates(){
		
		String select="select s from Job s";
		
    	Query query =entityManager.createQuery(select);
    	
    	List<Job> list=query.getResultList(); 
    	
    	if(list!=null) {
    		return list;
    	}
    	else {
    		return null;
    	}   
	}

}

