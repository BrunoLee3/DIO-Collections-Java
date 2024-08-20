package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
     private List<Tarefa> tarefaList;

     public ListaTarefas() {
          this.tarefaList = new ArrayList<>();
     }

     public void adicionarTarefa(String descricao){
          tarefaList.add(new Tarefa(descricao));
     }

     public void reomverTarefa(String descricao){
          List<Tarefa> tarefasParaRemover = new ArrayList<>();

          for(Tarefa t : tarefaList){
               if (t.get().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
               }
          }

          tarefaList.removeAll(tarefasParaRemover);
     }

     public int obterNumeroTotalTarefas(){
          return tarefaList.size();
     }

     public void obterDescricoesTarefas(){
          System.out.println(tarefaList);
     }

     public static void main(String[] args) {
          ListaTarefas listaTarefas = new ListaTarefas();

          System.out.println("número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

          listaTarefas.adicionarTarefa("tarefa 1");
          listaTarefas.adicionarTarefa("tarefa 1");
          listaTarefas.adicionarTarefa("tarefa 2");

          System.out.println("número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

          listaTarefas.reomverTarefa("Tarefa 1");

          System.out.println("número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

          listaTarefas.adicionarTarefa("tarefa 3");

          listaTarefas.obterDescricoesTarefas();
     }
}
