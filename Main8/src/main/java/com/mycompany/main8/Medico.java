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
public class Medico extends Funcionario{
    
    private String crm;

    public Medico(String crm, String CPF, String RG, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNasc, int id, String nome, String telefone, String email, Endereco endereco) {
        super(CPF, RG, matricula, setor, salario, genero, estadoCivil, dataNasc, id, nome, telefone, endereco, email);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\ninformações Medico" + super.toString() + "\ncrm:" + crm;
    }
    
    
    
}
