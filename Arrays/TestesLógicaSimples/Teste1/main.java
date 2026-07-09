package Arrays.TestesLógicaSimples.Teste1;

public class main {
    static void main(String[] args) {

        String[] ListaNomes = new String[6];

        ListaNomes[0] = "Matheus";
        ListaNomes[1] = "Bruno";
        ListaNomes[2] = "Guilherme";
        ListaNomes[3] = "Vinicius";
        ListaNomes[4] = "Daniel";
        ListaNomes[5] = "Gabriel";

        for (int i = 0; i < ListaNomes.length; i++) {

            System.out.println(ListaNomes[i]);
        }
    }
}
