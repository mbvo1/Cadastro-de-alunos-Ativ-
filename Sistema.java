import java.util.ArrayList;

public class Sistema {
    ArrayList<Aluno> lista = new ArrayList<>();

    public void adicionar(String nome, String ra, double nota) {
        Aluno novo = new Aluno(nome, ra, nota);
        lista.add(novo);
    }
    public void mostrarTodos() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;


        }
        for (Aluno a : lista) {
            System.out.println(a);
        }
    }

    public void buscarPorRA(String ra) {
        for (Aluno a : lista) {
            if (a.ra.equalsIgnoreCase(ra)) {
                System.out.println("Aluno encontrado: " + a);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void mediaNotas() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno para calcular média.");
            return;
        }

        double soma = 0;
        for (Aluno a : lista) {
            soma += a.nota;
        }

        double media = soma / lista.size();
        System.out.printf("Média da turma: %.2f\n", media);
    }
}
