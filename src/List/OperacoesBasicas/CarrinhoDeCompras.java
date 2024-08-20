package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }

        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for(Item i : carrinho){
            valorTotal += i.getPreco() * i.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

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
