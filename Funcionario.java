public class Funcionario {
    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual() {
        return salarioMensal * 12;
    }

    public void aumentarSalario(double percentual) {
        salarioMensal += salarioMensal * percentual / 100.0;
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ana", 2500.0);
        System.out.println("Salário mensal: " + f.salarioMensal);
        System.out.println("Salário anual: " + f.salarioAnual());
        f.aumentarSalario(10.0);
        System.out.println("Novo salário mensal após aumento de 10%: " + f.salarioMensal);
    }
}
