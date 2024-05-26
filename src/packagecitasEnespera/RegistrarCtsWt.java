
package packagecitasEnespera;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import packagecitas.Citas;
import packageclientes.Clientes;


public class RegistrarCtsWt extends javax.swing.JPanel { 
    public RegistrarCtsWt() {
        initComponents();

    }
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVaciar = new javax.swing.JButton();
        btnConfCita = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBowserDC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        etiNoCT = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etiCedula = new javax.swing.JLabel();
        etiDate = new javax.swing.JLabel();
        etiMascota = new javax.swing.JLabel();
        etiHent = new javax.swing.JLabel();
        etiHsal = new javax.swing.JLabel();
        etiDester = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescript = new javax.swing.JTextArea();
        comboBoxMascotas = new javax.swing.JComboBox<>();
        comboBoxNcita = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/registrar.png"))); // NOI18N
        jLabel1.setText("Registrar Citas En Espera");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("CC. cliente");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Fecha De Cita");

        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        btnConfCita.setText("Confirmar Cita");
        btnConfCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfCitaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("H entrada");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("H salida");

        txtBowserDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBowserDCKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Mascota");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        etiNoCT.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        etiNoCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiNoCT.setToolTipText("");
        etiNoCT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("No Cita");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingrese la CC Cliente");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        etiCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiHent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiHsal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiDester.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        etiDester.setText("Descripcion");

        txtDescript.setColumns(20);
        txtDescript.setRows(5);
        jScrollPane1.setViewportView(txtDescript);

        comboBoxMascotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        comboBoxNcita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel10.setText("MASCOT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtBowserDC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnbuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(etiDester)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVaciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfCita))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(etiNoCT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(6, 6, 6)
                                                .addComponent(etiCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(14, 14, 14)
                                                .addComponent(etiMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(etiHent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel9)
                                                .addGap(13, 13, 13)
                                                .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(34, 34, 34)
                                        .addComponent(etiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(comboBoxNcita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiNoCT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtBowserDC, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxNcita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiHent, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiDester)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciar)
                    .addComponent(btnConfCita))
                .addGap(19, 19, 19))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String idCliente = txtBowserDC.getText();
        
        // Buscar la cita en el archivo CSV (sin descripción)
        Citas citaEncontrada = null;
        comboBoxNcita.removeAllItems();
        comboBoxMascotas.removeAllItems();
        try (BufferedReader br = new BufferedReader(new FileReader("citas.csv"))) {
             String linea;
                  
         
         while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(",");
        String cedula = datos[0];
        String nombreMascota = datos[2]; // El nombre de la mascota está en la posición 1
        String NoCta = datos[0];
        if (datos[1].equals(idCliente)) {
          citaEncontrada = new Citas(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]); // No incluye descripción
//                    break;
                comboBoxMascotas.addItem(nombreMascota);
                comboBoxNcita.addItem(NoCta);
     {
        
             // Agrega el nombre al combobox
        }
    }
                


//                if (datos[1].equals(idCliente)) {
//                    citaEncontrada = new Citas(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]); // No incluye descripción
//                    break;
//                }
           }
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo de citas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }

      // Solicitar y almacenar la descripción de la cita
        String descripcionCita = txtDescript.getText();
        populateJLabels(citaEncontrada);

        // Si se encontró la cita y se ingresó la descripción, mostrar la información
        if (citaEncontrada != null && descripcionCita != null && !descripcionCita.isEmpty()) {
            citaEncontrada.setDescrip(descripcionCita); // Asignar la descripción
            
        } else {
           // Manejar el caso de no encontrar cita o no ingresar descripción
        if (citaEncontrada == null) {
            JOptionPane.showMessageDialog(null, "No se encontró cita para el ID de cliente: " + idCliente, "Error", JOptionPane.ERROR_MESSAGE);
        } else if (descripcionCita.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese La Descripcion De La Cita.", "Consejo", JOptionPane.INFORMATION_MESSAGE);
        }
            
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnConfCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfCitaActionPerformed
        String idCita = etiNoCT.getText();
        String ccCliente = etiCedula.getText();
        String mascota = etiMascota.getText();
        String hEntrada = etiHent.getText();
        String hSalida = etiHsal.getText();
        String fecha = etiDate.getText();
        String descripcion = txtDescript.getText();

        // Confirmar actualización
        int respuesta =JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea guardar los cambios?", 
            "Confirmar", JOptionPane.YES_NO_OPTION); {
            if (respuesta == JOptionPane.YES_OPTION) {
           // Crear un nuevo objeto Citas con la información actualizada
             Citas citaActualizada = new Citas(idCita, ccCliente, mascota, hEntrada, hSalida, fecha);
             citaActualizada.setDescrip(descripcion);
             citaActualizada.setConfCita("1");

        try {
          // Eliminar la cita original del archivo citas.csv
            removeAppointmentFromOriginalFile(idCita);

            // Guardar la cita actualizada en el nuevo archivo citasConf.csv
            guardarCitaEnNuevoArchivo(citaActualizada);

             // Mostrar mensaje de confirmación al usuario
            JOptionPane.showMessageDialog(null, "Cita guardada exitosamente.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Error al guardar la cita: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    }//GEN-LAST:event_btnConfCitaActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        setWhite();
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void txtBowserDCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBowserDCKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtBowserDCKeyTyped
    
    private void populateJLabels(Citas cita) {
         if (cita != null) {
            etiNoCT.setText(cita.getIDcita());
            etiCedula.setText(cita.getCcCliente());
            etiMascota.setText(cita.getMascota());
            etiHent.setText(cita.getHentrada());
            etiHsal.setText(cita.getHsalida());
            etiDate.setText(cita.getFecha());
            txtDescript.setText(cita.getDescrip());
            etiNoCT.setVisible(true);
            etiCedula.setVisible(true);
            etiMascota.setVisible(true);
            etiHent.setVisible(true);
            etiHsal.setVisible(true);
            etiDate.setVisible(true);
         //... establezca la visibilidad para otros JLabels
             
         }
    }
    
    private void guardrActlz(Citas citaActualizada) {
        try (BufferedReader br = new BufferedReader(new FileReader("citas.csv"))) {
            StringBuilder contenidoActualizadoArchivo = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(citaActualizada.getIDcita())) {
                    // Actualizar línea para la cita coincidente
                    String líneaActualizada = citaActualizada.toString() + "\n";
                    contenidoActualizadoArchivo.append(líneaActualizada);
                } else {
                    // Agregar líneas sin cambios
                    contenidoActualizadoArchivo.append(linea).append("\n");
                }
            }

            // Escribir contenido actualizado en el archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("citasConf.csv"))) {
                bw.write(contenidoActualizadoArchivo.toString());
                JOptionPane.showMessageDialog(null, "Cita guardada exitosamente.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de citas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    
    }
    private void guardarCitaEnNuevoArchivo(Citas cita) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("citasConf.csv", true))) {
             bw.append(cita.toString() + "\n");
        } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "Error al guardar en citasConf.csv: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
    
    private void removeAppointmentFromOriginalFile(String citaID) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("citas.csv"));
  BufferedWriter bw = new BufferedWriter(new FileWriter("citas_temp.csv")); // Temporary file
  String line;

  while ((line = br.readLine()) != null) {
    String[] data = line.split(",");
    if (!data[0].equals(citaID)) { // Skip the appointment to be removed
      bw.write(line + "\n");
    }
  }

  br.close();
  bw.close();

  // Replace original file with temporary file
  File originalFile = new File("citas.csv");
  File tempFile = new File("citas_temp.csv");
  if (originalFile.delete()) {
    tempFile.renameTo(originalFile);
  } else {
    System.out.println("Failed to delete original citas.csv");
  }
}
    

    public void setWhite() {
        etiNoCT.setText("");
        txtBowserDC.setText("");
        etiCedula.setText("");
        etiMascota.setText("");
        etiHent.setText("");
        etiHsal.setText("");
        etiDate.setText("");  
        txtDescript.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfCita;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<String> comboBoxMascotas;
    private javax.swing.JComboBox<String> comboBoxNcita;
    private javax.swing.JLabel etiCedula;
    private javax.swing.JLabel etiDate;
    private javax.swing.JLabel etiDester;
    private javax.swing.JLabel etiHent;
    private javax.swing.JLabel etiHsal;
    private javax.swing.JLabel etiMascota;
    private javax.swing.JLabel etiNoCT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBowserDC;
    private javax.swing.JTextArea txtDescript;
    // End of variables declaration//GEN-END:variables
}