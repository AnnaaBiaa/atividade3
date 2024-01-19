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
public class Advogado extends Funcionario{
       
    private String oab;

    public Advogado(String oab, String CPF, String RG, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNasc, int id, String nome, String telefone, String email, Endereco endereco) {
        super(CPF, RG, matricula, setor, salario, genero, estadoCivil, dataNasc, id, nome, telefone, endereco, email);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\ninformações Advogado\n" + super.toString() + "oab:" + oab;
    }
   
}
