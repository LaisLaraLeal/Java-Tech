/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
 Scanner sc = new Scanner(System.in); 
 
 
 String nome;
 double peso, altura, IMC ; 
 int idade;
 
 
 System.out.println("Digite o seu nome : ");
  nome = sc.next();
                
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        
        System.out.println("Digite o seu peso: ");
        peso = sc.nextDouble();
        
        System.out.println("Digite a sua altura: ");
       altura = sc.nextDouble();
         
       
       IMC = peso/(altura * altura);
       
      
         
       if (IMC<18.5){
           System.out.println ("Abaixo do peso normal ");         
       }

       else if (IMC<=24.9) {
       System.out.println("Sua Classificacao Foi: Peso normal ");
       }
       
       else if (IMC<=29.9) {
       System.out.println("Sua Classificacao Foi: excesso de peso ")
       ;}
       
       else if (IMC<=34.9) {
       System.out.println("Sua Classificacao Foi: Obesidade Classe I ")
       ;}
       
       else if (IMC<=39.9) {
       System.out.println("Sua Classificacao Foi: Obesidade Classe II ");
       }
       
       else {
               System.out.println("Sua Classificacao Foi: Obesidade Classe III");
               }
       
       
    
        System.out.println("Nome: "+nome+" Idade: "+idade); 
        System.out.println("peso: "+peso+" Altura: "+altura); 
        System.out.println("Seu IMC É: "+IMC); 
        
    }
    
}
 

