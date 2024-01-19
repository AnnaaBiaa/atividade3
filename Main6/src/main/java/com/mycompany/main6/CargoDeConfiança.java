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
public abstract class CargoDeConfiança extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfiança(Bonificacao bonificacao, String nome, String CPF, String RG, Setor setor, Genero genero, double SalarioBase, LocalDate dataAdmissao) {
        super(nome, CPF, RG, setor, genero, SalarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

  
}
