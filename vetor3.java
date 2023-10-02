/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class vetor3 {

   
@SuppressWarnings("empty-statement")
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String nome[] = new String [5];
int idade[] = new int [5];

for(int i=0; i<=4;i++){
    System.out.println("Digite seu nome: ");
    nome[i] = sc.next(); 
    System.out.println("Digite sua idade: ");
    idade[i] = sc.nextInt();

}

for (int i=0; i<=4;i++){ 
    System.out.println("Posiçao["+(i+1)+"] = Nome: "+nome[i]+"  |Idade: "+idade[i]);
}
}   
} 