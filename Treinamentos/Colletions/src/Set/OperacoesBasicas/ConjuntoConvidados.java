package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
            }
        } convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return convidadoSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2234);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2234);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4234);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set convidados.");

        conjuntoConvidados.exibirConvidados();
    }
}
