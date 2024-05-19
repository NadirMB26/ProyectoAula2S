
package packageclientes;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Eliminar extends javax.swing.JPanel {
DefaultTableModel modelo=new DefaultTableModel();

    public Eliminar() {
        initComponents();
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        refrescarLista();
    }
     public void refrescarLista(){
        tblusuarios3.setModel(modelo);
         File file = new File("clientes.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
               modelo.addRow(parts);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnbuscarE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblusuarios3 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/basura.png"))); // NOI18N
        jLabel1.setText("Eliminar Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Cedula");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        btnbuscarE.setText("Buscar");
        btnbuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarEActionPerformed(evt);
            }
        });

        tblusuarios3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblusuarios3);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuscarE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnEliminar)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  
       
        int a=JOptionPane.showConfirmDialog(this,"Deseas eliminar este cliente?");
        if(a==0){
      this.modelo=(DefaultTableModel)tblusuarios3.getModel();
      modelo.removeRow(tblusuarios3.getSelectedRow());
      try{
          String archivo="Clientes.csv";
          BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
          for(int i=0; i<tblusuarios3.getRowCount();i++){
          for(int j=0;j<tblusuarios3.getColumnCount();j++){
              bw.write((String)(tblusuarios3.getValueAt(i,j)));
              if(j<tblusuarios3.getColumnCount()-1){
              bw.write(",");
              }
          }
          bw.newLine();
          }
          bw.close();
          JOptionPane.showMessageDialog(this,"Cliente eliminado con exito");
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
        }else if(a==1){
     
      JOptionPane.showMessageDialog(this,"Este cliente no se elimino");
        }else{
        JOptionPane.showMessageDialog(this,"Cancelaste la operacion");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnbuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarEActionPerformed
       String archivoCSV = "C:\\Users\\nadir\\OneDrive\\Documents\\NetBeansProjects\\ProyectoAula\\clientes.csv"; // Cambia esto al nombre de tu archivo CSV
 int entrada=1;
 modelo.setRowCount(0);
 if(entrada==1){
    refrescarLista(); 
 }
 String variableAComprobar = txtCedula.getText(); // Cambia esto al valor que deseas comprobar
 String  activo="";
        boolean existe = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(","); // Suponiendo que tu CSV está separado por comas

                // Comparar el valor con la primera columna
                if (datos.length > 0 && datos[0].equals(variableAComprobar)) {
                    existe = true;
                    break; // No es necesario seguir leyendo una vez que encontramos la variable
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (existe) {
            String searchTerm = variableAComprobar;
            activo=searchTerm;
            for (int i = 0; i < tblusuarios3.getRowCount(); i++) {
                String documento = (String) tblusuarios3.getValueAt(i, 0);
                if (documento.equals(searchTerm)) {
                    // Seleccionar la fila correspondiente si se encuentra la coincidencia
                    modelo.setRowCount(0);
                    File file = new File("clientes.csv");
                    try {
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            String[] parts = line.split(",");
                            if (parts[0].equals(searchTerm)) {
                                modelo.addRow(parts);
                            }
                        }
                        

                        scanner.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    break;
                    
                } else {

                }
            }
        } else {

 JOptionPane.showMessageDialog(this, "Cliente no registrado\n Actualizamos la lista por si tienes algun error");

        }
             for (int i = 0; i < tblusuarios3.getRowCount(); i++) {
                String documento = (String) tblusuarios3.getValueAt(i, 0);
                if (documento.equals(activo)) {
                    // Seleccionar la fila correspondiente si se encuentra la coincidencia
                    tblusuarios3.setRowSelectionInterval(i, i);
                    // Hacer scroll a la fila seleccionada
                    tblusuarios3.scrollRectToVisible(new Rectangle(tblusuarios3.getCellRect(i, 0, true)));
                   
                    break;
                }
        }
    }//GEN-LAST:event_btnbuscarEActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c= evt.getKeyChar();
                if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_txtCedulaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnbuscarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblusuarios3;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
