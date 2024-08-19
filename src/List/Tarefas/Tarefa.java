package List.Tarefas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String get(){
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
