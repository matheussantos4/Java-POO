package Arrays.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Testando conhecimento ArrayList.

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Matheus");
        nomes.add("joao");
        nomes.add("Maria");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        nomes.remove(0);

        System.out.println(nomes.size() <= 0);

        System.out.println(nomes.getFirst());
        System.out.println(nomes.getLast());
    }
}
