package kr.co.uclick.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.uclick.configuration.SpringConfiguration;
import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;
import kr.co.uclick.service.UserService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class UserServiceTest {


@Autowired
UserService userservice;

@Autowired
PhoneService phoneservice;

@Test
public void test() {
	
	
	//User user = u.get();
	
	
	
	//assertEquals(1,userservice.findById(1L).get().getId().intValue());
	Optional<Phone> phone = phoneservice.findById(111L);
	phoneservice.delete(phone.get());
	
	
	
}
}