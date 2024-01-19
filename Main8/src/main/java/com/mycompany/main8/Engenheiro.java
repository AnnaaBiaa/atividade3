/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main8;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro(String crea, String CPF, String RG, String matricula, Setor setor, int id, Genero genero, EstadoCivil estadoCivil, LocalDate dataNasc, int salario, String nome, String telefone, String email, Endereco endereco) {
        super(CPF, RG, matricula, setor, salario, genero, estadoCivil, dataNasc, id, nome, telefone, endereco, email);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\ninformações Engenheiro" + super.toString() + "crea:" + crea;
    }
    
    
    
}
