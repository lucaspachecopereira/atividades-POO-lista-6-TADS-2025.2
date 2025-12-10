public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.5);
        System.out.println("Valor total (sem quantidade): " + p1.calcularValorTotal());
        Produto p2 = new Produto("Caderno", 15.0, 3);
        System.out.println("Valor total: " + p2.calcularValorTotal());
    }
}
