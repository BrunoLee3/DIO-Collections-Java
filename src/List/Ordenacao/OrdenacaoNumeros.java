package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscedente = new ArrayList<>(this.integerList);
        Collections.sort(numerosAscedente);
        return numerosAscedente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescedente = new ArrayList<>(this.integerList);
        numerosDescedente.sort(Collections.reverseOrder());
        return numerosDescedente;
    }

    public void exibirNumeros() {
        if (!integerList.isEmpty()) {
            System.out.println(this.integerList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
