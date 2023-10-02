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
public class vetor12 {

   
@SuppressWarnings("empty-statement")
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int numero[] = new int [10];

for(int i=0; i<=9;i++){
    System.out.println("Digite seu numero: ");
    numero[i] = sc.nextInt();
}
for (int i=0; i<=9;i++){ 
    System.out.println("numero na posiçao["+(i+1)+"] = "+numero[i]);
}
}   
} 