package br.com.fintech.fiap.entity;

public class Meta {

    private String nomeMeta;
    private String descMeta;
    private double valorMeta;
    private String dataMeta;

    public String getNomeMeta() {
        return nomeMeta;
    }

    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
    }

    public String getDescMeta() {
        return descMeta;
    }

    public void setDescMeta(String descMeta) {
        this.descMeta = descMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public String getDataMeta() {
        return dataMeta;
    }

    public void setDataMeta(String dataMeta) {
        this.dataMeta = dataMeta;
    }

    public void adicionarMeta(String nomeMeta, double valorMeta) {
        Meta meta = new Meta();
    }
}
