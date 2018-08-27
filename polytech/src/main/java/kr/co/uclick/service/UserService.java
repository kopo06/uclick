package kr.co.uclick.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import kr.co.uclick.entity.Sample;
import kr.co.uclick.entity.User;
import kr.co.uclick.repository.CustomSampleRepositoryImpl;
import kr.co.uclick.repository.SampleRepository;
import kr.co.uclick.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CustomSampleRepositoryImpl CustomSampleRepository;

	public void delete(User user) {
		userRepository.delete(user);
	}

	@Transactional(readOnly = true)
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Transactional(readOnly = true)
	public List<User> findByNameContaining(String name) {

//		sampleRepository.findAll(QSample.sample.name.eq(name));
		userRepository.doSample(name);

		return userRepository.findByNameContaining(name);
	}


	public void save(User user) {
		userRepository.save(user);
	}

	public Optional<User> findById(Long user) {
		return userRepository.findById(user);
	}


}
