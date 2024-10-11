import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println("Produto: " + produto.getNome() + ", Preço com desconto: " + precoComDesconto);
        }
    }
}
