
package packagecitasEnespera;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/registrar.png"))); // NOI18N
        jLabel1.setText("Registrar Cita");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("CC. cliente");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("fecha");

        btnVaciar.setText("Vaciar");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Mascota");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        etiNoCT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("No Cita");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingrese la CC Cliente");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        etiCedula.setText("jLabel10");

        etiDate.setText("jLabel10");

        etiMascota.setText("jLabel10");

        etiHent.setText("jLabel10");

        etiHsal.setText("jLabel10");

        etiDester.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        etiDester.setText("Descripcion");

        txtDescript.setColumns(20);
        txtDescript.setRows(5);
        jScrollPane1.setViewportView(txtDescript);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(etiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(etiNoCT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtBowserDC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnbuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(etiCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(etiMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnVaciar)
                        .addGap(61, 61, 61)
                        .addComponent(btnConfCita))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiDester)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiHent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9)
                                .addGap(13, 13, 13)
                                .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(etiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etiNoCT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtBowserDC, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(37, 37, 37)
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
                    .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiDester))
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaciar)
                    .addComponent(btnConfCita)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String idCliente = txtBowserDC.getText();

        // Buscar la cita en el archivo CSV (sin descripción)
        Citas citaEncontrada = null;
        try (BufferedReader br = new BufferedReader(new FileReader("citas.csv"))) {
             String linea;
            while ((linea = br.readLine()) != null) {
                  String[] datos = linea.split(",");
                if (datos[1].equals(idCliente)) {
                    citaEncontrada = new Citas(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]); // No incluye descripción
                    break;
                }
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
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea guardar los cambios?", 
                "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Citas citaActualizada = new Citas(idCita, ccCliente, mascota, hEntrada, hSalida, fecha);
            citaActualizada.setDescrip(txtDescript.getText());
            citaActualizada.setConfCita("1");
            guardaCtaUPD(citaActualizada);
        }
    }//GEN-LAST:event_btnConfCitaActionPerformed
    
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
    
    private void saveCita(Citas cita) {
    try (FileWriter fw = new FileWriter("citas.csv", true)) {
        fw.write(cita.toString() + "\n");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar la cita: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void guardaCtaUPD(Citas citaActualizada) {
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
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("citas.csv"))) {
                bw.write(contenidoActualizadoArchivo.toString());
                JOptionPane.showMessageDialog(null, "Cita guardada exitosamente.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de citas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel etiCedula;
    private javax.swing.JLabel etiDate;
    private javax.swing.JLabel etiDester;
    private javax.swing.JLabel etiHent;
    private javax.swing.JLabel etiHsal;
    private javax.swing.JLabel etiMascota;
    private javax.swing.JLabel etiNoCT;
    private javax.swing.JLabel jLabel1;
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
