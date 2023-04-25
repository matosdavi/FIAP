package br.com.fintech.fiap.main;

import br.com.fintech.fiap.dao.CartaoDAO;
import br.com.fintech.fiap.dao.UsuarioDAO;
import br.com.fintech.fiap.entity.Cartao;
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

        CartaoDAO cartaoDAO = new CartaoDAO();

        Cartao visa = new Cartao();

        visa.setCodigoUsuario(3);
        visa.setCodigoCartao(1);
        visa.setNomeCartao("Visa Santander");
        visa.setNumCvv("1234 2345 3456 4567");
        visa.setDataVencimento(LocalDate.of(2029, 11, 01));
        visa.setNumCvv("012");
        visa.setValorLimite(5000.00);

        cartaoDAO.insert(visa);
    }
}