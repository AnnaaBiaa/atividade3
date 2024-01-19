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
public abstract class Fisica extends Pessoa{
    
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNasc;
    protected int idade;

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNasc, int id, String nome, String telefone, Endereco endereco, String email) {
        super(id, nome, telefone, endereco, email);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNasc = dataNasc;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    
     public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return   "\ngenero:" + genero.getTexto() + 
                "\nestadoCivil:" + estadoCivil.getTexto() + 
                "\ndataNasc:" + dataNasc + "\nidade:" + idade;
    }

    
   
   
    
    
    
    
}
