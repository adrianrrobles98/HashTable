/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creararchivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Directorio10 {
    public static void main(String ars[]){
        
        Scanner sc = new Scanner (System.in);
        
        sc = nextLine();
       
        
    
        for (int i = 0; i < 10; i++) {
            
        }
        
        try {
            String ruta = "C:\\Users\\usuario\\Desktop\\";
            File directorio = new File(ruta);
            // Si el archivo no existe es creado
            if (!directorio.exists()) {
                System.out.println("El directorio ya existe");
            }
                directorio.mkdir();
            System.out.println("Creando directoio...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    private static Scanner nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        