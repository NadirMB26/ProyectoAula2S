/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packagemascotas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodos;
import packageclientes.Clientes;



public class EliminarMsc extends javax.swing.JPanel {

    DefaultTableModel Mascots;
    Metodos metodo= new Metodos();
    Vector del = new Vector();
    public EliminarMsc() {
        initComponents();
        
        //DefaultTableModel Mascots = new DefaultTableModel(del,0);
        Mascots = (DefaultTableModel) tblDelpets.getModel();
        tblDelpets.setModel(metodo.ListMasc());

    }
    
    public void UpdateTble(ArrayList<Mascotas> mascotas) {
        Mascots.setRowCount(0);
        Mascots = (DefaultTableModel) tblDelpets.getModel();
        for (Mascotas mascota : mascotas) {
            Object[] fila = {mascota.getNdocument(), mascota.getIDmascota(), mascota.getnombreM(), mascota.getColor(),
                mascota.getTsangre(), mascota.getTvida(), mascota.getEspecie()};
            Mascots.addRow(fila);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDelpets = new javax.swing.JTable();
        btnElim = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        etiANEW = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/basura.png"))); // NOI18N
        jLabel1.setText("Eliminar Mascota");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("CC cliente");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblDelpets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDelpets);

        btnElim.setText("Eliminar");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnRegresar.setText("Vaciar");

        etiANEW.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        etiANEW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiANEW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)
                                .addGap(12, 12, 12))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnRegresar)
                .addGap(18, 18, 18)
                .addComponent(btnElim)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(etiANEW, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(etiANEW, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(btnElim))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String CCliente = jTextField1.getText();
        
        String archivoMascotas = "mascotas.txt"; // Reemplaza con la ruta real de tu archivo

        try {
            ArrayList<Mascotas> mascotas = metodo.buscarMascotas(CCliente, archivoMascotas);
            UpdateTble(mascotas); // Llama a un método para actualizar la tabla con los resultados de la búsqueda
            etiANEW.setText("MASCOTAS ASOCIADAS AL USUARIO"); // Actualiza el texto de la etiqueta
        } catch (IOException e) {
            System.err.println("Error al buscar mascotas: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: No se encontraron mascotas asociadas a la cédula ingresada.", "Error", JOptionPane.ERROR_MESSAGE); // Mostrar mensaje de error al usuario
            etiANEW.setText("Error: No se encontraron mascotas"); // Actualizar el texto de la etiqueta
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        this.Mascots = (DefaultTableModel) tblDelpets.getModel();
        Mascots.removeRow(tblDelpets.getSelectedRow());
        
        try {
            String Filem = "mascotas.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(Filem));
            for(int i=0;i<tblDelpets.getColumnCount();i++){
                for(int j=0;j<tblDelpets.getColumnCount();j++){
                    bw.write((String) (tblDelpets.getValueAt(i,j)));
                    if(j<tblDelpets.getColumnCount()-1) {
                        bw.write("|");
                    }
                }
                bw.newLine();
                
            }
            bw.close();         
        }catch(Exception e){

        }
        
        JOptionPane.showMessageDialog(null, "Mascota eliminada con exito!!");
    }//GEN-LAST:event_btnElimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel etiANEW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDelpets;
    // End of variables declaration//GEN-END:variables
}
