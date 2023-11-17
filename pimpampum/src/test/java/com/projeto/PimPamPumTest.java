package com.projeto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PimPamPumTest {

    @Test
    // Teste divisível por 3
    public void testRun_numDivisivelPor3() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "Pim";
        String atual = pimPamPum.run(9);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste divisível por 5
    public void testRun_numDivisivelPor5() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "Pam";
        String atual = pimPamPum.run(10);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste divisivel por 7
    public void testRun_DivisivelPor7() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "Pum";
        String atual = pimPamPum.run(14);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste se número não for divisivel por nenhum
    public void testRun_NumNaoDivisivel() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "11";
        String atual = pimPamPum.run(11);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste de ser divisivel por 5 e conter 5
    public void testRun_DivisivelPor5Conter5() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PamPam";
        String atual = pimPamPum.run(5);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste de ser divisiel por 3 e conter digito 3
    public void testRun_DivisivelPor3ConterDigito3() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PimPimPim";
        String atual = pimPamPum.run(33);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste de conter o digito 5
    public void testRun_ConterDigito5() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PamPam";
        String atual = pimPamPum.run(5);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste de ser divisivel por 7 e conter o digito 7
    public void testRun_DivisivelPor7ConterDigito7() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PumPum";
        String atual = pimPamPum.run(7);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste de ser divisivel por 3 e 5 e conter digito 5
    public void testRun_DivisivelPor3DivisivelPor5ConterDigito5() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PimPamPam";
        String atual = pimPamPum.run(15);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste de ser divisivel por 3 e 7
    public void testRun_DivisivelPor3DivisivelPor7() {
        PimPamPum pimPamPum = new PimPamPum();
        String resultado = pimPamPum.run(21);
        assertTrue(resultado.contains("PimPum"));
    }

    @Test
    // Teste de conter digito 3 e digito 5
    public void testRun_ConterDigito3ConterDigito5() {
        PimPamPum pimPamPum = new PimPamPum();
        String resultado = pimPamPum.run(53);
        assertTrue(resultado.contains("PamPim"));
    }

    @Test
    // Teste de ser divisivel por 3, conter digito 3, 5 e 7
    public void testRun_DivisivelPor3ConterDigito3ConterDigito5ConterDigito7() {
        PimPamPum pimPamPum = new PimPamPum();
        String esperado = "PimPumPamPim";
        String atual = pimPamPum.run(753);
        assertEquals(esperado, atual);
    }

    @Test
    // Teste ser divisivel por 3 e 5 ao mesmo tempo
    public void testRun_DivisivelPor3MasNaoPor5() {
        PimPamPum pimPamPum = new PimPamPum();
        String resultado = pimPamPum.run(21);
        assertFalse(resultado.contains("PimPam"));
    }
}