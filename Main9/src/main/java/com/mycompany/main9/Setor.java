/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main9;

/**
 *
 * @author Ana Beatriz
 */
public enum Setor {
    
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material de Construção"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimenticio");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
