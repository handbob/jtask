package jtask.jcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jtask.Main;

public class JControllerTests {
    @Test
    void jControllerTest() {
        assertEquals(55, Main.sum(10), () -> "");
    }
}
