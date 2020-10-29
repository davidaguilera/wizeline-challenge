package com.brief.challenge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.brief.challenge.controller.HelloWorldController;

@SpringBootTest
class ChallengeApplicationTests {

	@Autowired
	private HelloWorldController helloWorldController;
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(helloWorldController).isNotNull();
	}

}
