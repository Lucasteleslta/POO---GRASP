// Sistema simples de pedidos

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}

class Pedido {
    private Produto produto;
    private int quantidade;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }
}

class SistemaPedidosController {

    public Pedido criarPedido(String nomeProduto, double preco, int quantidade) {
        Produto produto = new Produto(nomeProduto, preco);
        return new Pedido(produto, quantidade);
    }

    public void exibirResumo(Pedido pedido) {
        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaPedidosController controller = new SistemaPedidosController();

        Pedido pedido = controller.criarPedido("Notebook", 3000.0, 2);

        controller.exibirResumo(pedido);
    }
}