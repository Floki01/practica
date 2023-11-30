import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {

    @BeforeEach
    void init() {

    }

    @Test
    void numeroPositivo() {
        int numero = 6;
        assertTrue(numero > 0);
    }

    @Test
    void esNumeroPar() {
        int numero = 8;
        assertTrue(numero % 2 == 0);
    }

    @Test
    void menorQueDiez() {
        int numero = 9;
        assertTrue(numero < 10);
    }

    @Test
    public void testNumeroPositivoParMayorQue10() {
        int numero = 11;
        assertTrue(numero > 10 && numero > 0);
    }

    @Test
    public void testNumeroPositivoParMenorIgualQue10() {
        int numero = 10;
        assertTrue(numero <= 10 && numero > 0);
    }

    @Test
    public void testNumeroNegativo() {
        int numero = -100;
        assertTrue(numero < 0);

    }

    @Test
    public void testNumeroImparNegativo() {
        int numero = -20;
        assertTrue((numero % 2 != 2) && numero < 0);
    }

    @Test
    public void testNumeroImparPositivo() {
        int numero = 31;
        System.out.println(numero % 2);
        assertTrue((numero % 2 != 0) && (numero > 0));
    }

    

}
