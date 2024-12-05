package com.example.module5app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class Module5appApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void pow2MethodResult() {
		MainRestController restController = new MainRestController();
		assertThat(restController.pow(2)).isEqualTo(4);
	}
}
