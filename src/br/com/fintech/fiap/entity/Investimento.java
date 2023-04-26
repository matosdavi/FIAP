package br.com.fintech.fiap.entity;

import java.time.LocalDate;

public class Investimento {

    private int codigoInvestimento;
    private String nomeInvestimento;
    private String descInvestimento;
    private double valorInvestimento;
    private LocalDate dataInvestimento;
    private double valorRendimento;

    public Investimento() {
    }

    public int getCodigoInvestimento() {
        return codigoInvestimento;
    }

    public Investimento setCodigoInvestimento(int codigoInvestimento) {
        this.codigoInvestimento = codigoInvestimento;
        return this;
    }

    public String getNomeInvestimento() {
        return nomeInvestimento;
    }

    public Investimento setNomeInvestimento(String nomeInvestimento) {
        this.nomeInvestimento = nomeInvestimento;
        return this;
    }

    public String getDescInvestimento() {
        return descInvestimento;
    }

    public Investimento setDescInvestimento(String descInvestimento) {
        this.descInvestimento = descInvestimento;
        return this;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public Investimento setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
        return this;
    }

    public LocalDate getDataInvestimento() {
        return dataInvestimento;
    }

    public Investimento setDataInvestimento(LocalDate dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
        return this;
    }

    public double getValorRendimento() {
        return valorRendimento;
    }

    public Investimento setValorRendimento(double valorRendimento) {
        this.valorRendimento = valorRendimento;
        return this;
    }

    @Override
    public String toString() {
        return "Investimento{" +
                "codigoInvestimento=" + codigoInvestimento +
                ", nomeInvestimento='" + nomeInvestimento + '\'' +
                ", descInvestimento='" + descInvestimento + '\'' +
                ", valorInvestimento=" + valorInvestimento +
                ", dataInvestimento=" + dataInvestimento +
                ", valorRendimento=" + valorRendimento +
                '}';
    }
}