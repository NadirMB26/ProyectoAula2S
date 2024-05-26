
package packagecitasEnespera;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import metodos.Metodos;

public class EliminarCtsConf extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    List<String[]> citasList; 

    public EliminarCtsConf() {
        initComponents();
        modelo.addColumn("N_Cita"); 
        modelo.addColumn("Cc_Cliente");
        modelo.addColumn("Mascota");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado de cita");
        tablaCitasConf();
        descripcionLabel.setEditable(false);
    }

    private List<String[]> citasConf(String fileName) throws IOException {
        List<String[]> citasList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); 
                citasList.add(data);
            }
        }
        return citasList;
    }

    private void tablaCitasConf() {
        try {
            citasList = citasConf("citasConf.csv"); 

            for (String[] data : citasList) {
                Object[] rowData = new Object[data.length];
                for (int i = 0; i < data.length; i++) {
                    String[] splitData = data[i].split("=");
                    if (splitData.length > 1) {
                        rowData[i] = splitData[1].trim();
                    } else {
                        rowData[i] = "";
                    }
                }
                modelo.addRow(rowData);
            }

            tblusuarios2.setModel(modelo);
        } catch (IOException ex) {
            
        }
    }

    private String getDescripcion(int selectedRow) {
    if (selectedRow >= 0 && selectedRow < citasList.size()) {
        String descriptionData = citasList.get(selectedRow)[7]; 
        if (descriptionData.contains("=")) {
            descriptionData = descriptionData.split("=")[1].trim();
            if (descriptionData.endsWith("}")) {
                descriptionData = descriptionData.substring(0, descriptionData.length() - 1);
            }
        }
        return descriptionData; 
    }
    return "";
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnEliminarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblusuarios2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionLabel = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/consulta.png"))); // NOI18N
        jLabel1.setText("Eliminar Citas Confirmadas");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        btnEliminarC.setText("Eliminar Cita");
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        tblusuarios2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblusuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblusuarios2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblusuarios2);

        descripcionLabel.setColumns(20);
        descripcionLabel.setFont(new java.awt.Font("SimSun", 2, 14)); // NOI18N
        descripcionLabel.setRows(5);
        jScrollPane2.setViewportView(descripcionLabel);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        jLabel3.setText("Descripcion De La Cita");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarC)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        int selectedRow = tblusuarios2.getSelectedRow();
         
        if (selectedRow >= 0) {

            modelo.removeRow(selectedRow);
            citasList.remove(selectedRow);
            tblusuarios2.setModel(modelo);
        
            descripcionLabel.setText("");
           int a=JOptionPane.showConfirmDialog(this,"Deseas eliminar esta Mascota?");
            if(a==0){
               updateCSVFile();
               JOptionPane.showMessageDialog(null, "Cita eliminada exitosamente");
            } else if(a==1){
               JOptionPane.showMessageDialog(this,"Este Mascota no se elimino");
            }else{
               JOptionPane.showMessageDialog(this,"Cancelaste la operacion");
            }                                                   
        }
    }//GEN-LAST:event_btnEliminarCActionPerformed
    
    private void updateCSVFile() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("citasConf.csv"))) {
        for (String[] data : citasList) {
            bw.write(String.join(",", data));
            bw.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al eliminar datos del archivo: " + e.getMessage());
    }
}
    
    private void tblusuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblusuarios2MouseClicked
        int selectedRow = tblusuarios2.getSelectedRow();
        if (selectedRow >= 0) {           
            String description = getDescripcion(selectedRow);
            descripcionLabel.setText(description);
        }
    }//GEN-LAST:event_tblusuarios2MouseClicked
    
    public void buscarCitaC(String buscar){
    
        Metodos metodo = new Metodos();
        
        DefaultTableModel modelo = metodo.buscarCitasConf(buscar);
        
        tblusuarios2.setModel(modelo);
        
    }
    
    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        buscarCitaC(txtCedula.getText());
    }//GEN-LAST:event_txtCedulaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JTextArea descripcionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblusuarios2;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
