package com.projeto;

public class Main {

    public static void main(String[] args) {

        PimPamPum programa = new PimPamPum();
        int num = 15;
        String resultado = programa.run(num);
        System.out.println(num + " => " + resultado);
    }
    
}
