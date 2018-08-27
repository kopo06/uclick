package kr.co.uclick.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import kr.co.uclick.entity.Sample;
import kr.co.uclick.entity.User;

public interface UserRepository
		extends JpaRepository<User, Long>, QuerydslPredicateExecutor<User>, CustomSampleRepository {

	public void doSample(String name);
	 List<User> findByNameContaining(String name);
	// void updateOne(User user);



}
