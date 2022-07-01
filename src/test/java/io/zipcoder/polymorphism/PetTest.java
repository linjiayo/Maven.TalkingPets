package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    Pet pet;

    @Before
    public void init() {
        pet = new Pet();
    }
    @Test
    public void getName() {
        String exp = "Pet";

        String actual = pet.getName();

        assertEquals(exp, actual);
    }

    @Test
    public void setName() {
        String exp = "ExpName";

        pet.setName(exp);
        String actual = pet.getName();

        assertEquals(exp, actual);
    }
}