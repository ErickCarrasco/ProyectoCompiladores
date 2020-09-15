/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Erick C
 */
public class Executable {
    Scanner leer = new Scanner(System.in);
    
    public static void main (String args[]){
        Executable ejecutar=new Executable();
        ejecutar.archivo();
        ejecutar.ejecutar_analizador();
    }

    public void archivo() {
        String ruta = "archivo_texto.txt";
        File archivo = new File(ruta);
        BufferedWriter bw = null;
        if (archivo.exists()) {
            System.out.println("Executing data");
        } else {
            System.out.println("No file");
        }
        
    }
    
     public void ejecutar_analizador() {
        System.out.println("*****Inicio Ejecuación*****");
        try {
            AnalizadorSintactico asin = new AnalizadorSintactico(
                    new Lexico(new FileReader("archivo_texto.txt")));

            Object result = asin.parse().value;
            System.out.println("*****Resultados Finales******");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    String msn1 = "";
    
    
}
