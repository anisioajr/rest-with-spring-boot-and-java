package br.com.anisio.rest_with_spring_boot_and_java.util;

import br.com.anisio.rest_with_spring_boot_and_java.exception.UnsuportedMathOperationException;

public class NumberUtils {

    public static boolean isNumeric(String strNumero) {
        String numero = normalize(strNumero);
        return numero != null && numero.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double convertToDouble(String strNumero) {
        String numero = normalize(strNumero);
        if (numero == null || numero.isEmpty())
            throw new UnsuportedMathOperationException("Por favor, informe um número válido!");
        return Double.parseDouble(numero);
    }

    private static String normalize(String strNumero) {
        if (strNumero == null) return null;
        return strNumero.replace(",", ".");
    }
}
