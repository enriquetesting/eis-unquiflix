package unq.eis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaTest {

    @Test
    void test_suma() {
        Prueba p = new Prueba();
        assertEquals(3, p.sumar(1, 2));
    }

    @Test
    void test_resta() {
        Prueba p = new Prueba();
        assertEquals(3, p.restar(5, 2));
    }
}
