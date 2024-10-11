abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract double calcularDesconto(double porcentagem);
}

class ProdutoEletronico extends Produto {
    private double taxaDesconto;

    public ProdutoEletronico(String nome, double preco, double taxaDesconto) {
        super(nome, preco);
        this.taxaDesconto = taxaDesconto;
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        double desconto = (porcentagem + taxaDesconto) / 100 * preco;
        return preco - desconto;
    }
}

class ProdutoRoupas extends Produto {
    public ProdutoRoupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (porcentagem / 100 * preco);
    }
}


