package com.cal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprBootJpaAssignment1ApplicationTests {
 private Calculator cal = new Calculator();
	@Test
	void contextLoads() {
	}
	@Test
 void testAddition() {
	 int actual = cal.addition(2,3,5);
	 int expected = 10;
	 assertThat(actual).isEqualTo(expected);
 }
}
