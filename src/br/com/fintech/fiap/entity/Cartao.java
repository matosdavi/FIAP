package br.com.fintech.fiap.entity;

import java.time.LocalDate;
import java.util.List;

public class Cartao {

    private int codigoCartao;
    private String nomeCartao;
    private String descCartao;
    private String numCartao;
    private LocalDate dataVencimento;
    private String numCvv;
    private double valorLimite;
    private List<Cartao> listaCartao;

    public int getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(int codigoCartao) {
        this.codigoCartao = codigoCartao;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getDescCartao() {
        return descCartao;
    }

    public void setDescCartao(String descCartao) {
        this.descCartao = descCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNumCvv() {
        return numCvv;
    }

    public void setNumCvv(String numCvv) {
        this.numCvv = numCvv;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }

    public List<Cartao> getListaCartao() {
        return listaCartao;
    }

    public void setListaCartao(List<Cartao> listaCartao) {
        this.listaCartao = listaCartao;
    }
}