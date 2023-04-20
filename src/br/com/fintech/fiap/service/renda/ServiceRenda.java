package br.com.fintech.fiap.service.renda;


import br.com.fintech.fiap.entity.Renda;

import java.util.HashMap;
import java.util.Map;

public class ServiceRenda implements RendaInterface {


    private Map<Integer, Renda> rendas;

    @Override
    public Renda cadastrarRenda(int codigoRenda, String nomeRenda, String descRenda, double valorRenda, String dataRenda) {

        rendas = new HashMap();

        Renda renda = new Renda();

        renda.setCodigoRenda(codigoRenda);
        renda.setNomeRenda(nomeRenda);
        renda.setDescRenda(descRenda);
        renda.setValorRenda(valorRenda);
        renda.setDataRenda(dataRenda);

        rendas.put(renda.getCodigoRenda(), renda);

        System.out.println("Renda \"" + renda.getNomeRenda() + "\" cadastrada com sucesso!");

        return renda;
    }
}
