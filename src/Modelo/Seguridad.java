/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mono-
 */
public class Seguridad {

    int bus = -1;
    int realbus = 0;
    int numero = 0;

    public boolean Usu_Con(String usuario, String pass) throws IOException {
        boolean datosLoginEncontrados = false;
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("Archivos/Usu_Con.txt"));
        String linea = reader.readLine();
        while (linea != null && datosLoginEncontrados == false) {
            String[] datosLogin = linea.split(",");
            if (datosLogin[1].equalsIgnoreCase(usuario) && datosLogin[2].equals(pass)) {
                datosLoginEncontrados = true;
            } else {
                linea = reader.readLine();
            }
        }
        if (datosLoginEncontrados == true) {
            return true;
        } else if (datosLoginEncontrados == false) {
            return false;
        }
        return false;
    }

    public boolean AgregaDatosN(String usuario, String pass, String Tipo, String ID, String PriNom, String SegNom, String PriApe, String SegApe, String Dir, String Tel, String Cor) throws IOException {
        File archivo;
        FileWriter escribir;
        PrintWriter linea1;
        archivo = new File("Archivos/Usu_Con.txt");
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                bus = bus + 1;

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[0];

                if (nombre.equalsIgnoreCase(usuario)) {
                    numero = 1;
                    realbus = bus;
                } else {
                    numero = 0;
                    realbus = bus + 1;
                }
            }
            if (numero == 0) {
                if (!archivo.exists()) {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo, true);
                    linea1 = new PrintWriter(escribir);
                    linea1.println(realbus + "," + usuario + "," + pass + "," + Tipo + "," + ID + "," + PriNom + "," + SegNom + "," + PriApe + "," + SegApe + "," + Dir + "," + Tel + "," + Cor);
                    linea1.close();
                    escribir.close();
                } else {
                    escribir = new FileWriter(archivo, true);
                    linea1 = new PrintWriter(escribir);
                    linea1.println(realbus + "," + usuario + "," + pass + "," + Tipo + "," + ID + "," + PriNom + "," + SegNom + "," + PriApe + "," + SegApe + "," + Dir + "," + Tel + "," + Cor);
                    linea1.close();
                    escribir.close();
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean AgregaDatosJ(String usuario, String pass, String Tipo, String rz, String nit, String Dir, String Tel, String Cor) throws IOException {
        File archivo;
        FileWriter escribir;
        PrintWriter linea1;
        archivo = new File("Archivos/Usu_Con.txt");
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                bus = bus + 1;

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[0];

                if (nombre.equalsIgnoreCase(usuario)) {
                    numero = 1;
                    realbus = bus;
                } else {
                    numero = 0;
                    realbus = bus + 1;
                }
            }

            if (numero == 0) {
                if (!archivo.exists()) {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo, true);
                    linea1 = new PrintWriter(escribir);
                    System.out.println(realbus);
                    linea1.println(realbus + "," + usuario + "," + pass + "," + Tipo + "," + rz + "," + nit + "," + Dir + "," + Tel + "," + Cor);
                    linea1.close();
                    escribir.close();
                } else {
                    escribir = new FileWriter(archivo, true);
                    linea1 = new PrintWriter(escribir);
                    System.out.println(realbus);
                    linea1.println(realbus + "," + usuario + "," + pass + "," + Tipo + "," + rz + "," + nit + "," + Dir + "," + Tel + "," + Cor);
                    linea1.close();
                    escribir.close();
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public String ValUsuAct(String usu) throws FileNotFoundException, IOException {
        boolean datosLoginEncontrados = false;
        BufferedReader reader = null;
        String ID_Cliente = "";
        reader = new BufferedReader(new FileReader("Archivos/Usu_Con.txt"));
        String linea = reader.readLine();
        while (linea != null && datosLoginEncontrados == false) {
            String[] datosLogin = linea.split(",");
            if (datosLogin[1].equalsIgnoreCase(usu)) {
                ID_Cliente = datosLogin[0];
                datosLoginEncontrados = true;
            } else {
                linea = reader.readLine();
            }
        }
        return ID_Cliente;
    }
}
