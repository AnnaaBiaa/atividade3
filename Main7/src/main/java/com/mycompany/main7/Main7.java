/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main7;

/**
 *
 * @author Ana Beatriz
 */
public class Main7 {

    public static void main(String[] args) {
        Motoboy moto = new Motoboy("abc123", 1.800, "Rodolfo", "25072006", "60027052",1.500 );
        Diretor diretor = new Diretor(3.234, "direitor123@gmail.com", "74159", "Lili", "85214796", "7892436", 1.200);
        Gerente gerente = new Gerente(8.9, 3.567, "gerente 234", "gerente123", "Luis", "45879623", "43567890", 1.500);
        
        System.out.println(moto.toString());
        System.out.println(diretor.toString());
        System.out.println(gerente.toString());
    }
}
