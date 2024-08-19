package List.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
     private List<Tarefa> tarefaList = new ArrayList<>();

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
}
