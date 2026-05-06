package thisEncapsulamentoConstrutores.GetterSetter.Ex1;


import java.util.Scanner;

public class Ex1main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario("Matheus", 1500.00, 52886676837L);
        Funcionario f2 = new Funcionario("Maria", 3000.00, 52886676838L);
        Funcionario f3 = new Funcionario("João", 2500.00, 52886676840L);

        f1.getsalario();
        f1.setnewsalario();

        System.out.print(f1.getsalario());

        sc.close();
    }
}
