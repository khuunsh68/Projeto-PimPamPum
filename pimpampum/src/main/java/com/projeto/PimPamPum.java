package com.projeto;

public class PimPamPum {

    public String run(int num) {
        StringBuilder resultado = new StringBuilder();
        boolean alterado = false;

        // Condições do programa
        if (num % 3 == 0) { // Divisível por 3
            resultado.append("Pim");
            alterado = true;
        }
        if (num % 5 == 0) { // Divisível por 5
            resultado.append("Pam");
            alterado = true;
        }
        if (num % 7 == 0) { // Divisível por 7
            resultado.append("Pum");
            alterado = true;
        }

        // Verificação se contém 3, 5 ou 7
        String numString = Integer.toString(num);
        for (char digito : numString.toCharArray()) {
            if (digito == '3') { // Contém digito 3
                resultado.append("Pim");
                alterado = true;
            }
            if (digito == '5') { // Contém digito 5
                resultado.append("Pam");
                alterado = true;
            }
            if (digito == '7') { // Contém digito 7
                resultado.append("Pum");
                alterado = true;
            }
        }
        
        // Não divisível por 3, 5 ou 7, nem contém digitos iguais
        if (!alterado) {
            resultado.append(num);
        }

        return resultado.toString(); // Retorna o resultado como output
    }
}
