package kr.co.uclick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.uclick.entity.Phone;

import kr.co.uclick.entity.Sample;
import kr.co.uclick.entity.User;
import kr.co.uclick.repository.CustomSampleRepositoryImpl;
import kr.co.uclick.repository.PhoneRepository;
import kr.co.uclick.repository.SampleRepository;
import kr.co.uclick.repository.UserRepository;

@Service
@Transactional
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;

	@Autowired
	private CustomSampleRepositoryImpl CustomSampleRepository;
	
	public void delete(Phone phone) {
		phoneRepository.delete(phone);
	}

	@Transactional(readOnly = true)
	public List<Phone> findAll() {
		return phoneRepository.findAll();
	}

	@Transactional(readOnly = true)
	public List<Phone> findByNumberContaining(String number) {

//		sampleRepository.findAll(QSample.sample.name.eq(name));
		phoneRepository.doSample(number);

		return phoneRepository.findByNumberContaining(number);
	}

	public void save(Phone phone) {
		phoneRepository.save(phone);
	}

	public Optional<Phone> findById(Long sampleId) {
		return phoneRepository.findById(sampleId);
	}


}
