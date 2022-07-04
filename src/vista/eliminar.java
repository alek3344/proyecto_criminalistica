/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modulo.ListaCasos;

/**
 *
 * @author asus
 */
public class eliminar extends javax.swing.JPanel {

    /**
     * Creates new form eliminar1
     */
    public eliminar() {
        initComponents();
        
        this.modelo = new ListaCasos();
        tabla = new DefaultTableModel();
        for (int i=0; i<titu.length; i++)
        {
            tabla.addColumn(titu[i]);
        }
        tabla1.setModel(tabla);
    }

    private ListaCasos modelo;
    DefaultTableModel tabla;
    private String titu[] = {"CODIGO", "TIPO", "ASOCIACION", "DESCRIPCION", "PRIORIDAD", "NOM.CLAVE", "FECHA", "OBSERVACION"};
    private String datos[][] = {null};
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("ELIMINAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "TIPO", "ASOCIACION", "DESCRIPCION", "PRIORIDAD", "NOM.CLAVE", "FECHA", "OBSERVACION"
            }
        ));
        tabla1.setRowHeight(20);
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 800, 300));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("seleccione la fila que desea eliminar y presione el boton");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        eliminar.setBackground(new java.awt.Color(255, 51, 51));
        eliminar.setForeground(new java.awt.Color(51, 51, 0));
        eliminar.setText("ELIMINAR");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 60));

        atras.setBackground(new java.awt.Color(51, 51, 255));
        atras.setForeground(new java.awt.Color(0, 0, 102));
        atras.setText("ATRAS");
        atras.setBorder(null);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 130, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try
        {
            int fila = tabla1.getSelectedRow();
            tabla.removeRow(fila);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "seleccione una fila");
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        inicios.fondo1.setVisible(false);
        inicios.fondo.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    
    public void datosText() {
        BufferedReader bufferedReader = null;

        try {
            
            bufferedReader = new BufferedReader(new FileReader("casos.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] rowfields = line.split(";");
                tabla.addRow(rowfields);
                line = bufferedReader.readLine();
            }

        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}