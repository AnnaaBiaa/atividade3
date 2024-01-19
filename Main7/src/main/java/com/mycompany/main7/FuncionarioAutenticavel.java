/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main7;

/**
 *
 * @author Ana Beatriz
 */
public abstract class FuncionarioAutenticavel extends Funcionario{
    
    protected String login;
    protected String senha;

    public FuncionarioAutenticavel(String login, String senha, String nome, String CPF, String RG, double salarioBase) {
        super(nome, CPF, RG, salarioBase);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlogin:" + login + "\nsenha:" + senha;
    }

    
}
