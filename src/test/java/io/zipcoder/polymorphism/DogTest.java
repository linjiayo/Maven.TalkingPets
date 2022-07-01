package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog dog;

    @Before
    public void init(){
        dog = new Dog();
    }
    @Test
    public void testGetName() {

        String exp = "Pet";
        String actual = dog.getName();

        assertEquals(exp, actual);

    }

    @Test
    public void testSetName() {
        String exp = "John";
        dog.setName(exp);

        String actual = dog.getName();

        assertEquals("John", exp);
    }
}