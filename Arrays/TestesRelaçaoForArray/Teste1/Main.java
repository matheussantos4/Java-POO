package Arrays.TestesRelaçaoForArray.Teste1;

public class Main {
    static void main(String[] args) {

        String[] ListaNomes = new String[6];

        ListaNomes[0] = "Matheus";
        ListaNomes[1] = "Bruno";
        ListaNomes[2] = "Guilherme";
        ListaNomes[3] = "Vinicius";
        ListaNomes[4] = "Daniel";
        ListaNomes[5] = "Gabriel";

        for (int i = 5; i >= 0; i--) {

            System.out.println(ListaNomes[i]);

        }
    }
}
