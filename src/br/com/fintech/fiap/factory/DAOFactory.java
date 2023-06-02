package br.com.fintech.fiap.factory;

import br.com.fintech.fiap.dao.*;

public class DAOFactory {

    public static UsuarioDAO getUsuarioDAO() throws ClassNotFoundException {
        return new UsuarioDAO();
    }

    public static CartaoDAO getCartaoDAO() throws ClassNotFoundException {
        return new CartaoDAO();
    }

    public static GastoDAO getGastoDAO() throws ClassNotFoundException {
        return new GastoDAO();
    }

    public static InvestimentoDAO getInvestimentoDAO() throws ClassNotFoundException {
        return new InvestimentoDAO();
    }

    public static MetaDAO getMetaDAO() throws ClassNotFoundException {
        return new MetaDAO();
    }

    public static RendaDAO getRendaDAO() throws ClassNotFoundException {
        return new RendaDAO();
    }
}