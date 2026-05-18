package thisEncapsulamentoConstrutores.CadastroDeFuncionarios;

import java.util.Scanner;

public class Ex1main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario("", 0, 0L);

        do {
            System.out.print("Nome: ");
            f1.setnome(sc.nextLine());
            if (f1.getnome() == null || f1.getnome().isBlank()) {
                System.out.println("Nome Vazio! ");
            }
        }
        while (f1.getnome() == null || f1.getnome().isBlank());

        do {
            System.out.print("Salário: ");
            f1.setsalario(sc.nextDouble());
            if (f1.getsalario() < 1874 || f1.getsalario() > 3200) {
                System.out.println("Salário não permitido!");
            }
        } while (f1.getsalario() < 1874 || f1.getsalario() > 3200);

        do {
            System.out.print("CPF: ");
            f1.setcpf(sc.nextLong());
            if (String.valueOf(f1.getcpf()).length() != 11) {
                System.out.println("CPF Inválido! ");
            }
        } while (String.valueOf(f1.getcpf()).length() != 11);

        System.out.println("Nome: " + f1.getnome());
        System.out.println("Salário: " + f1.getsalario());
        System.out.println("CPF: " + f1.getcpf());

        /* Funcionario f1 = new Funcionario("Matheus", 1500.00, 52886676900L);
        Funcionario f2 = new Funcionario("Maria", 3000.00, 52886676838L);
        Funcionario f3 = new Funcionario("João");

        f1.setnewsalario();

        System.out.println("ID: " + f1.getId() + " | " + "Nome: " + f1.getnome() + " | " + "CPF: " + f1.getcpf() + " | " + "Salário: " + f1.getsalario());
        System.out.println("ID: " + f2.getId() + " | " + "Nome: " + f2.getnome() + " | " + "CPF: " + f2.getcpf() + " | " + "Salário: " + f2.getsalario());
        System.out.println("ID: " + f3.getId() + " | " + "Nome: " + f3.getnome() + " | " + "CPF: " + f3.getcpf() + " | " + "Salário: " + f3.getsalario());

        f1.setnome(""); */

        sc.close();
    }
}
