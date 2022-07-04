/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CASOS.Casos_1;
import modelo.CASOS.cibercrimen;
import modelo.CASOS.homicidio;
import modelo.CASOS.narcotrafico;
import modelo.sujeto.ListaDetective;
import modelo.sujeto.sujeto;
import modulo.ListaCasos;
import static vista.registrar.casos;
import static vista.registrar.modelo;

/**
 *
 * @author asus
 */
public class detectives extends javax.swing.JPanel {

    public static ListaDetective modelo;
    public static sujeto detecti;
    FileWriter salvar;
    
    DefaultTableModel tabla;
    
    public detectives() {
        initComponents();
        tabla = new DefaultTableModel();
        this.modelo = new ListaDetective();
        tabla = new DefaultTableModel();
        for (int i=0; i<detec.length; i++)
        {
            tabla.addColumn(detec[i]);
        }
        tabla1.setModel(tabla);
       registrarDetec();
    }

    private String detec[] = {"IDENTIFICACION", "NOMBRE", "EXPERIENCIA", "TIPO_CAS"};

    

    public void registrarDetec() {
        sujeto nuevoDetec = this.leerNuevoDec();
        modelo.insertarDetectives(nuevoDetec);
    }
    
    public sujeto leerNuevoDec() {
        sujeto sub1=null;
        return sub1;
    }
    
    public void textCasos() {

        try {
            salvar = new FileWriter("detectives.txt");
            List<sujeto> lista = modelo.leerDetectives();
            for (sujeto p : lista) {
                salvar.write(p.getDataStringFormat());
            }

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("ATRAS");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 140, 60));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDENTIFICACION", "NOMBRE", "EXPERIENCIA", "TIPO_CAS"
            }
        ));
        tabla1.setRowHeight(25);
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 780, 260));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("DETECTIVES ACTIVOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inicios.fondo.setVisible(true);
        inicios.fondo1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
