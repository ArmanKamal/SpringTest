package com.example.springtesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass(){
        System.out.println("Called once before all test execution");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Called before each test  ");
        greeting = new Greeting();
    }


    @Test
    void helloWorld() {
        System.out.print("First Test ");
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.print("Second Test ");
        System.out.println(greeting.helloWorld("John Cena"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Called after each test");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("Called last after all test are done !Once");

    }
}