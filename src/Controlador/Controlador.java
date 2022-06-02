/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Seguridad;
import Vista.Carrito;
import Vista.Ingreso;
import Vista.Pedidos;
import Vista.Principal;
import Vista.Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mono-
 */
public class Controlador implements ActionListener {

    Principal objPpal;
    Ingreso objIng;
    Productos objPro;
    Carrito objCar;
    Pedidos objPed;
    Seguridad objSeg;
    Producto objProd;
    Pedido objPedi;
    int contadorIngreso = 0;

    public Controlador() {
        File fichero = new File("Archivos/Pedidos.txt");
        fichero.delete();

        objPpal = new Principal();
        objIng = new Ingreso();
        objPro = new Productos();
        objCar = new Carrito();
        objPed = new Pedidos();
        objSeg = new Seguridad();
        objProd = new Producto();
        objPedi = new Pedido();

        objPpal.getIngreso().addActionListener(this);
        objPpal.getProductos().addActionListener(this);
        objPpal.getCarrito().addActionListener(this);
        objPpal.getPedidos().addActionListener(this);
        objCar.getCancelar().addActionListener(this);
        objCar.getEnvio().addActionListener(this);
        objCar.getEnviar().addActionListener(this);
        objIng.getRegistrar().addActionListener(this);
        objIng.getIngresar().addActionListener(this);
        objIng.getVolver().addActionListener(this);
        objIng.getVolver1().addActionListener(this);
        objPed.getVolver2().addActionListener(this);
        objPro.getVolver3().addActionListener(this);
        objPro.getPantalones().addActionListener(this);
        objPro.getSacos().addActionListener(this);
        objPro.getZapatos().addActionListener(this);
        objPro.getComprar().addActionListener(this);
        objPpal.getCerrar().addActionListener(this);
        objPed.getPagar().addActionListener(this);
        objPed.getVolver().addActionListener(this);
    }

    public Carrito getObjCar() {
        return objCar;
    }

    public void setObjCar(Carrito objCar) {
        this.objCar = objCar;
    }

    public void Iniciar() {
        objPpal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objPpal.getProductos()) {
            if (contadorIngreso == 0) {
                objIng.mostrarAviso("Aviso", "Debe iniciar sesión");
            } else {
                objPpal.setVisible(false);
                objPro.setVisible(true);
            }
        }

        if (e.getSource() == objPpal.getCarrito()) {
            if (contadorIngreso == 0) {
                objIng.mostrarAviso("Aviso", "Debe iniciar sesión");
            } else {
                objPpal.setVisible(false);
                objCar.setVisible(true);
            }
        }

