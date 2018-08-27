package kr.co.uclick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.Sample;
import kr.co.uclick.entity.User;

public interface PhoneRepository
		extends JpaRepository<Phone, Long>, QuerydslPredicateExecutor<Phone>, CustomSampleRepository {

		List<Phone> findByNumberContaining(String number);

}
