package kr.co.uclick.repository;

import kr.co.uclick.entity.Sample;
import kr.co.uclick.entity.User;

public interface CustomSampleRepository {

	public void doSample(String name);
	public Sample selectOne(long id);
	
}
