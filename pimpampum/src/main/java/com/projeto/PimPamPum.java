package com.projeto;

public class PimPamPum {

    public String run(int num) {
        StringBuilder resultado = new StringBuilder();

        // Condições do programa
        if (num % 3 == 0) { // Divisível por 3
            resultado.append("Pim");
        }
        if (num % 5 == 0) { // Divisível por 5
            resultado.append("Pam");
        }
        if (num % 7 == 0) { // Divisível por 7
            resultado.append("Pum");
        }
        if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0) { // Caso não seja divisível
            resultado.append(num);
        }

        // Verificação se contém 3, 5 ou 7
        String numString = Integer.toString(num);
        for (char digito : numString.toCharArray()) {
            if (digito == '3') { // Contém digito 3
                resultado.append("Pim");
            }
            if (digito == '5') { // Contém digito 5
                resultado.append("Pam");
            }
            if (digito == '7') { // Contém digito 7
                resultado.append("Pum");
            }
        }

        return resultado.toString(); // Retorna o resultado como output
    }
}
