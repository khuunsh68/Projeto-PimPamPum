package org.projeto;

public class Main {
    public static void main(String[] args) {

        PimPamPum programa = new PimPamPum();
        int num = 15;

        try {
            String resultado = programa.run(num);
            System.out.println(num + " => " + resultado);
        } catch (IllegalArgumentException e) {
            System.err.println("Exceção: " + e.getMessage());
        }
    }
}