/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 * Leia nove numeros inteiros em uma matriz 3x3, ao final, imprima os valores armazenados.
 * primeira dimensão linha, seg coluna
 */
public class Matriz1{

   
@SuppressWarnings("empty-statement")
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


int numeros[][] = new int [3][3];

for(int i=0; i<=2;i++){
    for(int j=0; j<=2;j++){
        System.out.println("Digite um numero: ");
        numeros[i][j] = sc.nextInt();
}
}

    System.out.println("Numeros Armazenados na Matriz de Dados:");
for(int i=0; i<=2;i++){
    System.out.println(" ");
     
    for(int j=0; j<=2;j++){
        System.out.print("Posiçao["+(i+1)+"]["+(j+1)+"] = "+numeros[i][j]+" ");
} 
}
}
}