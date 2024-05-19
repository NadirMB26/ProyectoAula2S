
package packageclientes;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consultar extends javax.swing.JPanel {

    DefaultTableModel modelo=new DefaultTableModel();
    public Consultar() {
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
        tblusuarios2.setModel(modelo);
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
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblusuarios2 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/consulta.png"))); // NOI18N
        jLabel1.setText("Consultar Cliente");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Cedula");

        Cbuscar.setText("Buscar");
        Cbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuscarActionPerformed(evt);
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
        jScrollPane1.setViewportView(tblusuarios2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cbuscar)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Cbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  

    private void CbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuscarActionPerformed
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
            for (int i = 0; i < tblusuarios2.getRowCount(); i++) {
                String documento = (String) tblusuarios2.getValueAt(i, 0);
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
             for (int i = 0; i < tblusuarios2.getRowCount(); i++) {
                String documento = (String) tblusuarios2.getValueAt(i, 0);
                if (documento.equals(activo)) {
                    // Seleccionar la fila correspondiente si se encuentra la coincidencia
                    tblusuarios2.setRowSelectionInterval(i, i);
                    // Hacer scroll a la fila seleccionada
                    tblusuarios2.scrollRectToVisible(new Rectangle(tblusuarios2.getCellRect(i, 0, true)));
                   
                    break;
                }
        }
    }//GEN-LAST:event_CbuscarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();

    }//GEN-LAST:event_txtCedulaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblusuarios2;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
