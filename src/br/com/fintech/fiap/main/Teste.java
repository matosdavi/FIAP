package br.com.fintech.fiap.main;

import br.com.fintech.fiap.dao.UsuarioDAO;
import br.com.fintech.fiap.entity.Usuario;

import java.sql.SQLException;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UsuarioDAO dao = new UsuarioDAO();

        Usuario davi = new Usuario();

        davi.setCodigoUsuario(3);
        davi.setNomeUsuario("Davi Matos");
        davi.setGenero("Masculino");
        davi.setDataNascimento(LocalDate.of(2003, 03, 21));
        davi.setEmail("davi@fiap.com");
        davi.setSenha("123@Davi");

        dao.insert(davi);
    }
}