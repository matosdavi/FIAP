package br.com.fintech.fiap.service.cartao;

import br.com.fintech.fiap.entity.Cartao;

import java.util.HashMap;
import java.util.Map;

public class ServiceCartao implements CartaoInterface {

    private Map<Integer, Cartao> cartoes;

    @Override
    public Cartao cadastrarCartao(int codigoCartao, String nomeCartao, String descCartao, String numCartao, String dataVencimento, String numCvv, double valorLimite) {

        cartoes = new HashMap();

        Cartao cartao = new Cartao();

        cartao.setCodigoCartao(codigoCartao);
        cartao.setNomeCartao(nomeCartao);
        cartao.setDescCartao(descCartao);
        cartao.setNumCartao(numCartao);
        cartao.setDataVencimento(dataVencimento);
        cartao.setNumCvv(numCvv);
        cartao.setValorLimite(valorLimite);

        cartoes.put(cartao.getCodigoCartao(), cartao);

        System.out.println("Cartão \"" + cartao.getNomeCartao() + "\" cadastrado com sucesso!");

        return cartao;
    }
}