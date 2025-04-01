/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javinhademalandro;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Javinhademalandro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro lado");
        int primLado = teclado.nextInt();
        System.out.println("Digite o valor do segundoo lado");
        int segLado = teclado.nextInt();
        System.out.println("Digite o valor do segundoo lado");
        int terLado = teclado.nextInt();
         
        if (primLado>segLado && primLado>terLado){
            if (primLado + terLado > segLado) {
            System.out.println("o triangulo pode ser formado");
            }
            else {
            System.out.println("o triangulo nao pode ser formado");   
        }                 
        }
        
        if (segLado>primLado && segLado>terLado){
            if (primLado + terLado > segLado) {
            System.out.println("o triangulo pode ser formado");
            }
            else {
            System.out.println("o triangulo nao pode ser formado");   
        }          
        }
        
        if (terLado>segLado && terLado>primLado){
            if (primLado + segLado > terLado) {
            System.out.println("o triangulo pode ser formado");
            }
            else {
            System.out.println("o triangulo nao pode ser formado");   
        }                
        }
        
        if (primLado ==  segLado && primLado == terLado ){
        System.out.println("o triangulo é um equilatero");
        System.exit(0);
        }
        if (primLado ==  segLado || primLado == terLado ){
        System.out.println("o triangulo é um isosceles");
        }
        if (primLado !=  segLado && primLado != terLado ){
        System.out.println("o triangulo é um escaleno");
        }
    }
}
