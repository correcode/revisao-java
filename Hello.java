public class Hello{
    public static void main(String[] args) {


        int[] numeros = {1,2,3,4,5,6,7,8};
        boolean temPar = false;

        for(int numero : numeros){
            if (numero % 2 == 0){
                System.out.println("Numero par: " + numero + " : ");
                temPar = true;
            }
        } if (!temPar){
            System.out.println("Não há numeros pares no array");
           }
    }
}




