package com.dio.concessionaria.concessionariaapi.honda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "honda")
public class Honda {

    @Id
    private Long id;

    @Column(name = "modelo")        //Não precisaria colocar pois é o mesmo nome, serviria se fosse nomes diferentes, mas eu quis colocar para melhor entendimento
    private String modelo;

    @Column(name = "cor")
    private String cor;

    @Column(name = "cilindradas")
    private float cilindradas;

    @Column(name = "ano")
    private int ano;

    @Column(name = "preço")
    private float preço;

    @Column(name = "quantPortas")
    private int quantPortas;


    public Long getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getCilindradas() {
        return cilindradas;
    }

    public int getAno() {
        return ano;
    }

    public float getPreço() {
        return preço;
    }

    public int getQuantPortas() {
        return quantPortas;
    }
}
