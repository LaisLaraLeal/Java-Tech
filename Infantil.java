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
public class Infantil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
 Scanner sc = new Scanner(System.in); 
 
 int idade; 
 String nome;
 
 
 System.out.println("Digite o nome da crianca: ");
        nome = sc.next();
                
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
         
       if (idade<=2){
           System.out.println ("encaminhar "+nome +" ao bercario ");         
       }

       else if (idade<=4) {
       System.out.println( "encaminhar "+nome +" ao Infantil A ");
       }
       
       else if (idade<=5) {
       System.out.println("encaminhar "+nome +" ao Infantil B ")
       ;}
       
       else if (idade<=6) {
       System.out.println("encaminhar "+nome +" ao Infantil C ");
       }
       
       else {
               System.out.println("Encaminhar "+nome+" Para outro lugar");
               }
       
       
    
         
         
         
         
         
         
         
    }
    
}
 

