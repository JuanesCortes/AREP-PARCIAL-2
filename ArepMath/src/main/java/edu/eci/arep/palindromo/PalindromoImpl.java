package edu.eci.arep.palindromo;

/**
 *
 * @author juan.cortes-p
 */
public class PalindromoImpl {

    public static String isPalindromo(String cadena) {
        boolean valid = true;
        for (int i = 0; i < cadena.length(); i++) {
            if (!cadena.substring(i, i + 1).equals(cadena.substring(cadena.length() - 1 - i, cadena.length() - i))) {
                valid = false;
            }
        }
        String res = "{\"operation\": \"palíndromo\", \"input\":  \""+cadena+"\", \"output\":  \"Si es palíndromo\"}";
        if (!valid) {
            res = "{\"operation\": \"palíndromo\", \"input\":  \""+cadena+"\", \"output\":  \"No es palíndromo\"}";
        }
        return res;
    }
}
