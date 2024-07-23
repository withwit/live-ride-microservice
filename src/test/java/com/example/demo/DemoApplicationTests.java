package com.example.demo;

import com.example.demo.rest.RestController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private RestController restController;
	@Test
	void contextLoads() {

	}

}
