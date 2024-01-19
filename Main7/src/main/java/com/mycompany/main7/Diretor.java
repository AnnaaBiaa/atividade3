/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main7;

/**
 *
 * @author Ana Beatriz
 */
public class Diretor extends FuncionarioAutenticavel{
    
   private double premio = 0.20;
   private double salario;

    public Diretor(double salario, String login, String senha, String nome, String CPF, String RG, double salarioBase) {
        super(login, senha, nome, CPF, RG, salarioBase);
        this.salario = salario;
    }

   
    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }
   
     public double getSalario() {
    return salario;
  }
     
     public double setSalario() {
    return salario;
  }

    @Override
    public String toString() {
        return "\ninformações Diretor\n" + super.toString() + "\npremio:" + premio + "\nsalario:" + salario;
    }
    
     
    
}
