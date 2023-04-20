package br.com.fintech.fiap.entity;

public class Investimento {

    private int codigoInvestimento;
    private String nomeInvestimento;
    private String descInvestimento;
    private double valorInvestimento;
    private String dataInvestimento;
    private String valorRendimento;

    public int getCodigoInvestimento() {
        return codigoInvestimento;
    }

    public void setCodigoInvestimento(int codigoInvestimento) {
        this.codigoInvestimento = codigoInvestimento;
    }

    public String getNomeInvestimento() {
        return nomeInvestimento;
    }

    public void setNomeInvestimento(String nomeInvestimento) {
        this.nomeInvestimento = nomeInvestimento;
    }

    public String getDescInvestimento() {
        return descInvestimento;
    }

    public void setDescInvestimento(String descInvestimento) {
        this.descInvestimento = descInvestimento;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public String getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(String dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    public String getValorRendimento() {
        return valorRendimento;
    }

    public void setValorRendimento(String valorRendimento) {
        this.valorRendimento = valorRendimento;
    }
}
