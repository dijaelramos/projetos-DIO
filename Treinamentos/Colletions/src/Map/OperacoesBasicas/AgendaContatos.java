package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public  void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Dijael", 12345);
        agendaContatos.adicionarContato("Dijael R", 22345);
        agendaContatos.adicionarContato("Dijael F", 42345);
        agendaContatos.adicionarContato("Dijael", 32345);
        agendaContatos.adicionarContato("Dijael Teste", 12345);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Dijael F");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Dijael R"));
    }
}
