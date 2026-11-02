package TopicosPOO.MembrosEstaticos.TesteStatic;

import java.util.ArrayList;

public class testClass {

    static ArrayList<testClass> alunos = new ArrayList<>();

    public static void addAluno(testClass aluno) {
        alunos.add(aluno);
    }

    private String name;
    private double age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public testClass(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=  " + name +
                ", age=" + age;
    }
}
