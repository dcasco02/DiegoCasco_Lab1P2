/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab1p2;

import java.util.Scanner;

/**
 *
 * @author dcasc
 */
public class DiegoCasco_Lab1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner lea=new Scanner(System.in); 
     int size=8;
     char [][]matriz_rojo=new char[size][size];
     char [][]matriz_azul=new char[size][size];
     matriz_rojo = llenado(size);
     matriz_azul = llenado(size);
     int barcos_rojo=3;
     int barcos_azul=3;
     for(int i=1;i==barcos_rojo;i++){
        String coordenadas;
        System.out.println("Ingrese las coordenadas de Barcos rojos");
        coordenadas=lea.next();
        String []tokens=coordenadas.split(",");
        []tokens.CharAt(1)
     }
    }
    public static char[][]llenado(int size){
        char [][] temporal = new char [size][size];
        for(int i=0;i<size;i++){
            for(int j=0; j<size;j++){
                temporal[i][j]=0;
            }
        }
        return temporal;
    }
    public static void Imprimirrojo(char [][]matriz_rojo){
        //int []columnas=new int[numeros[0].length];
         for(int i=0;i<matriz_rojo.length;i++){
            for(int j=0; j<matriz_rojo[i].length;j++){
                System.out.print("{"+matriz_rojo[i][j]+ "} ");
            }
            System.out.println(" ");
        }
    }
    public static void Imprimirazul(char [][]matriz_azul){
        //int []columnas=new int[numeros[0].length];
         for(int i=0;i<matriz_azul.length;i++){
            for(int j=0; j<matriz_azul[i].length;j++){
                System.out.print("{"+matriz_azul[i][j]+ "} ");
            }
            System.out.println(" ");
        }
    }
}
