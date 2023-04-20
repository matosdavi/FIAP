package br.com.fintech.fiap.service.gasto;

import br.com.fintech.fiap.entity.Gasto;

public interface GastoInterface {

    public Gasto cadastrarGasto(int codigoGasto, String nomeGasto, String descGasto, double valorGasto, String dataGasto);
}
