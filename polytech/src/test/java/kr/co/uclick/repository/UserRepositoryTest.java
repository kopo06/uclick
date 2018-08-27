package kr.co.uclick.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.uclick.configuration.SpringConfiguration;
import kr.co.uclick.entity.User;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class UserRepositoryTest {


@Autowired
UserRepository userRepository;



@Test
public void test() {
		
//	Optional<User> u = userRepository.findById(1L);
//	User user = u.get();
//	//System.out.println(user.getId());
//	assertEquals(1,user.getId().longValue());
		
	List<User> u = userRepository.findByNameContaining("ㄴㅇ");
	
	assertEquals(1, u.size());
}
}