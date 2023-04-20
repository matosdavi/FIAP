package br.com.fintech.fiap.service.cartao;

import br.com.fintech.fiap.entity.Cartao;

public interface CartaoInterface {

    public Cartao cadastrarCartao(int codigoCartao, String nomeCartao, String descCartao, String numCartao, String dataVencimento, String numCvv, double valorLimite);
}
