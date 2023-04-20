package br.com.fintech.fiap.service.gasto;

import br.com.fintech.fiap.entity.Gasto;
import br.com.fintech.fiap.entity.Renda;

import java.util.HashMap;
import java.util.Map;

public class ServiceGasto implements GastoInterface {

    private Map<Integer, Gasto> gastos;

    @Override
    public Gasto cadastrarGasto(int codigoGasto, String nomeGasto, String descGasto, double valorGasto, String dataGasto) {

        gastos = new HashMap();

        Gasto gasto = new Gasto();

        gasto.setCodigoGasto(codigoGasto);
        gasto.setNomeGasto(nomeGasto);
        gasto.setDescGasto(descGasto);
        gasto.setValorGasto(valorGasto);
        gasto.setDataGasto(dataGasto);

        gastos.put(gasto.getCodigoGasto(), gasto);

        System.out.println("Gasto \"" + gasto.getNomeGasto() + "\" cadastrado com sucesso!");

        return gasto;
    }
}
