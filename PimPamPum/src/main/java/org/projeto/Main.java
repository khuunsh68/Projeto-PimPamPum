package org.projeto;

public class Main {
    public static void main(String[] args) {

        PimPamPum programa = new PimPamPum();
        int num = -37;
        String resultado = programa.run(num);
        System.out.println(num + " => " + resultado);
    }
}