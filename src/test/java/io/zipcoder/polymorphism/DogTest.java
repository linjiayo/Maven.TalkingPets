package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    @Test
    public void testGetName() {
        Dog dog = new Dog("Rex");

        String exp = "Rex";
        String actual = dog.getName();

        assertEquals(exp, actual);

    }

    @Test
    public void testSetName() {
        Dog dog = new Dog("Jeff");

        String exp = "John";
        dog.setName(exp);

        String actual = dog.getName();

        assertEquals("John", exp);
    }
}