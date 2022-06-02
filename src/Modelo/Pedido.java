/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mono-
 */
public class Pedido {

    public boolean Pedidos(String fecha, String empre, String Estado, double total) throws FileNotFoundException, IOException {
        int bus = -1;
        int numero = 0;
        File archivo;
        FileWriter escribir;
        PrintWriter linea1;
        archivo = new File("Archivos/Pedidos.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
            try (Scanner lector = new Scanner(archivo)) {
                while (lector.hasNextLine()) {
                    bus = bus + 1;

                    String linea = lector.nextLine();

                    String[] datos = linea.split(",");

                    String ID = datos[0];

                    if (ID.equals(bus + "")) {
                        numero = Integer.parseInt(ID) + 1;
                    }
                }
                bus = -1;
            }
            escribir = new FileWriter(archivo, true);
            linea1 = new PrintWriter(escribir);
            linea1.println(numero + "," + fecha + "," + empre + "," + Estado + "," + total);
            linea1.close();
            escribir.close();
        } else {
            try (Scanner lector = new Scanner(archivo)) {
                while (lector.hasNextLine()) {
                    bus = bus + 1;

                    String linea = lector.nextLine();

                    String[] datos = linea.split(",");

                    String ID = datos[0];

                    if (ID.equals(bus + "")) {
                        numero = Integer.parseInt(ID) + 1;
                    }
                }
                bus = -1;
            }
            escribir = new FileWriter(archivo, true);
            linea1 = new PrintWriter(escribir);
            linea1.println(numero + "," + fecha + "," + empre + "," + Estado + "," + total);
            linea1.close();
            escribir.close();
        }
        return "Pendiente".equalsIgnoreCase(Estado);
    }

    public void cargaPedidos(DefaultTableModel model) throws FileNotFoundException {
        String ruta = "Archivos/Pedidos.txt";
        Scanner lector = null;
        File doc = new File(ruta);
        try {
            lector = new Scanner(doc);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();
                if (linea.isEmpty()) {

                } else {

                    String[] datos = linea.split(",");

                    int ID = Integer.parseInt(datos[0]);
                    String fecha = datos[1];
                    String empre = datos[2];
                    String Estado = datos[3];
                    String total = datos[4];
                    model.addRow(new Object[]{ID, fecha, empre, Estado, total});
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Exception: " + ex);
        }
    }

    public void Pedidos(String Id_Ped, LocalDate Time, String empresa, String completo, double total, DefaultTableModel model) throws IOException {
        int bus = -1;
        int numero = 0;
        int variable = 0;
        File archivo;
        archivo = new File("Archivos/Pedidos.txt");
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                bus = bus + 1;

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String ID = datos[0];

                if (ID.equals(bus + "")) {
                    numero = Integer.parseInt(ID) + 1;
                }
            }
            bus = -1;
            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                fichero = new FileWriter("Archivos/Pedidos.txt");
                pw = new PrintWriter(fichero);

                for (int i = 0; i < numero; i++) {
                    if ((i + "").equals(Id_Ped)) {
                        pw.println(Id_Ped + "," + Time + "," + empresa + "," + completo + "," + total);
                    } else {
                        pw.println(model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4));
                    }
                }
            } catch (IOException e) {
                System.out.println("Exception: " + e);
            } finally {
                try {
                    if (null != fichero) {
                        fichero.close();
                    }
                } catch (IOException e2) {
                    System.out.println("Exception: " + e2);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
