package thisEncapsulamentoConstrutores.GetterSetter.Ex1;


import java.util.Scanner;

public class Ex1main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario("Matheus", 1500.00, 52886676837L);
        Funcionario f2 = new Funcionario("Maria", 3000.00, 52886676838L);
        Funcionario f3 = new Funcionario("João", 2500.00, 52886676840L);

        f1.setnewsalario();

        System.out.println("ID: " + f1.getId() + " | " + "Nome: " + f1.getnome() + " | " + "CPF: " + f1.getcpf() + " | " + "Salário: " + f1.getsalario());
        System.out.println("ID: " + f2.getId() + " | " + "Nome: " + f2.getnome() + " | " + "CPF: " + f2.getcpf() + " | " + "Salário: " + f2.getsalario());
        System.out.println("ID: " + f3.getId() + " | " + "Nome: " + f3.getnome() + " | " + "CPF: " + f3.getcpf() + " | " + "Salário: " + f3.getsalario());

        sc.close();
    }
}
