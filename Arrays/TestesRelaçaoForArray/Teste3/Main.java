package Arrays.TestesRelaçaoForArray.Teste3;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {4, 12, 7, 9, 25, 3, 18};

        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
                System.out.println(maior);
            }
        }
    }
}
