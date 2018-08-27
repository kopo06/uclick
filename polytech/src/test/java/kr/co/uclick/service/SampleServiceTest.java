package kr.co.uclick.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

import kr.co.uclick.configuration.SpringConfiguration;
import kr.co.uclick.entity.Sample;
import kr.co.uclick.entity.User;
import kr.co.uclick.service.UserService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class SampleServiceTest {


@Autowired
SampleService sampleservice;



@Test
public void testSelectOne() {
	   StopWatch sw = new StopWatch();
       sw.start();
       Sample s1 = sampleservice.selectOne(1L);
       sw.stop();
       System.out.println("1 total time : " + sw.getTotalTimeSeconds() + " " + s1.getName());
       
       sw = new StopWatch();
       sw.start();
       s1 = sampleservice.selectOne(1L);
       sw.stop();
       System.out.println("2 total time : " + sw.getTotalTimeSeconds() + " " + s1.getName());
       
       s1.setName("a7");
       sampleservice.updateOne(s1);
       
       sw = new StopWatch();
       sw.start();
       s1 = sampleservice.selectOne(1L);
       sw.stop();
       System.out.println("3 total time : " + sw.getTotalTimeSeconds() + " " + s1.getName());
       
       sw = new StopWatch();
       sw.start();
       s1 = sampleservice.selectOne(1L);
       sw.stop();
       System.out.println("4 total time : " + sw.getTotalTimeSeconds() + " " + s1.getName());
       
//       assertEquals(1, s1.getId().intValue());
   }
   


}