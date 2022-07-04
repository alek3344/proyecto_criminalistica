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
public class consultar extends javax.swing.JPanel {

    
    private ListaCasos modelo;
    DefaultTableModel tabla;
    private String titu[] = {"CODIGO", "TIPO", "ASOCIACION", "DESCRIPCION", "PRIORIDAD", "NOM.CLAVE", "FECHA", "OBSERVACION"};
    
    
    /**
     * Creates new form consultar
     */
    public consultar() {
        initComponents();
    
        
        this.modelo = new ListaCasos();
        tabla = new DefaultTableModel();
        for (int i=0; i<titu.length; i++)
        {
            tabla.addColumn(titu[i]);
        }
        tabla1.setModel(tabla);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        atras = new javax.swing.JButton();

        panel2.setBackground(new java.awt.Color(153, 153, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("CONSULTAR");
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CODIGO");
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setForeground(new java.awt.Color(0, 0, 0));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        panel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 300, -1));

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

        panel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 300));

        atras.setBackground(new java.awt.Color(0, 0, 204));
        atras.setForeground(new java.awt.Color(0, 0, 0));
        atras.setText("ATRAS");
        atras.setBorder(null);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        panel2.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 150, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String dato = buscar.getText();
        
        for (int i=0; i<tabla1.getRowCount(); i++)
        {
            if (tabla1.getValueAt(i, 0).equals(dato))
            {
                tabla1.changeSelection(i, 0, false, false);
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    
    
    
    
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
    
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        inicios.fondo.setVisible(true);
        inicios.fondo1.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
                                    


}
