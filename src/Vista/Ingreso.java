/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Seguridad;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author mono-
 */
public final class Ingreso extends javax.swing.JFrame {

    Seguridad objSeg;
    Controlador objcontrol;
    int contador = 1;
    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
        initComponents();
        holders();
    }
    
    public void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarAviso(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }
    
    public void holders(){
        TextPrompt Usu = new TextPrompt("Usuario", Usuario);
        TextPrompt Con = new TextPrompt("Contraseña", Contrasena);
        TextPrompt Usu1 = new TextPrompt("Usuario", Usuario1);
        TextPrompt Con1 = new TextPrompt("Contraseña", Contrasena1);
        TextPrompt ConCon1 = new TextPrompt("Contraseña", ConContrasena1);
        TextPrompt Dir = new TextPrompt("Dirección", Direccion);
        TextPrompt Tel = new TextPrompt("Telefono", Telefono);
        TextPrompt Corr = new TextPrompt("Correo", Correo);
        TextPrompt RazSo = new TextPrompt("Razon Social", RazonSocial);
        TextPrompt NIT = new TextPrompt("NIT", Nit);
        TextPrompt DocIde = new TextPrompt("Documento ID", DocIdentidad);
        TextPrompt PriA= new TextPrompt("1 Apellido", PriApe);
        TextPrompt SegA = new TextPrompt("2 Apellido", SegApe);
        TextPrompt PriN = new TextPrompt("1 Nombre", PriNom);
        TextPrompt SegN = new TextPrompt("2 Nombre", SegNom);
    }

    public JPasswordField getConContrasena1() {
        return ConContrasena1;
    }

    public void setConContrasena1(JPasswordField ConContrasena1) {
        this.ConContrasena1 = ConContrasena1;
    }

    public JPasswordField getContrasena() {
        return Contrasena;
    }

    public void setContrasena(JPasswordField Contrasena) {
        this.Contrasena = Contrasena;
    }

    public JPasswordField getContrasena1() {
        return Contrasena1;
    }

    public void setContrasena1(JPasswordField Contrasena1) {
        this.Contrasena1 = Contrasena1;
    }

    public JTextField getCorreo() {
        return Correo;
    }

    public void setCorreo(JTextField Correo) {
        this.Correo = Correo;
    }

    public JTextField getDireccion() {
        return Direccion;
    }

    public void setDireccion(JTextField Direccion) {
        this.Direccion = Direccion;
    }

    public JTextField getDocIdentidad() {
        return DocIdentidad;
    }

    public void setDocIdentidad(JTextField DocIdentidad) {
        this.DocIdentidad = DocIdentidad;
    }

    public JButton getIngresar() {
        return Ingresar;
    }

    public void setIngresar(JButton Ingresar) {
        this.Ingresar = Ingresar;
    }

    public JFrame getJuridica() {
        return Juridica;
    }

    public void setJuridica(JFrame Juridica) {
        this.Juridica = Juridica;
    }

    public JFrame getNatural() {
        return Natural;
    }

    public void setNatural(JFrame Natural) {
        this.Natural = Natural;
    }

    public JTextField getNit() {
        return Nit;
    }

    public void setNit(JTextField Nit) {
        this.Nit = Nit;
    }

    public JTextField getPriApe() {
        return PriApe;
    }

    public void setPriApe(JTextField PriApe) {
        this.PriApe = PriApe;
    }

    public JTextField getPriNom() {
        return PriNom;
    }

    public void setPriNom(JTextField PriNom) {
        this.PriNom = PriNom;
    }

    public JTextField getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(JTextField RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public JButton getRegistrar() {
        return Registrar;
    }

    public void setRegistrar(JButton Registrar) {
        this.Registrar = Registrar;
    }

    public JTextField getSegApe() {
        return SegApe;
    }

    public void setSegApe(JTextField SegApe) {
        this.SegApe = SegApe;
    }

    public JTextField getSegNom() {
        return SegNom;
    }

    public void setSegNom(JTextField SegNom) {
        this.SegNom = SegNom;
    }

    public JButton getTJuridica() {
        return TJuridica;
    }

    public void setTJuridica(JButton TJuridica) {
        this.TJuridica = TJuridica;
    }

    public JButton getTNatural() {
        return TNatural;
    }

    public void setTNatural(JButton TNatural) {
        this.TNatural = TNatural;
    }

    public JTextField getTelefono() {
        return Telefono;
    }

    public void setTelefono(JTextField Telefono) {
        this.Telefono = Telefono;
    }

    public JFrame getTipoUsu() {
        return TipoUsu;
    }

    public void setTipoUsu(JFrame TipoUsu) {
        this.TipoUsu = TipoUsu;
    }

    public JTextField getUsuario() {
        return Usuario;
    }

    public void setUsuario(JTextField Usuario) {
        this.Usuario = Usuario;
    }

    public JTextField getUsuario1() {
        return Usuario1;
    }

    public void setUsuario1(JTextField Usuario1) {
        this.Usuario1 = Usuario1;
    }

    public JButton getValidarJ() {
        return ValidarJ;
    }

    public void setValidarJ(JButton ValidarJ) {
        this.ValidarJ = ValidarJ;
    }

    public JButton getValidarN() {
        return ValidarN;
    }

    public void setValidarN(JButton ValidarN) {
        this.ValidarN = ValidarN;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel10() {
        return jPanel10;
    }

    public void setjPanel10(JPanel jPanel10) {
        this.jPanel10 = jPanel10;
    }

    public JPanel getjPanel11() {
        return jPanel11;
    }

    public void setjPanel11(JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    public JPanel getjPanel12() {
        return jPanel12;
    }

    public void setjPanel12(JPanel jPanel12) {
        this.jPanel12 = jPanel12;
    }

    public JPanel getjPanel13() {
        return jPanel13;
    }

    public void setjPanel13(JPanel jPanel13) {
        this.jPanel13 = jPanel13;
    }

    public JPanel getjPanel14() {
        return jPanel14;
    }

    public void setjPanel14(JPanel jPanel14) {
        this.jPanel14 = jPanel14;
    }

    public JPanel getjPanel17() {
        return jPanel17;
    }

    public void setjPanel17(JPanel jPanel17) {
        this.jPanel17 = jPanel17;
    }

    public JPanel getjPanel18() {
        return jPanel18;
    }

    public void setjPanel18(JPanel jPanel18) {
        this.jPanel18 = jPanel18;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel21() {
        return jPanel21;
    }

    public void setjPanel21(JPanel jPanel21) {
        this.jPanel21 = jPanel21;
    }

    public JPanel getjPanel22() {
        return jPanel22;
    }

    public void setjPanel22(JPanel jPanel22) {
        this.jPanel22 = jPanel22;
    }

    public JPanel getjPanel24() {
        return jPanel24;
    }

    public void setjPanel24(JPanel jPanel24) {
        this.jPanel24 = jPanel24;
    }

    public JPanel getjPanel25() {
        return jPanel25;
    }

    public void setjPanel25(JPanel jPanel25) {
        this.jPanel25 = jPanel25;
    }

    public JPanel getjPanel26() {
        return jPanel26;
    }

    public void setjPanel26(JPanel jPanel26) {
        this.jPanel26 = jPanel26;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JButton getVolver() {
        return Volver;
    }

    public void setVolver(JButton Volver) {
        this.Volver = Volver;
    }

    public JButton getVolver1() {
        return Volver1;
    }

    public void setVolver1(JButton Volver1) {
        this.Volver1 = Volver1;
    }

    public JButton getVolver2() {
        return Volver2;
    }

    public void setVolver2(JButton Volver2) {
        this.Volver2 = Volver2;
    }

    public JButton getVolver3() {
        return Volver3;
    }

    public void setVolver3(JButton Volver3) {
        this.Volver3 = Volver3;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoUsu = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TNatural = new javax.swing.JButton();
        TJuridica = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Volver1 = new javax.swing.JButton();
        Voler1 = new javax.swing.JLabel();
        Juridica = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        ValidarJ = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        RazonSocial = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        Nit = new javax.swing.JTextField();
        Volver2 = new javax.swing.JButton();
        Voler2 = new javax.swing.JLabel();
        Natural = new javax.swing.JFrame();
        jPanel14 = new javax.swing.JPanel();
        ValidarN = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        DocIdentidad = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        PriApe = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        SegNom = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        PriNom = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        SegApe = new javax.swing.JTextField();
        Volver3 = new javax.swing.JButton();
        Voler3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPasswordField();
        Registrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Usuario1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Contrasena1 = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ConContrasena1 = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Voler = new javax.swing.JLabel();

        TipoUsu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        TipoUsu.setMinimumSize(new java.awt.Dimension(445, 220));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(445, 220));
        jPanel11.setMinimumSize(new java.awt.Dimension(445, 220));
        jPanel11.setPreferredSize(new java.awt.Dimension(445, 220));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(71, 168, 244));
        jPanel12.setPreferredSize(new java.awt.Dimension(270, 270));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-invitado-masculino-96.png"))); // NOI18N
        jLabel6.setText("Tipo de Usuario");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 90));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-triángulo-25.png"))); // NOI18N
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 30));

        TNatural.setBackground(new java.awt.Color(71, 168, 244));
        TNatural.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TNatural.setText("Natural");
        TNatural.setToolTipText("");
        TNatural.setAlignmentY(0.0F);
        TNatural.setBorder(null);
        TNatural.setBorderPainted(false);
        TNatural.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNaturalActionPerformed(evt);
            }
        });
        jPanel11.add(TNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 130, 40));

        TJuridica.setBackground(new java.awt.Color(71, 168, 244));
        TJuridica.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TJuridica.setText("Juridica");
        TJuridica.setToolTipText("");
        TJuridica.setAlignmentY(0.0F);
        TJuridica.setBorder(null);
        TJuridica.setBorderPainted(false);
        TJuridica.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TJuridicaActionPerformed(evt);
            }
        });
        jPanel11.add(TJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 40));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-triángulo-25.png"))); // NOI18N
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        Volver1.setBackground(new java.awt.Color(255, 255, 255));
        Volver1.setBorder(null);
        Volver1.setBorderPainted(false);
        Volver1.setOpaque(false);
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });
        jPanel11.add(Volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 70, 20));

        Voler1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Voler1.setText("Volver");
        jPanel11.add(Voler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 70, 20));

        javax.swing.GroupLayout TipoUsuLayout = new javax.swing.GroupLayout(TipoUsu.getContentPane());
        TipoUsu.getContentPane().setLayout(TipoUsuLayout);
        TipoUsuLayout.setHorizontalGroup(
            TipoUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TipoUsuLayout.setVerticalGroup(
            TipoUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Juridica.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Juridica.setMinimumSize(new java.awt.Dimension(260, 220));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(260, 220));
        jPanel13.setMinimumSize(new java.awt.Dimension(260, 220));
        jPanel13.setPreferredSize(new java.awt.Dimension(260, 220));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ValidarJ.setBackground(new java.awt.Color(71, 168, 244));
        ValidarJ.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ValidarJ.setText("Validar");
        ValidarJ.setToolTipText("");
        ValidarJ.setAlignmentY(0.0F);
        ValidarJ.setBorder(null);
        ValidarJ.setBorderPainted(false);
        ValidarJ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ValidarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarJActionPerformed(evt);
            }
        });
        jPanel13.add(ValidarJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 130, 40));

        jPanel17.setBackground(new java.awt.Color(199, 205, 213));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        RazonSocial.setBackground(new java.awt.Color(199, 205, 213));
        RazonSocial.setToolTipText("");
        RazonSocial.setBorder(null);
        RazonSocial.setName(""); // NOI18N
        RazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazonSocialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(RazonSocial))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 30));

        jPanel21.setBackground(new java.awt.Color(199, 205, 213));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        Nit.setBackground(new java.awt.Color(199, 205, 213));
        Nit.setToolTipText("");
        Nit.setBorder(null);
        Nit.setName(""); // NOI18N
        Nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nit, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Nit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 30));

        Volver2.setBackground(new java.awt.Color(255, 255, 255));
        Volver2.setBorder(null);
        Volver2.setBorderPainted(false);
        Volver2.setOpaque(false);
        Volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver2ActionPerformed(evt);
            }
        });
        jPanel13.add(Volver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        Voler2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Voler2.setText("Volver");
        jPanel13.add(Voler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        javax.swing.GroupLayout JuridicaLayout = new javax.swing.GroupLayout(Juridica.getContentPane());
        Juridica.getContentPane().setLayout(JuridicaLayout);
        JuridicaLayout.setHorizontalGroup(
            JuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        JuridicaLayout.setVerticalGroup(
            JuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JuridicaLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        Natural.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Natural.setMinimumSize(new java.awt.Dimension(260, 400));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMaximumSize(new java.awt.Dimension(260, 400));
        jPanel14.setMinimumSize(new java.awt.Dimension(260, 400));
        jPanel14.setPreferredSize(new java.awt.Dimension(260, 400));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ValidarN.setBackground(new java.awt.Color(71, 168, 244));
        ValidarN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ValidarN.setText("Validar");
        ValidarN.setToolTipText("");
        ValidarN.setAlignmentY(0.0F);
        ValidarN.setBorder(null);
        ValidarN.setBorderPainted(false);
        ValidarN.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ValidarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarNActionPerformed(evt);
            }
        });
        jPanel14.add(ValidarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 40));

        jPanel18.setBackground(new java.awt.Color(199, 205, 213));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        DocIdentidad.setBackground(new java.awt.Color(199, 205, 213));
        DocIdentidad.setToolTipText("");
        DocIdentidad.setBorder(null);
        DocIdentidad.setName(""); // NOI18N
        DocIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocIdentidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DocIdentidad, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(DocIdentidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 30));

        jPanel22.setBackground(new java.awt.Color(199, 205, 213));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        PriApe.setBackground(new java.awt.Color(199, 205, 213));
        PriApe.setToolTipText("");
        PriApe.setBorder(null);
        PriApe.setName(""); // NOI18N
        PriApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriApeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PriApe, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PriApe))
                .addContainerGap())
        );

        jPanel14.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 30));

        jPanel24.setBackground(new java.awt.Color(199, 205, 213));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        SegNom.setBackground(new java.awt.Color(199, 205, 213));
        SegNom.setToolTipText("");
        SegNom.setBorder(null);
        SegNom.setName(""); // NOI18N
        SegNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SegNom, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SegNom))
                .addContainerGap())
        );

        jPanel14.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 30));

        jPanel25.setBackground(new java.awt.Color(199, 205, 213));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        PriNom.setBackground(new java.awt.Color(199, 205, 213));
        PriNom.setToolTipText("");
        PriNom.setBorder(null);
        PriNom.setName(""); // NOI18N
        PriNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PriNom, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(PriNom))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 30));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 33, 30));

        jPanel26.setBackground(new java.awt.Color(199, 205, 213));

        SegApe.setBackground(new java.awt.Color(199, 205, 213));
        SegApe.setToolTipText("");
        SegApe.setBorder(null);
        SegApe.setName(""); // NOI18N
        SegApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegApeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SegApe, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SegApe, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 30));

        Volver3.setBackground(new java.awt.Color(255, 255, 255));
        Volver3.setBorder(null);
        Volver3.setBorderPainted(false);
        Volver3.setOpaque(false);
        Volver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver3ActionPerformed(evt);
            }
        });
        jPanel14.add(Volver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        Voler3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Voler3.setText("Volver");
        jPanel14.add(Voler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        javax.swing.GroupLayout NaturalLayout = new javax.swing.GroupLayout(Natural.getContentPane());
        Natural.getContentPane().setLayout(NaturalLayout);
        NaturalLayout.setHorizontalGroup(
            NaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        NaturalLayout.setVerticalGroup(
            NaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(71, 168, 244));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 270));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Crear Cuenta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Iniciar Sesión");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-invitado-masculino-96.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel4)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 230));

        jSeparator1.setForeground(new java.awt.Color(231, 232, 237));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 230, 10, 170));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-triángulo-25_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 30));

        jPanel3.setBackground(new java.awt.Color(199, 205, 213));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        Usuario.setBackground(new java.awt.Color(199, 205, 213));
        Usuario.setToolTipText("");
        Usuario.setBorder(null);
        Usuario.setName(""); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Usuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Usuario.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-triángulo-25.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 30));

        jPanel4.setBackground(new java.awt.Color(199, 205, 213));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-olvidó-su-contraseña-27.png"))); // NOI18N

        Contrasena.setBackground(new java.awt.Color(199, 205, 213));
        Contrasena.setBorder(null);
        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Contrasena)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 30));

        Registrar.setBackground(new java.awt.Color(71, 168, 244));
        Registrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.setToolTipText("");
        Registrar.setAlignmentY(0.0F);
        Registrar.setBorder(null);
        Registrar.setBorderPainted(false);
        Registrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 40));

        jPanel5.setBackground(new java.awt.Color(199, 205, 213));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-nombre-de-usuario-27.png"))); // NOI18N

        Usuario1.setBackground(new java.awt.Color(199, 205, 213));
        Usuario1.setToolTipText("");
        Usuario1.setBorder(null);
        Usuario1.setName(""); // NOI18N
        Usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Usuario1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 210, 30));

        jPanel6.setBackground(new java.awt.Color(199, 205, 213));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-olvidó-su-contraseña-27.png"))); // NOI18N

        Contrasena1.setBackground(new java.awt.Color(199, 205, 213));
        Contrasena1.setBorder(null);
        Contrasena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contrasena1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contrasena1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Contrasena1)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 210, 30));

        jPanel8.setBackground(new java.awt.Color(199, 205, 213));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-cuenta-de-correo-27.png"))); // NOI18N

        Correo.setBackground(new java.awt.Color(199, 205, 213));
        Correo.setToolTipText("");
        Correo.setBorder(null);
        Correo.setName(""); // NOI18N
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Correo))
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 210, 30));

        jPanel7.setBackground(new java.awt.Color(199, 205, 213));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-teléfono-27.png"))); // NOI18N

        Telefono.setBackground(new java.awt.Color(199, 205, 213));
        Telefono.setToolTipText("");
        Telefono.setBorder(null);
        Telefono.setName(""); // NOI18N
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Telefono))
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 210, 30));

        jPanel9.setBackground(new java.awt.Color(199, 205, 213));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-página-principal-27.png"))); // NOI18N

        Direccion.setBackground(new java.awt.Color(199, 205, 213));
        Direccion.setToolTipText("");
        Direccion.setBorder(null);
        Direccion.setName(""); // NOI18N
        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Direccion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 210, 30));

        jPanel10.setBackground(new java.awt.Color(199, 205, 213));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-olvidó-su-contraseña-27.png"))); // NOI18N

        ConContrasena1.setBackground(new java.awt.Color(199, 205, 213));
        ConContrasena1.setBorder(null);
        ConContrasena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConContrasena1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConContrasena1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ConContrasena1)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 210, 30));

        Ingresar.setBackground(new java.awt.Color(71, 168, 244));
        Ingresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.setToolTipText("");
        Ingresar.setAlignmentY(0.0F);
        Ingresar.setBorder(null);
        Ingresar.setBorderPainted(false);
        Ingresar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 130, 40));

        Volver.setBackground(new java.awt.Color(255, 255, 255));
        Volver.setBorder(null);
        Volver.setBorderPainted(false);
        Volver.setOpaque(false);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 60, 20));

        Voler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Voler.setText("Volver");
        jPanel1.add(Voler, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void Usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario1ActionPerformed

    private void Contrasena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contrasena1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contrasena1ActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed

    private void ConContrasena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConContrasena1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConContrasena1ActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void TNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNaturalActionPerformed
        TipoUsu.setVisible(false);
        Natural.setVisible(true);
    }//GEN-LAST:event_TNaturalActionPerformed

    private void ValidarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarNActionPerformed
        objSeg = new Seguridad();
        objcontrol = new Controlador();
        String Usu = getUsuario1().getText();
        String Dir = getDireccion().getText();
        String Tel = getTelefono().getText();
        String Cor = getCorreo().getText();
        String Psw = getContrasena1().getText();  
        String tipo = "Natural";
        String DocId = getDocIdentidad().getText();
        String PrNom = getPriNom().getText();
        String SeNom = getSegNom().getText();
        String PrApe = getPriApe().getText();
        String SeApe = getSegApe().getText();
        if (DocId.isEmpty() || PrNom.isEmpty() || SeNom.isEmpty() || PrApe.isEmpty() || SeApe.isEmpty()) {
            mostrarAviso("Vacio", "Algun campo esta vacio");
        }else{
            try {
                boolean datos = objSeg.AgregaDatosN(Usu, Psw, tipo, DocId, PrNom, SeNom, PrApe, SeApe, Dir, Tel, Cor);
                if (datos == true) {
                    mostrarAviso("Aviso", "Registro correcto ya puede iniciar sesión");
                    Natural.setVisible(false);
                    objcontrol.Iniciar();
                } else if (datos == false) {
                    mostrarAviso("Error", "El usuario digitado ya existe");
                    Natural.setVisible(false);
                    objcontrol.Iniciar();
                }
            } catch (IOException ex) {
                System.out.println("error");
            }
        }
    }//GEN-LAST:event_ValidarNActionPerformed

    private void DocIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocIdentidadActionPerformed

    private void PriApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriApeActionPerformed

    private void SegNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SegNomActionPerformed

    private void PriNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriNomActionPerformed

    private void SegApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SegApeActionPerformed

    private void NitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NitActionPerformed

    private void RazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RazonSocialActionPerformed

    private void ValidarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarJActionPerformed
        objSeg = new Seguridad();
        objcontrol = new Controlador();
        String Usu = getUsuario1().getText();
        String Dir = getDireccion().getText();
        String Tel = getTelefono().getText();
        String Cor = getCorreo().getText();
        String Psw = getContrasena1().getText();  
        String tipo = "Juridico";
        String RaSo = getRazonSocial().getText();
        String numnit = getNit().getText();
        if (RaSo.isEmpty() || numnit.isEmpty()) {
            mostrarAviso("Vacio", "Algun campo esta vacio");
        }else{
            try {
                boolean datos = objSeg.AgregaDatosJ(Usu, Psw, tipo, RaSo, numnit, Dir, Tel, Cor);
                if (datos == true) {
                    mostrarAviso("Aviso", "Registro correcto ya puede iniciar sesión");
                    Juridica.setVisible(false);
                    objcontrol.Iniciar();
                } else if (datos == false) {
                    mostrarAviso("Error", "El usuario digitado ya existe");
                    Juridica.setVisible(false);
                    objcontrol.Iniciar();
                }
            } catch (IOException ex) {
                System.out.println("error");
            }
        }
    }//GEN-LAST:event_ValidarJActionPerformed

    private void TJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TJuridicaActionPerformed
        TipoUsu.setVisible(false);
        Juridica.setVisible(true);
    }//GEN-LAST:event_TJuridicaActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
    }//GEN-LAST:event_RegistrarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        TipoUsu.setVisible(false);
    }//GEN-LAST:event_Volver1ActionPerformed

    private void Volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver2ActionPerformed
        Juridica.setVisible(false);
        TipoUsu.setVisible(true);
    }//GEN-LAST:event_Volver2ActionPerformed

    private void Volver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver3ActionPerformed
        Natural.setVisible(false);
        TipoUsu.setVisible(true);
    }//GEN-LAST:event_Volver3ActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
    }//GEN-LAST:event_IngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConContrasena1;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JPasswordField Contrasena1;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField DocIdentidad;
    private javax.swing.JButton Ingresar;
    private javax.swing.JFrame Juridica;
    private javax.swing.JFrame Natural;
    private javax.swing.JTextField Nit;
    private javax.swing.JTextField PriApe;
    private javax.swing.JTextField PriNom;
    private javax.swing.JTextField RazonSocial;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField SegApe;
    private javax.swing.JTextField SegNom;
    private javax.swing.JButton TJuridica;
    private javax.swing.JButton TNatural;
    private javax.swing.JTextField Telefono;
    private javax.swing.JFrame TipoUsu;
    private javax.swing.JTextField Usuario;
    private javax.swing.JTextField Usuario1;
    private javax.swing.JButton ValidarJ;
    private javax.swing.JButton ValidarN;
    private javax.swing.JLabel Voler;
    private javax.swing.JLabel Voler1;
    private javax.swing.JLabel Voler2;
    private javax.swing.JLabel Voler3;
    private javax.swing.JButton Volver;
    private javax.swing.JButton Volver1;
    private javax.swing.JButton Volver2;
    private javax.swing.JButton Volver3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
