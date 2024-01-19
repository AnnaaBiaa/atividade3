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
public abstract class Funcionario extends Fisica{
    
  
    protected String CPF;
    protected String RG;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    public Funcionario( String CPF, String RG, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNasc, int id, String nome, String telefone, Endereco endereco, String email) {
        super(genero, estadoCivil, dataNasc, id, nome, telefone, endereco, email);
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //@Override
   // public String toString() {
    //    return "\ninformações Funcionário\n" + super.toString() + 
      //          "\nCPF:" + CPF + "\nRG:" +
        //        RG + "\nmatricula:" + matricula +
             //"\nsetor:" + setor.getNome() + "\nsalario:" 
          //      + salario;
   //}
   
}
