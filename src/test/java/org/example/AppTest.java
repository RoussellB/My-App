package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    void testSumar() {
        App app = new App();
        assertEquals(5, app.sumar(2,3));
    }

    @org.junit.jupiter.api.Test
    void restar() {
        App app = new App();
        assertEquals(1, app.sumar(3,2));
    }

    @org.junit.jupiter.api.Test
    void testEsPar() {
        assertTrue(app.esPar(4));
        assertFalse(app.esPar(5));
    }
}