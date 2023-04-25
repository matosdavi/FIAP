package br.com.fintech.fiap.entity;

import java.time.LocalDate;

public class Meta {

    private int codigoMeta;
    private String nomeMeta;
    private String descMeta;
    private double valorMeta;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public int getCodigoMeta() {
        return codigoMeta;
    }

    public Meta setCodigoMeta(int codigoMeta) {
        this.codigoMeta = codigoMeta;
        return this;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public Meta setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
        return this;
    }

    public String getDescMeta() {
        return descMeta;
    }

    public Meta setDescMeta(String descMeta) {
        this.descMeta = descMeta;
        return this;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public Meta setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
        return this;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public Meta setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public Meta setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
        return this;
    }
}
