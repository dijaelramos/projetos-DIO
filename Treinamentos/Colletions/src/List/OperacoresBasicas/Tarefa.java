package List.OperacoresBasicas;

public class Tarefa {
    //Atributos
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}