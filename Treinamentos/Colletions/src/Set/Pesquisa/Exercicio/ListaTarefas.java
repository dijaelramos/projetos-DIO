package Set.Pesquisa.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        Tarefa tarefasParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefasParaRemover);
        }
    }
    public void exibirTarefas() {
        if (!tarefasSet.isEmpty())
        System.out.println(tarefasSet);
    }
    public int contarTarefas() {
        return tarefasSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        } return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        } return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        Tarefa marcarComoPendente = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                marcarComoPendente = t;
                break;
            }
        }
        if (marcarComoPendente != null) {
            if(marcarComoPendente.isConcluida()) {
                marcarComoPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }
    public void limparListaTarefas() {
        if(tarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefasSet.clear();
            System.out.println("Todas as tarefas deletadas!! {" + tarefasSet.size() + "}");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas l = new ListaTarefas();

        // Adicionando tarefas à lista
        l.adicionarTarefa("Estudar Java");
        l.adicionarTarefa("Academia");
        l.adicionarTarefa("Organizar a mesa de trabalho");
        l.adicionarTarefa("Ler livro");
        l.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        l.exibirTarefas();

        // Removendo uma tarefa
        l.removerTarefa("Academia");
        l.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + l.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(l.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        l.marcarTarefaConcluida("Ler livro");
        l.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(l.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        l.marcarTarefaPendente("Estudar Java");
        l.exibirTarefas();

        // Limpando a lista de tarefas
        l.limparListaTarefas();
        l.exibirTarefas();
    }
}
