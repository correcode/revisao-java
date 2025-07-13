import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        int[] listNumber = new int[4];
        int soma = 0;

        for (int i = 0; i < 4; i++){
            System.out.println("Digite seu numero : " + (i+1) + " :");
            listNumber[i] = sc.nextInt();
            soma += listNumber[i];
        }
        System.out.println("A soma dos numero é : " + soma);

    }
}
