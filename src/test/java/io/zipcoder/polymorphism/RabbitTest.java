package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RabbitTest {
    private Rabbit rab;

    @Before
    public void init() {
        rab = new Rabbit("Timmy");
    }
    @Test
    public void testGetName() {

        String exp = "Timmy";
        String actual = rab.getName();

        assertEquals(exp, actual);

    }

    @Test
    public void testSetName() {
        String exp = "Mac";
        rab.setName(exp);
        String actual = rab.getName();

        assertEquals(exp, actual);

    }

}