public class Aluno {
    String nome;
    String ra;
    double nota;






    public Aluno(String nome, String ra, double nota) {
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
    }
    public String toString() {
        return "Nome: " + nome + ", RA: " + ra + ", Nota: " + nota;
    }
}

