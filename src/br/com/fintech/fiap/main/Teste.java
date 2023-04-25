package br.com.fintech.fiap.main;

import br.com.fintech.fiap.dao.UsuarioDAO;
import br.com.fintech.fiap.entity.Usuario;
import java.sql.SQLException;
import java.sql.Date;

public class Teste {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UsuarioDAO dao = new UsuarioDAO();

        Usuario davi = new Usuario();

        davi.setCodigoUsuario(1);
        davi.setNomeUsuario("Davi Matos");
        davi.setGenero("Masculino");

        Date dataNascimento = new Date(2000, 10, 15);

        davi.setDataNascimento(dataNascimento);
        davi.setEmail("davi@fiap.com");
        davi.setSenha("123@Davi");

        java.util.Date dataNascimentoUtil = new java.util.Date();
// defina a data de nascimento no objeto java.util.Date

        java.sql.Date dataNascimentoSql = new java.sql.Date(dataNascimentoUtil.getTime());

// agora você pode usar o objeto java.sql.Date para salvar a data no banco de dados


        dao.insert(davi);
    }
}