package main;

import java.util.Scanner;

public class Siglas {
    public String Siglas(String palabra){
        String sigla = "";
        String[] palabras = palabra.split(" ");



        return sigla;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una institución");
        String institucion = sc.nextLine();
        Siglas siglas = new Siglas();
        System.out.println(siglas.Siglas(institucion)); // Output: prg
    }

}

