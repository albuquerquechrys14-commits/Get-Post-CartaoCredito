package com.dest1.credito.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class Credito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int nomeTitular;
    private int numCartaoPAN;
    private int dataValidade;
    private int CVV;

    public Credito() {
    }

    public Credito(int id, int nomeTitular, int numCartaoPAN, int dataValidade, int CVV) {
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.numCartaoPAN = numCartaoPAN;
        this.dataValidade = dataValidade;
        this.CVV = CVV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(int nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumCartaoPAN() {
        return numCartaoPAN;
    }

    public void setNumCartaoPAN(int numCartaoPAN) {
        this.numCartaoPAN = numCartaoPAN;
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
}
