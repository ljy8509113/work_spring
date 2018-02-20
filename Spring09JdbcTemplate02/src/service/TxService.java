package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.TxDao;
import model.Job;

@Service
public class TxService {
	@Autowired
	private TxDao dao;
	
	@Transactional //query 오류시 값 변경 안되고 에러남 안쓰면 값 바뀌고 에러
	public void save(Job job) {
		dao.update(job);
//		dao.insert(job);
		job.setJobId(job.getJobId());
//		job.setJobId(job.getJobId() + "_");
		dao.insert(job);
	}
}
