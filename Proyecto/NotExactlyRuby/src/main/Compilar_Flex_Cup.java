/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Compilar_Flex_Cup {
    public static void main(String[] args) {
        Compilar_Flex_Cup compilar = new Compilar_Flex_Cup();
        compilar.compilar_archivos();
        boolean mvAL = moverArch("Lexico.java");
        boolean mvAS = moverArch("AnalizadorSintactico.java");
        boolean mvSym = moverArch("sym.java");
    }
    
    public void compilar_archivos() {
        String archLexico = "";
        String archSintactico = "";
        
        System.out.println("\n*** Procesando archivo default ***\n");
        archLexico = "./src/main/LexicoProyecto.flex";
        archSintactico = "./src/main/Parser.cup";

        String[] alexico = {archLexico};
        String[] asintactico = {"-parser", "AnalizadorSintactico", archSintactico};
        jflex.Main.main(alexico);
        try {
            java_cup.Main.main(asintactico);
        } catch (Exception ex) {
            System.out.println("" + ex);
        }
        System.out.println("Generados correctamente!...");
    }
    
    public static boolean moverArch(String archNombre) {
        boolean efectuado = false;
        File arch = new File(archNombre);
        if (arch.exists()) {
            System.out.println("\n*** Moviendo " + arch + " ***");
            Path currentRelativePath = Paths.get("");
            String nuevoDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "main" + File.separator + arch.getName();
            File archViejo = new File(nuevoDir);
            archViejo.delete();
            if (arch.renameTo(new File(nuevoDir))) {
                System.out.println("\n*** Generado " + archNombre + "***\n");
                efectuado = true;
            } else {
                System.out.println("\n*** No movido " + archNombre + " ***\n");
            }

        } else {
            System.out.println("\n*** Codigo no existente ***\n");
        }
        return efectuado;
    }
}
