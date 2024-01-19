/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main6;

import java.time.LocalDate;

/**
 *
 * @author Ana Beatriz
 */
public class Gerente extends CargoDeConfiança{
    
    private double salario;

    public Gerente(Bonificacao bonificacao, String nome, String CPF, String RG, Setor setor, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, CPF, RG, setor, genero, SalarioBase, dataAdmissao);
    }

    public double getSalarioFinal() {
    return salario;
  }


    @Override
    public String toString() {
        return "\ninformações gerente\n" + super.toString();
    }

   
    
    
}
