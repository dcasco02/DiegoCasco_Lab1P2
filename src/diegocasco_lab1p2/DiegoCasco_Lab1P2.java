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
static Scanner lea=new Scanner(System.in); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 8;
        char[][] matriz_rojo = new char[size][size];
        char[][] matriz_azul = new char[size][size];
        matriz_rojo = llenado(size);
        matriz_azul = llenado(size);
        int barcos_rojo = 0;
        int barcosazul = 0;
        for (int i = 1; i == 3; i++) {
            String coordenadas;
            char x;
            char y;
            System.out.println("Ingrese las coordenadas de Barcos rojos");
            coordenadas = lea.next();
            String[] tokens = coordenadas.split(",");
            x = tokens[0].charAt(1);
            y = tokens[1].charAt(1);
            System.out.println(x);
            System.out.println(y);
        }
    }

    public static char[][] llenado(int size) {
        char[][] temporal = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temporal[i][j] = '0';
            }
        }
        return temporal;
    }

    public static void Imprimirrojo(char[][] matriz_rojo) {
        //int []columnas=new int[numeros[0].length];
        for (int i = 0; i < matriz_rojo.length; i++) {
            for (int j = 0; j < matriz_rojo[i].length; j++) {
                System.out.print("{" + matriz_rojo[i][j] + "} ");
            }
            System.out.println(" ");
        }
    }

    public static void Imprimirazul(char[][] matriz_azul) {
        //int []columnas=new int[numeros[0].length];
        for (int i = 0; i < matriz_azul.length; i++) {
            for (int j = 0; j < matriz_azul[i].length; j++) {
                System.out.print("{" + matriz_azul[i][j] + "} ");
            }
            System.out.println(" ");
        }
    }
}
