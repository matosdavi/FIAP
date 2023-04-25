package br.com.fintech.fiap.dao;

import br.com.fintech.fiap.entity.Meta;
import br.com.fintech.fiap.entity.Usuario;
import br.com.fintech.fiap.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MetaDAO {

    private Connection conexao;

    public MetaDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Usuario usuario, Meta meta) throws SQLException {
        String sql = "insert into t_meta"+
                "(cd_usuario," +
                "cd_meta, " +
                "nm_meta, " +
                "ds_meta, " +
                "vl_meta, " +
                "dt_inicio, " +
                "dt_termino " +
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
        stmt.setInt(2, meta.getCodigoMeta());
        stmt.setString(3, meta.getNomeMeta());
        stmt.setString(4, meta.getDescMeta());
        stmt.setDouble(5, meta.getValorMeta());
        stmt.setDate(6, Date.valueOf(meta.getDataInicio()));
        stmt.setDate(7, Date.valueOf(meta.getDataTermino()));

        stmt.execute();
        stmt.close();
    }

    public List<Meta> select() throws SQLException {

        List<Meta> metas = new ArrayList<>();
        String sql = "select * from t_meta order by cd_meta";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Meta meta = new Meta();
            meta.setCodigoMeta(rs.getInt("cd_meta"));
            meta.setNomeMeta(rs.getString("nm_meta"));
            meta.setDescMeta(rs.getString("ds_meta"));
            meta.setValorMeta(rs.getInt("vl_meta"));
            meta.setDataInicio(rs.getDate("dt_inicio").toLocalDate());
            meta.setDataTermino(rs.getDate("dt_termino").toLocalDate());

            metas.add(meta);
        }

        stmt.close();
        rs.close();

        return metas;
    }

    public Meta selectByCd(int codigoMeta) throws SQLException {
        Meta meta = null;
        String sql = "select * from t_meta where cd_meta = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            meta = new Meta();
            meta.setCodigoMeta(rs.getInt("cd_meta"));
            meta.setNomeMeta(rs.getString("nm_meta"));
            meta.setDescMeta(rs.getString("ds_meta"));
            meta.setValorMeta(rs.getInt("vl_meta"));
            meta.setDataInicio(rs.getDate("dt_inicio").toLocalDate());
            meta.setDataTermino(rs.getDate("dt_termino").toLocalDate());
        }

        stmt.close();
        rs.close();

        return meta;
    }

    public void delete(int codigoMeta) throws SQLException {
        String sql = "delete from t_meta where cd_meta = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(2, codigoMeta);
        stmt.execute();
        stmt.close();
    }
}