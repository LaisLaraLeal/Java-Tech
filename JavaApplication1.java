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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Double nota1, nota2, nota3, media;

 Scanner sc = new Scanner(System.in); 
 
 
 System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
                
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble(); 
        
         media= (nota1+ nota2+ nota3)/3;
         
         /*
         if (media>=6) { 
             System.out.println("Aprovado com media "+media);
         }
             
         else if (media<=
                 3)
         {System.out.println("reprovado com media "+media);  
         
         }
         else{System.out.println("recuperacao "+media);  
         
         }*/ 

       if (media<3){
           System.out.println ("Aluno Reprovado "+media);         
       }

       else if (media<=5.9) {
       System.out.println("Aluno de recuperacao "+media);
       }
       
       else {
               System.out.println("Aluno Aprovado "+media);
               }
       
       
    
         
         
         
         
         
         
         
    }
    
}
 

