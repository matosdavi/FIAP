package br.com.fintech.fiap.entity;

import java.time.LocalDate;

public class Renda {

    private int codigoRenda;
    private String nomeRenda;
    private String descRenda;
    private double valorRenda;
    private LocalDate dataRenda;

    public Renda() {
    }

    public int getCodigoRenda() {
        return codigoRenda;
    }

    public Renda setCodigoRenda(int codigoRenda) {
        this.codigoRenda = codigoRenda;
        return this;
    }

    public String getNomeRenda() {
        return nomeRenda;
    }

    public Renda setNomeRenda(String nomeRenda) {
        this.nomeRenda = nomeRenda;
        return this;
    }

    public String getDescRenda() {
        return descRenda;
    }

    public Renda setDescRenda(String descRenda) {
        this.descRenda = descRenda;
        return this;
    }

    public double getValorRenda() {
        return valorRenda;
    }

    public Renda setValorRenda(double valorRenda) {
        this.valorRenda = valorRenda;
        return this;
    }

    public LocalDate getDataRenda() {
        return dataRenda;
    }

    public Renda setDataRenda(LocalDate dataRenda) {
        this.dataRenda = dataRenda;
        return this;
    }

    @Override
    public String toString() {
        return "Renda{" +
                "codigoRenda=" + codigoRenda +
                ", nomeRenda='" + nomeRenda + '\'' +
                ", descRenda='" + descRenda + '\'' +
                ", valorRenda=" + valorRenda +
                ", dataRenda=" + dataRenda +
                '}';
    }
}