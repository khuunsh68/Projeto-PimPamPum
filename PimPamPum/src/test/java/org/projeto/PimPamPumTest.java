package org.projeto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PimPamPumTest {

    @Test
    // Teste divisível por 3
    public void testRun_DivisivelPor3() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "Pim";
        String atual = pimPamPum.run(9);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste divisível por 5
    public void testRun_DivisivelPor5() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "Pam";
        String atual = pimPamPum.run(10);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }
    @Test
    // Teste divisível por 7
    public void testRun_DivisivelPor7() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "Pum";
        String atual = pimPamPum.run(14);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }
    @Test
    // Teste divisível por nenhum
    public void testRun_NaoDivisivel() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "11";
        String atual = pimPamPum.run(11);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste conter digito 3
    public void testRun_Conter3() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PimPim";
        String atual = pimPamPum.run(3);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste conter digito 5
    public void testRun_Conter5() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PamPam";
        String atual = pimPamPum.run(5);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste conter digito 7
    public void testRun_Conter7() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PumPum";
        String atual = pimPamPum.run(7);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste divisível por 3 e conter digito 3
    public void testRun_DivisivelPor3Conter3() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PimPimPim";
        String atual = pimPamPum.run(33);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste divisível por 3 e 5 e conter digito 5
    public void testRun_DivisivelPor3Por5Conter5() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PimPamPam";
        String atual = pimPamPum.run(15);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste divisível por 3 e 7
    public void testRun_DivisivelPor3Por7() {
        PimPamPum pimPamPum = new PimPamPum();
        String resultado = pimPamPum.run(21);
        assertTrue(resultado.contains("PimPum"));
    }

    @Test
    // Teste conter digito 3 e 5
    public void testRun_Conter3Conter5() {
        PimPamPum pimPamPum = new PimPamPum();
        String resultado = pimPamPum.run(53);
        assertTrue(resultado.contains("PamPim"));
    }

    @Test
    // Teste divisível por 3, conter digito 3, 5 e 7
    public void testRun_DivisivelPor3Conter3Conter5Conter7() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PimPumPamPim";
        String atual = pimPamPum.run(753);
        assertEquals(esperado, atual, "Esperado equivale ao atual");
    }

    @Test
    // Teste não ser divisível por 3 e 5
    public void testRun_NaoDivisivelPor3Por5() {
        PimPamPum pimPamPum = new PimPamPum();
        String resultado = pimPamPum.run(21);
        assertFalse(resultado.contains("PimPam"));
    }

    @Test
    // Teste não contém nenhum digito igual
    public void testRun_NaoConterDigitosIguais() {
        PimPamPum pimPamPum = new PimPamPum();
        String resultado = pimPamPum.run(22);
        assertTrue(resultado.contains("22"));
    }

    @Test
    // Teste para números negativos
    public void testRun_NumeroNegativo() {
        PimPamPum pimPamPum = new PimPamPum();
        assertThrows(IllegalArgumentException.class, () -> pimPamPum.run(-5));
    }

    @Test
    // Teste ser número zero
    public void testRun_NumeroZero() {
        PimPamPum pimPamPum =new PimPamPum();
        String esperado = "PimPamPum";
        String atual = pimPamPum.run(0);
        assertEquals(esperado, atual, "O resultado de numero zero e 'PimPamPum'");
    }
}