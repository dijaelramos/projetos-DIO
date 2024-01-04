package Ex_Enums;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "Sâo Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão")
    ;

    private String nome;
    private String sigla;
    
    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}