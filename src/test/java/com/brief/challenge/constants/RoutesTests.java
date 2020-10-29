package com.brief.challenge.constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static com.brief.challenge.constant.Routes.*;

public class RoutesTests {

	@Test
	void testConstants() {
		String path = "/v1/brief/challenge/wizeline";
		assertEquals(path, PATH);
		String helloWorld = "/helloworld";
		assertEquals(helloWorld, HELLO_WORLD);
		String error = "/error";
		assertEquals(error, ERROR);
	}
}
