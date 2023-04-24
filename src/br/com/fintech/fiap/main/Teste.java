package br.com.fintech.fiap.main;

import br.com.fintech.fiap.dao.UsuarioDAO;
import br.com.fintech.fiap.entity.Renda;
import br.com.fintech.fiap.entity.Usuario;
import br.com.fintech.fiap.service.cartao.ServiceCartao;
import br.com.fintech.fiap.service.gasto.ServiceGasto;
import br.com.fintech.fiap.service.renda.ServiceRenda;
import br.com.fintech.fiap.service.usuario.ServiceUsuario;

import java.sql.SQLException;

public class Teste {

    public static void main(String[] args) throws SQLException {

        UsuarioDAO dao = new UsuarioDAO();

        Usuario davi = new Usuario();

        davi.setCodigoUsuario(1);
        davi.setNomeUsuario("Davi Matos");
        davi.setGenero("Masculino");
        davi.setEmail("davi@fiap.com");
        davi.setSenha("123@Davi");


        dao.insert(davi);
    }

//        //Adicionando um Usuário
//        ServiceUsuario usuario = new ServiceUsuario();
//
//        usuario.cadastrarUsuario(1,
//                "Davi Matos",
//                "21/03/2003",
//                "Masculino",
//                "davi.matos@fiap.com.br",
//                "davi123matos");
//
//        //Adicionando uma Renda
//        ServiceRenda renda1 = new ServiceRenda();
//
//        renda1.cadastrarRenda(1,
//                "Salário",
//                "Salário \"Empresa X\" quinto dia útil",
//                4.500,
//                "05/xx/2023");
//
//        //Adicionando um Gasto
//        ServiceGasto gasto = new ServiceGasto();
//
//        gasto.cadastrarGasto(1,
//                "Loja X",
//                "Compras na Loja X no fim de semana",
//                500,
//                "15/04/2023");
//
//
//        //Adicionando uma Meta
//
//        //Adicionando um Cartão
//        ServiceCartao cartao = new ServiceCartao();
//
//        cartao.cadastrarCartao(1,
//                "Visa Santander",
//                "Cartao Santander com 5000 de limite",
//                "1234 2345 3456 4567",
//                "21/12/2028",
//                "472",
//                5000);
//
//        //Adicionando um Investimento
//

}