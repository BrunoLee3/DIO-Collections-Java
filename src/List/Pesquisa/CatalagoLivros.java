package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoIncial, int anoFinal){

        List<Livro> livrosPorAno = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAno() >= anoIncial && l.getAno() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }

        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){

        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));

    }
}
