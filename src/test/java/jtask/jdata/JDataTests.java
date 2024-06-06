package jtask.jdata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jtask.Main;

public class JDataTests {
    @Test
    void jDataTest() {
        assertEquals(55, Main.sum(10), "");
    }
}
