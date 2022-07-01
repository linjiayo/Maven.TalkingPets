package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat cat;
    @Before
    public void init() {
        cat = new Cat();
    }

    @Test
    public void testGetName() {
        String exp = "Pet";
        String actual = cat.getName();

        assertEquals(exp, actual);
    }

    @Test
    public void testSetName() {
        String expName = "Unique name";
        cat.setName("Unique name");

        assertEquals(expName, cat.getName());
    }
}