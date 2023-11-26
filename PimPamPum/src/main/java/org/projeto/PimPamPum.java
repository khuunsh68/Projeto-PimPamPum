package org.projeto;
public class PimPamPum {
    public String run(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Numero escolhido nao e permitido!");
        }

        StringBuilder resultado = new StringBuilder();
        boolean alterado = false;

        // Verificação se é divisível
        if (num % 3 == 0) {
            resultado.append("Pim");
            alterado = true;
        }
        if (num % 5 == 0) {
            resultado.append("Pam");
            alterado = true;
        }
        if (num % 7 == 0) {
            resultado.append("Pum");
            alterado = true;
        }

        // Verificação se contém 3, 5 ou 7
        String numStr = Integer.toString(num);
        for (char digito : numStr.toCharArray()) {
            if(digito == '3') {
                resultado.append("Pim");
                alterado = true;
            }
            if(digito == '5') {
                resultado.append("Pam");
                alterado = true;
            }
            if(digito == '7') {
                resultado.append("Pum");
                alterado = true;
            }
        }

        // Não é divisível nem contém digitos iguais
        if(!alterado) {
            resultado.append(num);
        }

        return resultado.toString();
    }
}