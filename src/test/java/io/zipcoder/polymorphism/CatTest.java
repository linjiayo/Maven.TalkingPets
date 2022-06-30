package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testGetName() {
        Cat cat = new Cat("John");

        String exp = "John";
        String actual = cat.getName();

        assertEquals(exp, actual);
    }

    @Test
    public void testSetName() {
        Cat cat = new Cat();

        String expName = "Unique name";
        cat.setName("Unique name");

        assertEquals(expName, cat.getName());
    }
}