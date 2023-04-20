package br.com.fintech.fiap.entity;

public class Gasto {

    private int codigoGasto;
    private String nomeGasto;
    private String descGasto;
    private double valorGasto;
    private String dataGasto;

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

    public String getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(String dataGasto) {
        this.dataGasto = dataGasto;
    }
}