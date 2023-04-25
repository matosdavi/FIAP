package br.com.fintech.fiap.dao;

import br.com.fintech.fiap.entity.Cartao;
import br.com.fintech.fiap.entity.Usuario;
import br.com.fintech.fiap.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartaoDAO {

    private Connection conexao;

    public CartaoDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Usuario usuario, Cartao cartao) throws SQLException {
        String sql = "insert into t_cartao" +
                "(cd_usuario," +
                "cd_cartao, " +
                "nm_cartao, " +
                "ds_cartao, " +
                "nr_cartao, " +
                "dt_vencimento, " +
                "nr_cvv, " +
                "vl_limite" +
                ") " +
                "values" +
                "(?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?" +
                ")";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, usuario.getCodigoUsuario());
        stmt.setInt(2, cartao.getCodigoCartao());
        stmt.setString(3, cartao.getNomeCartao());
        stmt.setString(4, cartao.getDescCartao());
        stmt.setString(5, cartao.getNumCartao());
        stmt.setDate(6, Date.valueOf(cartao.getDataVencimento()));
        stmt.setString(7, cartao.getNumCvv());
        stmt.setDouble(8, cartao.getValorLimite());


        stmt.execute();
        stmt.close();
    }

    public List<Cartao> select() throws SQLException {

        List<Cartao> cartoes = new ArrayList<>();
        String sql = "select * from t_cartao order by cd_cartao";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Cartao cartao = new Cartao();
            cartao.setCodigoCartao(rs.getInt("cd_cartao"));
            cartao.setNomeCartao(rs.getString("nm_cartao"));
            cartao.setDescCartao(rs.getString("ds_cartao"));
            cartao.setNumCartao(rs.getString("nr_cartao"));
            cartao.setDataVencimento(rs.getDate("dt_vencimento").toLocalDate());
            cartao.setNumCvv(rs.getString("nr_cvv"));
            cartao.setValorLimite(rs.getDouble("vl_limite"));

            cartoes.add(cartao);
        }

        stmt.close();
        rs.close();

        return cartoes;
    }

    public Cartao selectByCd(int codigoCartao) throws SQLException {
        Cartao cartao = null ;
        String sql = "select * from t_cartao where cd_cartao = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            cartao = new Cartao();
            cartao.setCodigoCartao(rs.getInt("cd_cartao"));
            cartao.setNomeCartao(rs.getString("nm_cartao"));
            cartao.setDescCartao(rs.getString("ds_cartao"));
            cartao.setNumCartao(rs.getString("nr_cartao"));
            cartao.setDataVencimento(rs.getDate("dt_vencimento").toLocalDate());
            cartao.setNumCvv(rs.getString("nr_cvv"));
            cartao.setValorLimite(rs.getDouble("vl_limite"));
        }

        stmt.close();
        rs.close();

        return cartao;
    }

    public void delete(int codigoCartao) throws SQLException {

        String sql = "delete from t_cartao where cd_cartao = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(2, codigoCartao);
        stmt.execute();
        stmt.close();
    }

}