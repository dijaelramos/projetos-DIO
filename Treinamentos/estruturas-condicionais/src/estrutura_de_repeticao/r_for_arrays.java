package estrutura_de_repeticao;

public class r_for_arrays {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        // Primeiro jeito de usar
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno do indice x=" + x + " é: " + alunos[x]);
        }
        // Segundo jeito de usar
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
