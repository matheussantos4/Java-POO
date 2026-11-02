package HerancaPolimorfismo.Ex1.src;

import HerancaPolimorfismo.Ex1.entities.Animal;
import HerancaPolimorfismo.Ex1.entities.Cachorro;
import HerancaPolimorfismo.Ex1.entities.Gato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal dog = new Cachorro("Chopp");
        Animal cat = new Gato("Caju");

        System.out.println(dog.getNome());
        dog.comer();
        dog.emitirSom();

        System.out.println(cat.getNome());
        cat.comer();
        cat.emitirSom();

    }
}