        if (e.getSource() == objPpal.getPedidos()) {
            if (contadorIngreso == 0) {
                objIng.mostrarAviso("Aviso", "Debe iniciar sesión");
            } else {
                DefaultTableModel model1 = (DefaultTableModel) objPed.TablePedidos.getModel();
                try {
                    for (int i = objPed.TablePedidos.getRowCount() - 1; i >= 0; i--) {
                        model1.removeRow(i);
                    }
                    objPedi.cargaPedidos(model1);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
                objPpal.setVisible(false);
                objPed.setVisible(true);
            }
        }

        if (e.getSource() == objCar.getEnvio()) {
            objCar.getDireccion().setText("");
            LocalDate Time = LocalDate.now();
            objCar.getFechaEnvio().setText(Time.toString());
            objCar.getEmpresaM().setText("");
            objCar.getEnvio1().setVisible(true);
        }

        if (e.getSource() == objCar.getEnviar()) {
            String dir = objCar.getDireccion().getText();
            LocalDate Time = LocalDate.now();
            String Emp = objCar.getEmpresaM().getText();
            String estado = "Pendiente";
            double precio = 0;
            double total = 0;
            int cantidad = 1;
            int fila = objCar.TableCarrito.getRowCount();
            DefaultTableModel model1 = (DefaultTableModel) objPed.TablePedidos.getModel();
            for (int i = 0; i < fila; i++) {
                precio = (double) (objCar.TableCarrito.getValueAt(i, 3));
                cantidad = (int) objCar.TableCarrito.getValueAt(i, 4);
                total = total + (precio * cantidad);
            }
            if (dir.isEmpty() || objCar.getFechaEnvio().getText().isEmpty() || Emp.isEmpty()) {
                objIng.mostrarAviso("Vacio", "Algun campo esta vacio");
            } else {
                try {
                    objPedi.Pedidos(Time.toString(), Emp, estado, total);
                    for (int i = objPed.TablePedidos.getRowCount() - 1; i >= 0; i--) {
                        model1.removeRow(i);
                    }
                    objPedi.cargaPedidos(model1);
                    objIng.mostrarAviso("Aviso", "Datos correctos siga con el pago");
                    objCar.getEnvio1().setVisible(false);
                    objCar.setVisible(false);
                    objPed.setVisible(true);
                    DefaultTableModel dm = (DefaultTableModel) objCar.TableCarrito.getModel();
                    for (int i = objCar.TableCarrito.getRowCount() - 1; i >= 0; i--) {
                        dm.removeRow(i);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (e.getSource() == objCar.getCancelar()) {
            if (contadorIngreso == 0) {
                objIng.mostrarAviso("Aviso", "Debe iniciar sesión");
            } else {
                objPpal.setVisible(true);
                objCar.setVisible(false);
            }
        }

        if (e.getSource() == objPro.getPantalones()) {
            DefaultTableModel model = (DefaultTableModel) objPro.TablePan.getModel();
            try {
                objProd.Pantalones(model);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == objPro.getSacos()) {
            DefaultTableModel model = (DefaultTableModel) objPro.TableSacos.getModel();
            try {
                objProd.Sacos(model);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == objPro.getZapatos()) {
            DefaultTableModel model = (DefaultTableModel) objPro.TableZapatos.getModel();
            try {
                objProd.Zapatos(model);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == objPro.getComprar()) {
            int fila = objPro.InfoTable.getRowCount();

            DefaultTableModel model = (DefaultTableModel) objCar.TableCarrito.getModel();
            LocalDate Time = LocalDate.now();
            for (int i = 0; i < fila; i++) {
                model.addRow(new Object[]{Time, objPro.InfoTable.getValueAt(i, 0), objPro.InfoTable.getValueAt(i, 1), (double) objPro.InfoTable.getValueAt(i, 2), (int) objPro.InfoTable.getValueAt(i, 3)});
            }

            DefaultTableModel dm = (DefaultTableModel) objPro.InfoTable.getModel();
            for (int i = objPro.InfoTable.getRowCount() - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
            objPro.setVisible(false);
            objCar.setVisible(true);
        }

        if (e.getSource() == objPed.getPagar()) {
            try {
                int fila = objPed.TablePedidos.getSelectedRow();
                DefaultTableModel mode1 = (DefaultTableModel) objPed.TablePedidos.getModel();
                String estado = mode1.getValueAt(fila, 3).toString();
                String Id_Ped = mode1.getValueAt(fila, 0).toString();
                String total = mode1.getValueAt(fila, 4).toString();
                LocalDate Time = LocalDate.now();
                String ID_Clien = objSeg.ValUsuAct(objIng.getUsuario().getText());
                objPed.getFecha().setText("Fecha: " + (Time).toString());
                objPed.getID_Cliente().setText("ID_Clien: " + ID_Clien);
                objPed.getID_Pedido().setText("Id_Ped: " + Id_Ped);
                objPed.getTotal().setText("Total: " + total);
                if (estado.equalsIgnoreCase("Completo")) {
                    objIng.mostrarAviso("Aviso", "Este pedido ya esta pago");
                } else {
                    objPedi.Pedidos(Id_Ped, Time, mode1.getValueAt(fila, 2).toString(), "Completo", Double.parseDouble(total), mode1);
                    objPed.setVisible(false);
                    objIng.mostrarAviso("Aviso", "El pago fue exitoso");
                    objPed.getFactura().setVisible(true);
                }

            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (e.getSource() == objPed.getVolver2()) {
            DefaultTableModel model1 = (DefaultTableModel) objPed.TablePedidos.getModel();
            try {
                for (int i = objPed.TablePedidos.getRowCount() - 1; i >= 0; i--) {
                    model1.removeRow(i);
                }
                objPedi.cargaPedidos(model1);
                objPed.setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == objPpal.getCerrar()) {
            DefaultTableModel model = (DefaultTableModel) objCar.TableCarrito.getModel();
            for (int i = objCar.TableCarrito.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            if (contadorIngreso == 0) {
                objIng.mostrarAviso("Aviso", "Debe iniciar sesión");
            } else {
                objPpal.getLblCerrar().setText("");
                contadorIngreso = 0;
                objIng.mostrarAviso("Aviso", "Se cerro sesión correctamente");
                File fichero = new File("Archivos/Pedidos.txt");
                fichero.delete();
            }
        }

        if (e.getSource() == objIng.getVolver()) {
            objIng.setVisible(false);
            objPpal.setVisible(true);
        }

        if (e.getSource() == objIng.getVolver1()) {
            objIng.setVisible(true);
        }

        if (e.getSource() == objPro.getVolver3()) {
            objPro.setVisible(false);
            objPpal.setVisible(true);
        }

        if (e.getSource() == objPed.getVolver()) {
            if (contadorIngreso == 0) {
                objIng.mostrarAviso("Aviso", "Debe iniciar sesión");
            } else {
                objPed.setVisible(false);
                objPpal.setVisible(true);
            }
        }

        if (e.getSource() == objPpal.getIngreso()) {
            objIng.getUsuario().setText("");
            objIng.getContrasena().setText("");
            objIng.getUsuario1().setText("");
            objIng.getDireccion().setText("");
            objIng.getTelefono().setText("");
            objIng.getCorreo().setText("");
            objIng.getContrasena1().setText("");
            objIng.getConContrasena1().setText("");
            objIng.getRazonSocial().setText("");
            objIng.getNit().setText("");
            objIng.getDocIdentidad().setText("");
            objIng.getPriNom().setText("");
            objIng.getSegNom().setText("");
            objIng.getPriApe().setText("");
            objIng.getSegApe().setText("");
            objPed.getFecha().setText("");
            if (contadorIngreso == 1) {
                objIng.mostrarAviso("Aviso", "Usted ya inicio sesión");
            } else {
                objPpal.setVisible(false);
                objIng.setVisible(true);
            }
        }

        if (e.getSource() == objIng.getRegistrar()) {
            String Usuario1 = objIng.getUsuario1().getText();
            String Direccion = objIng.getDireccion().getText();
            String Telefono = objIng.getTelefono().getText();
            String Correo = objIng.getCorreo().getText();
            String Psw1 = objIng.getContrasena1().getText();
            String ConPsw1 = objIng.getConContrasena1().getText();
            if (!Psw1.equals(ConPsw1)) {
                objIng.mostrarAviso("Error", "Las contraseñas son distintas");
            } else {
                if (Usuario1.isEmpty() || Direccion.isEmpty() || Telefono.isEmpty() || Correo.isEmpty() || Psw1.isEmpty() || ConPsw1.isEmpty()) {
                    objIng.mostrarAviso("Vacio", "Algun campo esta vacio");
                } else {
                    objIng.setVisible(false);
                    objIng.getTipoUsu().setVisible(true);
                }
            }
        }

        if (e.getSource() == objIng.getIngresar()) {
            String Usuario = objIng.getUsuario().getText();
            String Psw = objIng.getContrasena().getText();
            if (Usuario.isEmpty() || Psw.isEmpty()) {
                objIng.mostrarAviso("Vacio", "Algun campo esta vacio");
            } else {
                try {
                    boolean datos = objSeg.Usu_Con(Usuario, Psw);
                    if (datos == true) {
                        contadorIngreso = 1;
                        objIng.mostrarAviso("Ingreso", "Ingreso Correcto al Sistema");
                        objIng.setVisible(false);
                        objPpal.setVisible(true);
                        if (contadorIngreso == 1) {
                            objPpal.getLblCerrar().setText("Cerrar Sesión");
                        } else {
                            objPpal.getLblCerrar().setText("");
                        }
                    } else if (datos == false) {
                        objIng.mostrarAviso("Error", "Usuario/contraseña Incorrectos"
                                + " o el Usuario no existe");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
