public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new ProdutoEletronico("Celular", 2300.00, 5.0);
        Produto produto2 = new ProdutoRoupas("Boné", 75.00);
        Produto produto3 = new ProdutoEletronico("Placa de video", 3000.00, 10.0);
        Produto produto4 = new ProdutoRoupas("Blusa", 160.00);

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        estoque.adicionarProduto(produto4);

        double porcentagemDesconto = 10.0;
        estoque.exibirPrecosComDesconto(porcentagemDesconto);
    }
}