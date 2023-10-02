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
public class vetor1 {

   
@SuppressWarnings("empty-statement")
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String nome[] = new String [5];

for(int i=0; i<=4;i++){
    System.out.println("Digite seu nome: ");
    nome[i] = sc.next();
}
for (int i=0; i<=4;i++){ 
    System.out.println("nome["+(i+1)+"]= "+nome[i]);
}
}   
} 