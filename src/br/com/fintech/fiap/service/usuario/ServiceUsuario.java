package br.com.fintech.fiap.service.usuario;

import br.com.fintech.fiap.entity.Usuario;

public class ServiceUsuario implements UsuarioInterface {

    @Override
    public Usuario cadastrarUsuario(int codigoUsuario, String nomeUsuario, String dataNascimento, String genero, String email, String senha) {

        Usuario usuario = new Usuario();

        usuario.setCodigoUsuario(codigoUsuario);
        usuario.setNomeUsuario(nomeUsuario);
        usuario.setDataNascimento(dataNascimento);
        usuario.setGenero(genero);
        usuario.setEmail(email);
        usuario.setSenha(senha);

        System.out.println("Usuário \"" + usuario.getNomeUsuario() + "\" cadastrado com sucesso!");

        return usuario;
    }
}