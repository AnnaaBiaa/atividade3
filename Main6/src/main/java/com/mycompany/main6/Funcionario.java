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
public abstract class Funcionario {
   protected String nome;
   protected String CPF;
   protected String RG;
   protected Setor setor;
   protected Genero genero;
   protected double SalarioBase;
   protected LocalDate dataAdmissao;

    public Funcionario(String nome, String CPF, String RG, Setor setor, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.setor = setor;
        this.genero = genero;
        this.SalarioBase = SalarioBase;
        this.dataAdmissao = dataAdmissao;
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

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    
    public abstract double getSalarioFinal();
     
    //public abstract double setSalarioFinal();
    
    @Override
    public String toString() {
        return "\nnome:" + nome + "\nCPF:" + CPF + 
                "\nRG:" + RG + "\nsetor:" + setor + 
                "\ngenero:" + genero + "\nSalarioBase:" + SalarioBase + 
                "\ndataAdmissao:" + dataAdmissao;
    }
 
}
