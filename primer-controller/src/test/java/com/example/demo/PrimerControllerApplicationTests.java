package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class PrimerControllerApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//}

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class PrimerControllerApplicationTests {

    @Test
    public void testMain() {
        assertDoesNotThrow(() -> PrimerControllerApplication.main(new String[]{}));
    }
}