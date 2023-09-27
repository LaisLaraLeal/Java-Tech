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
public class Pesquisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
 Scanner sc = new Scanner(System.in); 
 
 
 String resp, nome, sexo, resposta;
 int idade;
 int contador = 0;
 int contmasc = 0;
 int contfem =0;
 
 
     
 System.out.println("Deseja responder a uma pesquisa da empresa X? Responda S para sim.");
        resp = sc.next();
 
 while (resp.equals("s")|resp.equals("S")){
        System.out.println("\nDigite o seu nome: ");
        nome = sc.next();
                
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        
        System.out.println("Digite o seu sexo: ");
       sexo = sc.next();
       
       System.out.println("Gostou do(s) produto(s) que experimentou? (Sim ou Nao)");
     resposta = sc.next();
      
       
        System.out.println("\nNome: "+nome+" Idade: "+idade+" Sexo: "+sexo); 
        System.out.println("Gostou do(s) produto(s) que experimentou? resposta: "+resposta); 
    
      
    
       if(sexo.equals("Masculino")|sexo.equals("masculino")|sexo.equals("masc")){
           contmasc++;
       }
       
       else if(sexo.equals("Feminino")|sexo.equals("feminino")|sexo.equals("fem")){
           contfem++;
       }

    contador++;
      
    System.out.println("\nDeseja reponder novamente? Responda S para sim");
      resp = sc.next();
 }
      
      System.out.println("\nQuantidade de vezes que responderam a essa pesquisa: "+contador);
      System.out.println("\nQuantidade de homens : "+contmasc);  
      System.out.println("\nQuantidade de Mulheres : "+contfem);  

    
}
}
 

