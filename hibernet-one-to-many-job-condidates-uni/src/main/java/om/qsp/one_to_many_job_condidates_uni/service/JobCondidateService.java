package om.qsp.one_to_many_job_condidates_uni.service;

import java.util.List;

import om.qsp.one_to_many_job_condidates_uni.dao.JobCondidateDao;
import om.qsp.one_to_many_job_condidates_uni.dto.Condidates;
import om.qsp.one_to_many_job_condidates_uni.dto.Job;

public class JobCondidateService {
	
      JobCondidateDao dao=new JobCondidateDao();
	
	// inserted data of JobCondidates
		public void jobCondidatesInsert(List<Condidates> condidates, Job job) {
			dao.jobCondidatesInsert(condidates, job);
		}
		
// update data of JobCondidates
		public void jobCondidatesUpdate(int companyId, int condidateId,String companyName, String condidateName ) {
			dao.jobCondidatesUpdate(companyId, condidateId, companyName, condidateName);
		}
		
		
// Delete data from jobCondidate
		
		public void jobCondidatesDelete(int companyId )
		{
			dao.jobCondidatesDelete(companyId);
		}
		
		// display jobCondidates
		public List<Job> displayjobCondidates(){
			return dao.displayjobCondidates();
		}
}
