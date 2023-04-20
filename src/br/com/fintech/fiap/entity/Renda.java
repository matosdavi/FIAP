package br.com.fintech.fiap.entity;

public class Renda {

    private int codigoRenda;
    private String nomeRenda;
    private String descRenda;
    private double valorRenda;
    private String dataRenda;

    public int getCodigoRenda() {
        return codigoRenda;
    }

    public void setCodigoRenda(int codigoRenda) {
        this.codigoRenda = codigoRenda;
    }

    public String getNomeRenda() {
        return nomeRenda;
    }

    public void setNomeRenda(String nomeRenda) {
        this.nomeRenda = nomeRenda;
    }

    public String getDescRenda() {
        return descRenda;
    }

    public void setDescRenda(String descRenda) {
        this.descRenda = descRenda;
    }

    public double getValorRenda() {
        return valorRenda;
    }

    public void setValorRenda(double valorRenda) {
        this.valorRenda = valorRenda;
    }

    public String getDataRenda() {
        return dataRenda;
    }

    public void setDataRenda(String dataRenda) {
        this.dataRenda = dataRenda;
    }
}