package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        int tinggi = 0, jari = 0, jari2 = 0;
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.printf("Masukkan nilai jari jari bola : ");
            jari2 = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }finally{
            Bola bola = new Bola(jari2);
            bola.tampilkan();
        }
        
        try{
            System.out.printf("Masukkan nilai jari-jari Tabung : ");
            jari = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }try{
            System.out.printf("Masukkan nilai tinggi Tabung : ");
            tinggi = input.nextInt();
        }catch(InputMismatchException error){
            System.out.println("Input yang anda masukkan bukan integer, errornya adalah " + error.getMessage());
        }finally{
            Tabung tabung = new Tabung(tinggi,jari);
            tabung.tampilkan();
        }
        input.close();
    }
}
