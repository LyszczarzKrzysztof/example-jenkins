package com.example.examplejenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleJenkinsApplicationTest {

    @Test
    void sum() {
        ExampleJenkinsApplication exampleJenkinsApplication = new ExampleJenkinsApplication();
        assertEquals(10,exampleJenkinsApplication.sum(5,5));
    }
}