package Arrays.TestesRelaçaoForArray.Teste5;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {4, 12, 7, 9, 25, 3, 18};
        //Array de numeros inteiros.

        int maior = numeros[0];
        //variável que vai comparar os elementos do array.

        for (int i = 0; i < numeros.length; i++)
        //simples contador para ir passando os elementos do array

        {
            if (numeros[i] > maior) {
                maior = numeros[i];

                //Lógica : se o elemento do array for maior que o anterior
                // iguale com a variável maior e a Printe.
            }
        }
        System.out.println(maior);
    }
}
