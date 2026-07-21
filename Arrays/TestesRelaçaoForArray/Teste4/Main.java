package Arrays.TestesRelaçaoForArray.Teste4;

public class Main {
    public static void main(String[] args) {

        int[] listaDeInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Array de números inteiros. 

        int soma = 0;
        //Variável para acumular a soma.


        for (int i = 0; i < listaDeInt.length; i++)
        //Lógica de contador para percorrer o array e somar os índices.

        {
            soma = soma + listaDeInt[i];
        }

        System.out.println(soma);
    }
}
