package br.com.fintech.fiap.service.usuario;

import br.com.fintech.fiap.entity.Usuario;

public interface UsuarioInterface {

    public Usuario cadastrarUsuario(int codigoUsuario, String nomeUsuario, String dataNascimento, String genero, String email, String senha);
}