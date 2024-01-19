/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main7;

/**
 *
 * @author Ana Beatriz
 */
public class Gerente extends FuncionarioAutenticavel{
    
    private double comissão;
    private double salario;

    public Gerente(double comissão, double salario, String login, String senha, String nome, String CPF, String RG, double salarioBase) {
        super(login, senha, nome, CPF, RG, salarioBase);
        this.comissão = comissão;
        this.salario = salario;
    }

    
    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }

    public double getSalario() {
    return salario;
  }
     public double setSalario() {
    return salario;
  }

    
    @Override
    public String toString() {
        return "\ninformações gerente\n" + super.toString() + "\ncomissão:" + comissão;
    }
   
    
}
