package br.com.fintech.fiap.dao;

import br.com.fintech.fiap.entity.Usuario;
import br.com.fintech.fiap.factory.ConnectionFactory;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Usuario usuario) throws SQLException {
        String sql = "insert into t_usuario" +
                "(cd_usuario," +
                "nm_usuario, " +
                "dt_nascimento, " +
                "ds_genero, " +
                "ds_email, " +
                "ds_senha" +
                ") " +
                "values" +
                "(?, " +
                "?, " +
                "?, " +
                "?, " +
                "?, " +
                "?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, usuario.getCodigoUsuario());
        stmt.setString(2, usuario.getNomeUsuario());
        stmt.setDate(3, (Date) usuario.getDataNascimento());
        stmt.setString(4, usuario.getGenero());
        stmt.setString(5, usuario.getEmail());
        stmt.setString(6, usuario.getSenha());

        stmt.execute();
        stmt.close();
    }

    public List<Usuario> select() throws SQLException {

        List<Usuario> usuarios = new ArrayList<>();
        String sql = "select * from t_usuario order by cd_usuario";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setCodigoUsuario(rs.getInt("cd_usuario"));
            usuario.setNomeUsuario(rs.getString("nm_usuario"));
            usuario.setDataNascimento(rs.getDate("dt_nascimento"));
            usuario.setGenero(rs.getString("ds_genero"));
            usuario.setEmail(rs.getString("ds_email"));
            usuario.setSenha(rs.getString("ds_senha"));

            usuarios.add(usuario);
        }

        stmt.close();
        rs.close();

        return usuarios;
    }

    public Usuario selectById(int codigoUsuario) throws SQLException {
        Usuario usuario = null ;
        String sql = "select * from t_usuario where cd_usuario = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            usuario = new Usuario();
            usuario.setCodigoUsuario(rs.getInt("cd_usuario"));
            usuario.setNomeUsuario(rs.getString("nm_usuario"));
            usuario.setDataNascimento(rs.getDate("dt_nascimento"));
            usuario.setGenero(rs.getString("ds_genero"));
            usuario.setEmail(rs.getString("ds_email"));
            usuario.setSenha(rs.getString("ds_senha"));
        }

        stmt.close();
        rs.close();

        return usuario;
    }

    public void delete(int codigoUsuario) throws SQLException {

        String sql = "delete from t_usuario where cd_usuario = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigoUsuario);
        stmt.execute();
        stmt.close();
    }

    public void update(Usuario usuario) throws SQLException {

        String sql = "update t_usuario set nm_usuario = ?, dt_nascimento = ?, ds_genero = ?, ds_email = ?, ds_senha = ?, where cd_usuario = ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, usuario.getNomeUsuario());
        stmt.setDate(2 , (Date) usuario.getDataNascimento());
        stmt.setString(3, usuario.getGenero());
        stmt.setString(4, usuario.getEmail());
        stmt.setString(5, usuario.getSenha());

        stmt.execute();
        stmt.close();
    }
}