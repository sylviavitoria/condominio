package com.sylviavitoria.arquiteturahexagonal.core.domain;

public class Usuario{
    private Long id;
    private String email;
    private String senha;
    private Boolean admin;
    private Long idPessoa;

    public Usuario() {
    }

    public Usuario(Long id, String email, String senha, Boolean admin) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    
}
    

