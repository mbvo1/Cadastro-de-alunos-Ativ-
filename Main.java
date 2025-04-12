import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sistema sistema = new Sistema();
        int op;













        
        do{
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Ver todos");
            System.out.println("3 - Buscar por RA");
            System.out.println("4 - Média da turma");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = in.nextInt();
            in.nextLine();

            if (op == 1) {
                System.out.print("Nome: ");
                String nome = in.nextLine();
                System.out.print("RA: ");
                String ra = in.nextLine();
                System.out.print("Nota: ");
                double nota = in.nextDouble();
                sistema.adicionar(nome, ra, nota);
                System.out.println("Aluno adicionado!");
            } else if (op == 2) {
                sistema.mostrarTodos();
            } else if (op == 3) {
                System.out.print("RA do aluno: ");
                String busca = in.nextLine();
                sistema.buscarPorRA(busca);
            } else if (op == 4) {
                sistema.mediaNotas();
            } else if (op == 0) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida.");
            }

        } while (op != 0);

        in.close();
    }
}
