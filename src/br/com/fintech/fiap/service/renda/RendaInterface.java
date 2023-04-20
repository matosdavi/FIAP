package br.com.fintech.fiap.service.renda;

import br.com.fintech.fiap.entity.Renda;

public interface RendaInterface {

    public Renda cadastrarRenda(int codigoRenda, String nomeRenda, String descRenda, double valorRenda, String dataRenda);
}
