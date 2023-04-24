package br.com.fintech.fiap.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Usuario {


    private int codigoUsuario;
    private String nomeUsuario;
    private Date dataNascimento;
    private String genero;
    private String email;
    private String senha;

    public Usuario() {
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Usuario setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}