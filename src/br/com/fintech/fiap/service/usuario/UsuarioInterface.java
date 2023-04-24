package br.com.fintech.fiap.service.usuario;

import br.com.fintech.fiap.entity.Usuario;

import javax.xml.crypto.Data;

public interface UsuarioInterface {

    public Usuario cadastrarUsuario(int codigoUsuario, String nomeUsuario, Data dataNascimento, String genero, String email, String senha);
}