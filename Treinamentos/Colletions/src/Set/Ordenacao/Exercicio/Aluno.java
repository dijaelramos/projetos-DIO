package Set.Ordenacao.Exercicio;

public class Aluno {
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "{" +
                nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}
