/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main6;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ana Beatriz
 */
public class Main6 { 
    public static void main(String[] args) {
        
        MotoBoy moto = new MotoBoy("avr467", "Luis", "54678932", "7892301", Setor.OPERACOES, Genero.FEMININO, 1.500, LocalDate.of(2006, Month.MARCH, 21));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "João", "435667890", "67890432", Setor.SAUDE, Genero.MASCULINO, 3.500, LocalDate.of(2001, Month.JULY, 1));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Lili", "78945623", "567231", Setor.SAUDE, Genero.FEMININO, 4.678, LocalDate.of(2000, Month.OCTOBER, 5));
        
        System.out.println(moto.toString());
        System.out.println(diretor.toString());
        System.out.println(gerente.toString());
        
        
        
        
        
        
    }
}    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 




