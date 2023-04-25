package br.com.fintech.fiap.entity;

import java.time.LocalDate;

public class Gasto {

    private int codigoGasto;
    private String nomeGasto;
    private String descGasto;
    private double valorGasto;
    private LocalDate dataGasto;

    public int getCodigoGasto() {
        return codigoGasto;
    }

    public void setCodigoGasto(int codigoGasto) {
        this.codigoGasto = codigoGasto;
    }

    public String getNomeGasto() {
        return nomeGasto;
    }

    public void setNomeGasto(String nomeGasto) {
        this.nomeGasto = nomeGasto;
    }

    public String getDescGasto() {
        return descGasto;
    }

    public void setDescGasto(String descGasto) {
        this.descGasto = descGasto;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public LocalDate getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(LocalDate dataGasto) {
        this.dataGasto = dataGasto;
    }
}