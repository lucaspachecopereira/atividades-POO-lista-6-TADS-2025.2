public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome) {
        this(nome, 0.0, 0.0);
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double media() {
        return (nota1 + nota2) / 2.0;
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria");
        System.out.println("Média de " + a1.nome + ": " + a1.media());
        Aluno a2 = new Aluno("Vinicius", 7.5, 8.0);
        System.out.println("Média de " + a2.nome + ": " + a2.media());
    }
}
