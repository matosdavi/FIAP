package br.com.fintech.fiap.main;

import br.com.fintech.fiap.dao.CartaoDAO;
import br.com.fintech.fiap.dao.InvestimentoDAO;
import br.com.fintech.fiap.dao.RendaDAO;
import br.com.fintech.fiap.entity.Cartao;
import br.com.fintech.fiap.entity.Investimento;
import br.com.fintech.fiap.entity.Renda;
import br.com.fintech.fiap.entity.Usuario;

import java.sql.SQLException;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        UsuarioDAO usuarioDAO = new UsuarioDAO();
//        Usuario davi = new Usuario();
//
//        davi.setCodigoUsuario(3);
//        davi.setNomeUsuario("Davi Matos");
//        davi.setGenero("Masculino");
//        davi.setDataNascimento(LocalDate.of(2003, 03, 21));
//        davi.setEmail("davi@fiap.com");
//        davi.setSenha("123@Davi");
//
//        usuarioDAO.insert(davi);

//        CartaoDAO cartaoDAO = new CartaoDAO();
//        Cartao visa = new Cartao();
//        Usuario davi = new Usuario();

//        davi.setCodigoUsuario(3);
//        visa.setCodigoCartao(20);
//        visa.setNomeCartao("Visa Santander");
//        visa.setDescCartao("Cartão com 5k de limite usado para compras");
//        visa.setNumCartao("1234 2345 3456 4567");
//        visa.setDataVencimento(LocalDate.of(2029, 11, 01));
//        visa.setNumCvv("012");
//        visa.setValorLimite(5000.00);
//
//        cartaoDAO.insert(davi, visa);
//
//        RendaDAO rendaDAO = new RendaDAO();
//
//        Renda salario = new Renda();
//        Usuario davi = new Usuario();
//
//        davi.setCodigoUsuario(3);
//        salario.setCodigoRenda(4);
//        salario.setNomeRenda("Salário trabalho dev");
//        salario.setDescRenda("Salário todo dia 30");
//        salario.setValorRenda(5000.00);
//        salario.setDataRenda(LocalDate.of(2023, 04, 30));
//
//        rendaDAO.insert(davi, salario);

        InvestimentoDAO investimentoDAO = new InvestimentoDAO();

        Investimento selic = new Investimento();
        Usuario davi = new Usuario();

        davi.setCodigoUsuario(3);
        selic.setCodigoInvestimento(9);
        selic.setNomeInvestimento("Investimento SELIC");
        selic.setDescInvestimento("3% ao ano");
        selic.setValorInvestimento(3000.00);
        selic.setDataInvestimento(LocalDate.of(2022, 06, 20));
        selic.setValorRendimento(25);

        investimentoDAO.insert(davi, selic);
    }
}