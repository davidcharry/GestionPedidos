/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mono-
 */
public class Producto {
    
   
    public void Pantalones(DefaultTableModel model) throws FileNotFoundException {
        String ruta = "Archivos/Pantalones.txt";
        Scanner lector = null;
        File doc = new File(ruta);
        try {
            lector = new Scanner(doc);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[1];
                String precio = datos[2];
                String cantidad = datos[3];

                model.addRow(new Object[]{nombre, precio, cantidad});
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    public void Sacos(DefaultTableModel model) throws FileNotFoundException {
        String ruta = "Archivos/Sacos.txt";
        Scanner lector = null;
        File doc = new File(ruta);
        try {
            lector = new Scanner(doc);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[1];
                String precio = datos[2];
                String cantidad = datos[3];

                model.addRow(new Object[]{nombre, precio, cantidad});
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    public void Zapatos(DefaultTableModel model) throws FileNotFoundException {
        String ruta = "Archivos/Zapatos.txt";
        Scanner lector = null;
        File doc = new File(ruta);
        try {
            lector = new Scanner(doc);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[1];
                String precio = datos[2];
                String cantidad = datos[3];

                model.addRow(new Object[]{nombre, precio, cantidad});
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
