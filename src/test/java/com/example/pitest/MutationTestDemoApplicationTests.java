package com.example.pitest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MutationTestDemoApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true, "Spring context loaded successfully.");
	}

	@Test
	void testMainMethod() {
		MutationTestDemoApplication.main(new String[] {});
		assertTrue(true, "Main method executed without exceptions.");
	}
}
