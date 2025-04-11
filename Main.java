import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoManager manager = new AlunoManager();
        int opcao;

        do {
            System.out.println("\n--- SISTEMA DE CADASTRO DE ALUNOS ---");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Buscar por matrícula");
            System.out.println("4. Calcular média da turma");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    manager.adicionarAluno(nome, matricula, nota);
                    System.out.println("Aluno cadastrado!");
                    break;
                case 2:
                    manager.listarAlunos();
                    break;
                case 3:
                    System.out.print("Digite a matrícula: ");
                    String busca = sc.nextLine();
                    Aluno encontrado = manager.buscarPorMatricula(busca);
                    if (encontrado != null) {
                        System.out.println("Aluno encontrado: " + encontrado);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    double media = manager.calcularMedia();
                    System.out.printf("Média da turma: %.2f\n", media);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
