/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab1p2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class DiegoCasco_Lab1P2 {

    static Scanner lea = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean turnorojo = true;
        int size = 8;
        char[][] matriz_rojo = new char[size][size];
        char[][] matriz_azul = new char[size][size];
        matriz_rojo = llenado(size);
        matriz_azul = llenado(size);
        int barcosrojo = 3;
        int barcosazul = 3;
        matriz_rojo = barcosrojo(matriz_rojo);
        matriz_azul = barcosazul(matriz_azul);
        while (barcosrojo != 0 || barcosazul != 0) {
            if (turnorojo = true) {
                System.out.println("Turno Rojo");
                String coordenadas;
                char xc;
                char yc;
                System.out.println("Ingrese las coordenadas de Barco(x,y): ");
                coordenadas = lea.next();
                String[] tokens = coordenadas.split(",");
                xc = tokens[0].charAt(1);
                yc = tokens[1].charAt(0);
                int x = Character.getNumericValue(xc);
                int y = Character.getNumericValue(yc);
                if (matriz_azul[x][y] == '-') {
                    turnorojo = true;
                    matriz_azul[x][y] = '+';
                } else {
                    System.out.println("miss");
                    Imprimirazul(matriz_azul);
                    turnorojo = false;
                }
            }
            if (turnorojo = false) {
                System.out.println("Turno Azul");
                String coordenadas;
                char xc;
                char yc;
                System.out.println("Ingrese las coordenadas de Barco(x,y): ");
                coordenadas = lea.next();
                String[] tokens = coordenadas.split(",");
                xc = tokens[0].charAt(1);
                yc = tokens[1].charAt(0);
                int x = Character.getNumericValue(xc);
                int y = Character.getNumericValue(yc);
                if (matriz_azul[x][y] == '-') {
                    System.out.println("hit");
                    turnorojo = false;
                    matriz_azul[x][y] = '+';
                }
                if (matriz_rojo[x][y] != '-') {
                    System.out.println("miss");
                    Imprimirrojo(matriz_rojo);
                    turnorojo = true;
                }
            }

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

    public static char[][] barcosrojo(char[][] matriz_rojo) {
        for (int i = 1; i <= 3; i++) {
            String coordenadas;
            char x;
            char y;
            char orientacion;
            System.out.println("Ingrese las coordenadas de Barcos rojos(x,y): ");
            coordenadas = lea.next();
            String[] tokens = coordenadas.split(",");
            x = tokens[0].charAt(1);
            y = tokens[1].charAt(0);
            System.out.println("Ingrese orientacio <(vertical) >(horizontal):");
            orientacion = lea.next().charAt(0);
            int xrojo = Character.getNumericValue(x);
            int yrojo = Character.getNumericValue(y);
            if (orientacion == '<') {
                if(xrojo==6){
                    System.out.println("Valor fuera de Rango");
                }else{
                matriz_rojo[xrojo][yrojo] = '-';
                matriz_rojo[xrojo + 1][yrojo] = '-';
                matriz_rojo[xrojo + 2][yrojo] = '-';
                }
            } else if (orientacion == '>') {
                if(yrojo==6){
                  System.out.println("Valor fuera de Rango");
                }else{
                matriz_rojo[xrojo][yrojo] = '-';
                matriz_rojo[xrojo][yrojo + 1] = '-';
                matriz_rojo[xrojo][yrojo + 2] = '-';
                }
            }
        }
        return matriz_rojo;
    }

    public static char[][] barcosazul(char[][] matriz_azul) {
        for (int i = 1; i <= 3; i++) {
            String coordenadas;
            char xc;
            char yc;
            char orientacion;
            System.out.println("Ingrese las coordenadas de Barcos azul(x,y): ");
            coordenadas = lea.next();
            String[] tokens = coordenadas.split(",");
            xc = tokens[0].charAt(1);
            yc = tokens[1].charAt(0);
            System.out.println("Ingrese orientacio <(vertical) >(horizontal):");
            orientacion = lea.next().charAt(0);
            int x = Character.getNumericValue(xc);
            int y = Character.getNumericValue(yc);
            if (orientacion == '<') {
                if(x==6){
                    System.out.println("Valor fuera de Rango volver a empezar");
                }
                matriz_azul[x][y] = '-';
                matriz_azul[x + 1][y] = '-';
                matriz_azul[x + 2][y] = '-';
            } else if (orientacion == '>') {
                if(x==6){
                   System.out.println("Valor fuera de Rango volver a empezar"); 
                }
                matriz_azul[x][y] = '-';
                matriz_azul[x][y + 1] = '-';
                matriz_azul[x][y + 2] = '-';
            }
        }
        return matriz_azul;
    }
}
