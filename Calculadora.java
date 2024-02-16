/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Yorch
 */
public class Calculadora {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = scan.nextInt();
            Menu(opcion);
        }while(opcion != 5);
        
    }
    public static void Menu(int op){
        switch (op) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;         
           
        }
        
    }
    public static void suma(){
        int n1;
        int n2;
        int sum;
        System.out.println("Escriba 2 números enteros: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        sum = n1 + n2;
        System.out.println("El resultado de la suma es :" + sum);
    }
    public static void resta(){
        int n1;
        int n2;
        int res;
        System.out.println("Escriba 2 números enteros: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        res = n1 - n2;
        System.out.println("El resultado de la resta es :" + res);
    }
     public static void mult(){
        int n1;
        int n2;
        int por;
        System.out.println("Escriba 2 números enteros: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        por = n1 * n2;
        System.out.println("El resultado de la multiplicación es :" + por);
    }
      public static void div(){
        int n1;
        int n2;
        double divi;
        System.out.println("Escriba 2 números enteros: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        if (n2 != 0){
        divi = n1 / n2;
        System.out.println("El resultado de la división es :" + divi);
        }else{ 
            System.out.println("No se puede dividir entre 0, ingrese otro valor para el divisor");
            n2 = scan.nextInt();     
            divi = n1 / n2;
        System.out.println("El resultado de la división es :" + divi);
      }
      }
}
