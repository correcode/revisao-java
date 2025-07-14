public class Palindromo {

    public static void main(String[] args) {

        String palavra1 = "ovo";
        String palavra2 = "cobra";

        System.out.println(palavra1 + " é palindromo ? " + ehPalindromo(palavra1));
        System.out.println(palavra2 + " é palindromo ? " + ehPalindromo(palavra2));

    }

    public static boolean ehPalindromo(String texto) {

        int esquerdo = 0;
        int direito = texto.length() -1;

        while (esquerdo < direito) {
            if (texto.charAt(esquerdo) != texto.charAt(direito)) {
                return false;
            }
            esquerdo++;
            direito--;
        }
        return true;
    }
}
