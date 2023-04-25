package br.com.fintech.fiap.dao;

import br.com.fintech.fiap.entity.Investimento;
import br.com.fintech.fiap.entity.Usuario;
import br.com.fintech.fiap.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvestimentoDAO {

    private Connection conexao;

    public InvestimentoDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Usuario usuario, Investimento investimento) throws SQLException {
        String sql = "insert into t_investimento" +
                "(cd_usuario," +
                "cd_investimento, " +
                "nm_investimento, " +
                "ds_investimento, " +
                "vl_investimento, " +
                "dt_investimento, " +
                "vl_rendimento_investimento" +
                ") " +
                "values" +
                "(?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?" +
                ")";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, usuario.getCodigoUsuario());
        stmt.setInt(2, investimento.getCodigoInvestimento());
        stmt.setString(3, investimento.getNomeInvestimento());
        stmt.setString(4, investimento.getDescInvestimento());
        stmt.setDouble(5, investimento.getValorInvestimento());
        stmt.setDate(6, Date.valueOf(investimento.getDataInvestimento()));
        stmt.setDouble(7, investimento.getValorRendimento());


        stmt.execute();
        stmt.close();
    }

    public List<Investimento> select() throws SQLException {

        List<Investimento> investimentos = new ArrayList<>();
        String sql = "select * from t_investimento order by cd_investimento";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Investimento investimento = new Investimento();
            investimento.setCodigoInvestimento(rs.getInt("cd_investimento"));
            investimento.setNomeInvestimento(rs.getString("nm_investimento"));
            investimento.setDescInvestimento(rs.getString("ds_investimento"));
            investimento.setValorInvestimento(rs.getDouble("vl_investimento"));
            investimento.setDataInvestimento(rs.getDate("dt_investimento").toLocalDate());
            investimento.setValorRendimento(rs.getDouble("vl_rendimento_investimento"));

            investimentos.add(investimento);
        }

        stmt.close();
        rs.close();

        return investimentos;
    }

    public Investimento selectByCd(int codigoInvestimento) throws SQLException {
        Investimento investimento = null;
        String sql = "select * from t_investimento where cd_investimento = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            investimento = new Investimento();
            investimento.setCodigoInvestimento(rs.getInt("cd_investimento"));
            investimento.setNomeInvestimento(rs.getString("nm_investimento"));
            investimento.setDescInvestimento(rs.getString("ds_investimento"));
            investimento.setValorInvestimento(rs.getDouble("vl_investimento"));
            investimento.setDataInvestimento(rs.getDate("dt_investimento").toLocalDate());
            investimento.setValorRendimento(rs.getDouble("vl_rendimento_investimento"));
        }

        stmt.close();
        rs.close();

        return investimento;
    }

    public void delete(int codigoInvestimento) throws SQLException {

        String sql = "delete from t_investimento where cd_investimento = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(2, codigoInvestimento);
        stmt.execute();
        stmt.close();
    }

}