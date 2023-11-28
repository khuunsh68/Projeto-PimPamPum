package org.projeto;
public class PimPamPum {
    public String run(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Número escolhido não é permitido!");
        }

        StringBuilder resultado = new StringBuilder();
        boolean[] alterado = {false};

        verificaDivisibilidade(num, resultado, alterado);
        verificaDigitosContidos(num, resultado, alterado);
        imprimeProprioNumero(num, resultado, alterado);

        return resultado.toString();
    }

    private void verificaDivisibilidade(int num, StringBuilder resultado, boolean[] alterado) {
        // Verificação se é divisível
        if (num % 3 == 0) {
            resultado.append("Pim");
            alterado[0] = true;
        }
        if (num % 5 == 0) {
            resultado.append("Pam");
            alterado[0] = true;
        }
        if (num % 7 == 0) {
            resultado.append("Pum");
            alterado[0] = true;
        }
    }

    private void verificaDigitosContidos(int num, StringBuilder resultado, boolean[] alterado) {
        // Verificação se contém 3, 5 ou 7
        String numStr = Integer.toString(num);
        for (char digito : numStr.toCharArray()) {
            if(digito == '3') {
                resultado.append("Pim");
                alterado[0] = true;
            }
            if(digito == '5') {
                resultado.append("Pam");
                alterado[0] = true;
            }
            if(digito == '7') {
                resultado.append("Pum");
                alterado[0] = true;
            }
        }
    }

    private void imprimeProprioNumero(int num, StringBuilder resultado, boolean[] alterado) {
        // Não é divisível nem contém digitos iguais
        if(!alterado[0]) {
            resultado.append(num);
        }
    }
}