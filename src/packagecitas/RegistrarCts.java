
package packagecitas;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import packageclientes.Clientes;


public class RegistrarCts extends javax.swing.JPanel {  
 
    public RegistrarCts() {
        initComponents();
        cregistro();
    }
    public void cregistro(){
  
         String archivoTexto = "C:\\Users\\nadir\\OneDrive\\Documents\\NetBeansProjects\\ProyectoAula\\citas.csv"; // Ruta al archivo de texto

        try (BufferedReader br = new BufferedReader(new FileReader(archivoTexto))) {
            String linea;
            int ultimoNumeroDeCita = 0;
            
            while ((linea = br.readLine()) != null) {
                // Parsea la línea para obtener el número de cita (supongamos que está en la primera posición)
                String[] partes = linea.split(",");
                int numeroDeCita = Integer.parseInt(partes[0].trim());

                // Actualiza el último número de cita si es mayor
                if (numeroDeCita > ultimoNumeroDeCita) {
                    ultimoNumeroDeCita = numeroDeCita;
                }
            }

            // Suma 'n' al último número de cita
            int n = 1; // Ejemplo: agrega 10 al último número de cita
            int nuevoNumeroDeCita = ultimoNumeroDeCita + n;
//            JOptionPane.showMessageDialog(this, "Último número de cita registrado: " + ultimoNumeroDeCita);
//            JOptionPane.showMessageDialog(this, "Nuevo número de cita: " + nuevoNumeroDeCita);
            txtCita.setText(String.valueOf(nuevoNumeroDeCita));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
        
        
   


 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVaciar = new javax.swing.JButton();
        btnGuardarcita = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnE = new javax.swing.JButton();
        btns = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboBoxMascotas = new javax.swing.JComboBox<>();
        btnbuscar = new javax.swing.JButton();
        txtfecha = new javax.swing.JTextField();
        btnfecha = new javax.swing.JButton();
        txtCita = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        timePicker1.setForeground(new java.awt.Color(37, 217, 255));
        timePicker1.setAlignmentY(50.0F);
        timePicker1.setDisplayText(txt1);

        timePicker2.setForeground(new java.awt.Color(255, 79, 73));
        timePicker2.setDisplayText(txt);

        dateChooser1.setTextRefernce(txtfecha);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/registrar.png"))); // NOI18N
        jLabel1.setText("Registrar Cita");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("CC. cliente");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("fecha");

        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        btnGuardarcita.setText("Guardar");
        btnGuardarcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarcitaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("hora de entrada");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("hora de salida");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        btnE.setText("Entrada");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btns.setText("Salida");
        btns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Mascota");

        comboBoxMascotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboBoxMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxMascotasMouseClicked(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnfecha.setText("...");
        btnfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfechaActionPerformed(evt);
            }
        });

