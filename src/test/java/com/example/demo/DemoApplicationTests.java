package com.example.demo;

import com.example.demo.common.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
    private RedisUtils redisUtils;
	@Test
	void contextLoads() {
		redisUtils.set("hello","world");
	}

}
