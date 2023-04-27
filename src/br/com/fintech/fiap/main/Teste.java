package br.com.fintech.fiap.main;

import br.com.fintech.fiap.dao.*;
import br.com.fintech.fiap.entity.*;

import java.sql.SQLException;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario davi = new Usuario();

        davi.setCodigoUsuario(3);
        davi.setNomeUsuario("Davi Matos");
        davi.setGenero("Masculino");
        davi.setDataNascimento(LocalDate.of(2003, 03, 21));
        davi.setEmail("davi@fiap.com");
        davi.setSenha("123@Davi");

        usuarioDAO.insert(davi);

        CartaoDAO cartaoDAO = new CartaoDAO();
        Cartao visa = new Cartao();

        davi.setCodigoUsuario(3);
        visa.setCodigoCartao(20);
        visa.setNomeCartao("Visa Santander");
        visa.setDescCartao("Cartão com 5k de limite usado para compras");
        visa.setNumCartao("1234 2345 3456 4567");
        visa.setDataVencimento(LocalDate.of(2029, 11, 01));
        visa.setNumCvv("012");
        visa.setValorLimite(5000.00);

        cartaoDAO.insert(davi, visa);

        RendaDAO rendaDAO = new RendaDAO();
        Renda salario = new Renda();

        davi.setCodigoUsuario(3);
        salario.setCodigoRenda(4);
        salario.setNomeRenda("Salário trabalho dev");
        salario.setDescRenda("Salário todo dia 30");
        salario.setValorRenda(5000.00);
        salario.setDataRenda(LocalDate.of(2023, 04, 30));

        rendaDAO.insert(davi, salario);

        InvestimentoDAO investimentoDAO = new InvestimentoDAO();
        Investimento selic = new Investimento();

        davi.setCodigoUsuario(3);
        selic.setCodigoInvestimento(9);
        selic.setNomeInvestimento("Investimento SELIC");
        selic.setDescInvestimento("3% ao ano");
        selic.setValorInvestimento(3000.00);
        selic.setDataInvestimento(LocalDate.of(2022, 06, 20));
        selic.setValorRendimento(25);

        investimentoDAO.insert(davi, selic);

        MetaDAO metaDAO = new MetaDAO();
        Meta maio = new Meta();

        davi.setCodigoUsuario(3);
        maio.setCodigoMeta(9);
        maio.setNomeMeta("Meta para maio");
        maio.setDescMeta("Poupar 1000 reais no mês de maio");
        maio.setValorMeta(1000.00);
        maio.setDataInicio(LocalDate.of(2023, 05, 01));
        maio.setDataTermino(LocalDate.of(2023, 05, 31));

        metaDAO.insert(davi, maio);

        GastoDAO gastoDAO = new GastoDAO();
        Gasto mercado = new Gasto();

        davi.setCodigoUsuario(3);
        mercado.setCodigoGasto(57);
        mercado.setNomeGasto("Compra em Mercado X");
        mercado.setDescGasto("Compra do mês");
        mercado.setValorGasto(1200.00);
        mercado.setDataGasto(LocalDate.of(2023, 07, 06));

        gastoDAO.insert(davi, mercado);

//        System.out.println(usuarioDAO.select());
//        System.out.println(rendaDAO.select());
//        System.out.println(gastoDAO.select());
//        System.out.println(metaDAO.select());
//        System.out.println(cartaoDAO.select());
//        System.out.println(investimentoDAO.select());
    }
}