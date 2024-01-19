/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main7;

/**
 *
 * @author Ana Beatriz
 */
public class Motoboy extends Funcionario{
    
    private String placadamoto;
    private double salario;

    public Motoboy(String placadamoto, double salario, String nome, String CPF, String RG, double salarioBase) {
        super(nome, CPF, RG, salarioBase);
        this.placadamoto = placadamoto;
        this.salario = salario;
    }

     public double getSalario() {
    return salario;
  }
 public double setSalario() {
    return salario;
  }

    @Override
    public String toString() {
        return "\ninformações Motoboy\n" + super.toString() + "\nplacadamoto:" + placadamoto + "\nsalario:" + salario;
    }
     
     
}
