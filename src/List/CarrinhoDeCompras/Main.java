package List.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("arroz", 10.40, 1);
        carrinhoDeCompras.adicionarItem("feijão", 15.30, 2);
        carrinhoDeCompras.adicionarItem("macarrão", 21.00, 3);

        carrinhoDeCompras.exibirItens();

        System.out.println("valor total do carrinho = " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("arroz");

        carrinhoDeCompras.exibirItens();

        System.out.println("valor total do carrinho = " + carrinhoDeCompras.calcularValorTotal());
    }
}
