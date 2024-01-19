/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main7;

/**
 *
 * @author Ana Beatriz
 */
public abstract class Funcionario {
    
    protected String nome;
    protected String CPF;
    protected String RG;
    protected double salarioBase;

    public Funcionario(String nome, String CPF, String RG, double salarioBase) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.salarioBase = salarioBase;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
     public abstract double getSalario();
     
      public abstract double setSalario();

    @Override
    public String toString() {
        return "nome:" + nome + "\nCPF:" + CPF + "\nRG:" + RG + "\nsalarioBase:" + salarioBase;
    }
  
}