        txtCita.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("N_Cita");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCita, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btns))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnbuscar))
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnVaciar)
                                        .addGap(56, 56, 56)
                                        .addComponent(btnGuardarcita))))
                            .addComponent(jLabel6))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(comboBoxMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfecha)
                    .addComponent(comboBoxMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVaciar)
                    .addComponent(btnGuardarcita))
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(75, 75, 75))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        txtCedula.setText("");
        txt.setText("");
        txt1.setText("");
        setWhite();
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnGuardarcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarcitaActionPerformed
     
        Citas cita = new Citas();
        cita.IDcita =txtCita.getText();
        cita.CcCliente = txtCedula.getText().trim();
        cita.Mascota = ""+comboBoxMascotas.getSelectedItem();
        cita.Hentrada = txt1.getText().trim();
        cita.Hsalida = txt.getText().trim();
        cita.Fecha = txtfecha.getText().trim(); 
        
        String archivoTexto = "citas.csv"; // Ruta al archivo de texto
    
        try (BufferedReader br = new BufferedReader(new FileReader(archivoTexto))) {
            LocalTime horaEntradaNuevaCita =  LocalTime.parse(cita.Hentrada, DateTimeFormatter.ofPattern("hh:mm a")); // Ejemplo: 10:00 AM
            LocalTime horaSalidaNuevaCita = LocalTime.parse(cita.Hsalida, DateTimeFormatter.ofPattern("hh:mm a")); // Ejemplo: 11:30 AM
         
             boolean superposicion = false;
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                LocalTime horaEntradaExistente = LocalTime.parse(partes[3], DateTimeFormatter.ofPattern("hh:mm a"));
                LocalTime horaSalidaExistente = LocalTime.parse(partes[4], DateTimeFormatter.ofPattern("hh:mm a"));

                if (horaEntradaNuevaCita.isAfter(horaEntradaExistente)
                        && horaEntradaNuevaCita.isBefore(horaSalidaExistente)
                        || horaSalidaNuevaCita.isAfter(horaEntradaExistente)
                        && horaSalidaNuevaCita.isBefore(horaSalidaExistente)) {
                    superposicion = true;
                    break;
                }
            }

            if (superposicion) {
                JOptionPane.showMessageDialog(null,"La nueva cita se superpone con una cita existente. No se puede programar.");
            } else {
                JOptionPane.showMessageDialog(null, "La nueva cita puede programarse sin superposición.");
                 try {
                PrintWriter writer = new PrintWriter(new FileWriter("citas.csv", true));
                // Escribir los datos en formato CSV
                writer.printf("%s,%s,%s,%s,%s,%s%n",
                        cita.IDcita,
                        cita.CcCliente,
                        cita.Mascota,
                        cita.Hentrada,
                        cita.Hsalida,
                        cita.Fecha);
                writer.close();
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
                System.out.println("Datos guardados correctamente.");
            } catch (IOException ex) {
                System.err.println("Error al guardar los datos: " + ex.getMessage());
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
  
        


       
           
          
            
    }//GEN-LAST:event_btnGuardarcitaActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
      timePicker1.showPopup(this,350,105);
    }//GEN-LAST:event_btnEActionPerformed

    private void btnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsActionPerformed
        timePicker2.showPopup(this,350,105);
    }//GEN-LAST:event_btnsActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
      String archivoCSV = "C:\\Users\\nadir\\OneDrive\\Documents\\NetBeansProjects\\ProyectoAula\\mascotas.csv"; // Cambia esto al nombre de tu archivo CSV
        String variableAComprobar = txtCedula.getText(); // Cambia esto al valor que deseas comprobar

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
            
        comboBoxMascotas.removeAllItems();
        try {
    BufferedReader reader = new BufferedReader(new FileReader("mascotas.csv"));
    String linea;
    while ((linea = reader.readLine()) != null) {
        String[] partes = linea.split(",");
        String cedula = partes[0];
        String nombreMascota = partes[1]; // El nombre de la mascota está en la posición 1
        if (cedula.equals(variableAComprobar)) {
        comboBoxMascotas.addItem(nombreMascota); // Agrega el nombre al combobox
        }
    }
    reader.close();
} catch (IOException e) {
    e.printStackTrace();
}
                
        } else {
    
            JOptionPane.showMessageDialog(this,"Cliente no registrado");

        }
        
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void comboBoxMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxMascotasMouseClicked
     comboBoxMascotas.addActionListener(e -> {
    String mascotaSeleccionada = (String) comboBoxMascotas.getSelectedItem();
    // Aquí puedes realizar acciones según la mascota seleccionada
    // Por ejemplo, mostrar detalles de la mascota en otro componente o realizar alguna operación.
});
    }//GEN-LAST:event_comboBoxMascotasMouseClicked

    private void btnfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfechaActionPerformed
       dateChooser1.showPopup();
    }//GEN-LAST:event_btnfechaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
           char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtCedulaKeyTyped
     public void setWhite() {
        txtCedula.setBackground(Color.WHITE);
        txt.setBackground(Color.WHITE);
        txt1.setBackground(Color.WHITE);
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnGuardarcita;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnfecha;
    private javax.swing.JButton btns;
    private javax.swing.JComboBox<String> comboBoxMascotas;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JLabel txtCita;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}
