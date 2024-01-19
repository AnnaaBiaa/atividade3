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
public class MotoBoy extends Funcionario{
    private String placadamoto;
    private double salario;

    public MotoBoy(String placadamoto, String nome, String CPF, String RG, Setor setor, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        super(nome, CPF, RG, setor, genero, SalarioBase, dataAdmissao);
        this.placadamoto = placadamoto;
    }

    public double getSalarioFinal() {
    return salario;
  }

    @Override
    public String toString() {
        return "\ninformações Motoboy" + super.toString() + "\nplacadamoto:" + placadamoto + "\nsalario:" + salario;
    }

    
    
}
    

