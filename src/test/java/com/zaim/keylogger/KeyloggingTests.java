package com.zaim.keylogger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KeyloggingTests {

	@Test
	void test() {
		Keylogger kl = new Keylogger();
		assertNotNull(kl);
	}

}
