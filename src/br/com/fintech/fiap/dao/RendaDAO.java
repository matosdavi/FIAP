package br.com.fintech.fiap.dao;

import br.com.fintech.fiap.entity.Renda;
import br.com.fintech.fiap.entity.Usuario;
import br.com.fintech.fiap.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RendaDAO {

    private Connection conexao;

    public RendaDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Usuario usuario, Renda renda) throws SQLException {
        String sql = "insert into t_renda" +
                "(cd_usuario," +
                "cd_renda, " +
                "nm_renda, " +
                "ds_renda, " +
                "vl_renda, " +
                "dt_renda " +
                ") " +
                "values" +
                "(?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?" +
                ")";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, usuario.getCodigoUsuario());
        stmt.setInt(2, renda.getCodigoRenda());
        stmt.setString(3, renda.getNomeRenda());
        stmt.setString(4, renda.getDescRenda());
        stmt.setDouble(5, renda.getValorRenda());
        stmt.setDate(6, Date.valueOf(renda.getDataRenda()));

        stmt.execute();
        stmt.close();
    }

    public List<Renda> select() throws SQLException {

        List<Renda> rendas = new ArrayList<>();
        String sql = "select * from t_renda order by cd_renda";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Renda renda = new Renda();
            renda.setCodigoRenda(rs.getInt("cd_renda"));
            renda.setNomeRenda(rs.getString("nm_renda"));
            renda.setDescRenda(rs.getString("ds_renda"));
            renda.setValorRenda(rs.getDouble("vl_renda"));
            renda.setDataRenda(rs.getDate("dt_renda").toLocalDate());

            rendas.add(renda);
        }

        stmt.close();
        rs.close();

        return rendas;
    }

    public Renda selectByCd(int codigoRenda) throws SQLException {
        Renda renda = null ;
        String sql = "select * from t_renda where cd_renda = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            renda = new Renda();
            renda.setCodigoRenda(rs.getInt("cd_renda"));
            renda.setNomeRenda(rs.getString("nm_renda"));
            renda.setDescRenda(rs.getString("ds_renda"));
            renda.setValorRenda(rs.getDouble("vl_renda"));
            renda.setDataRenda(rs.getDate("dt_renda").toLocalDate());
        }

        stmt.close();
        rs.close();

        return renda;
    }

    public void delete(int codigoRenda) throws SQLException {

        String sql = "delete from t_renda where cd_renda = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(2, codigoRenda);
        stmt.execute();
        stmt.close();
    }

}