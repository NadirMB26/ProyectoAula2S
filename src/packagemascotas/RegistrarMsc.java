
package packagemascotas;
import java.awt.Color;
import packagemascotas.Mascotas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import metodos.Metodos;

public class RegistrarMsc extends javax.swing.JPanel {
    
    ArrayList <Mascotas> ListaMascotas = new ArrayList<Mascotas>();
    
    Metodos metodo = new Metodos();

    public RegistrarMsc() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNmasc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnVaciarMasct = new javax.swing.JButton();
        btnGuardarMasct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtMascID = new javax.swing.JTextField();
        txtTsangre = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtTvida = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/registrar.png"))); // NOI18N
        jLabel1.setText("Registrar Mascota");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("CC. cliente");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Nombre M");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Especie");

        btnVaciarMasct.setText("Vaciar");
        btnVaciarMasct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarMasctActionPerformed(evt);
            }
        });

        btnGuardarMasct.setText("Guardar");
        btnGuardarMasct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMasctActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Id Mascota");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Color");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("T de sangre");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("Tiempo de vida");

        txtTsangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTsangreActionPerformed(evt);
            }
        });

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNmasc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTsangre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTvida, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMascID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVaciarMasct)
                                .addGap(79, 79, 79)
                                .addComponent(btnGuardarMasct)
                                .addGap(90, 90, 90))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMascID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNmasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txtTsangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTvida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarMasct)
                    .addComponent(btnVaciarMasct))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVaciarMasctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarMasctActionPerformed
        txtCedula.setText("");
        txtNmasc.setText("");
        txtMascID.setText("");
        txtTsangre.setText("");
        txtColor.setText("");
        txtTvida.setText("");
        txtEspecie.setText("");
        setWhite();
    }//GEN-LAST:event_btnVaciarMasctActionPerformed

    private void btnGuardarMasctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMasctActionPerformed
        Mascotas mascota= new Mascotas(); 
        int validacion = 0;
        String nombreM,CCliente,IDmasc,color,Tsangre,apellido,Tvida,especie;
        
        CCliente = txtCedula.getText().trim();
        nombreM = txtNmasc.getText().trim();
        color = txtColor.getText().trim();
        Tsangre =txtTsangre.getText().trim();
        IDmasc = txtMascID.getText();
        Tvida = txtTvida.getText();
        especie = txtEspecie.getText();
        
        mascota.setIDmascota(Integer.parseInt(IDmasc));
        mascota.setnombreM(nombreM);
        mascota.setColor(color);
        mascota.setTsangre(Tsangre);
        mascota.setTvida(Tvida);
        mascota.setEspecie(especie);
        
        metodo.guardarMsc(mascota);
        
            if (nombreM.equals("")){
               txtNmasc.setBackground(Color.red);
               validacion++;         
            }
            
            if (CCliente.equals("")){
               txtCedula.setBackground(Color.red);
               validacion++;         
            }
            
            
            if (color.equals("")){
               txtColor.setBackground(Color.red);
               validacion++;
            }   
            
            if (Tsangre.equals("")){
               txtTsangre.setBackground(Color.red);
               validacion++;
            }
            
            if (IDmasc.equals("")){
               txtMascID.setBackground(Color.red);
               validacion++;   
            }
            
            if (Tvida.equals("")){
               txtTvida.setBackground(Color.red);
               validacion++;   
            }

            if (especie.equals("")){
               txtEspecie.setBackground(Color.red);
               validacion++;   
            }
            
            if (validacion != 0){
                JOptionPane.showMessageDialog(null, "Se deben completar todos los campos");
            } else {
                txtNmasc.setBackground(Color.green);
                txtCedula.setBackground(Color.green);
                txtColor.setBackground(Color.green);
                txtTsangre.setBackground(Color.green);
                txtMascID.setBackground(Color.green);
                txtTvida.setBackground(Color.green);
                txtEspecie.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                
                
            }
    
    // Guardar los datos en un archivo (puedes elegir el tipo de archivo según tus necesidades)
    // Por ejemplo, guardar en un archivo de texto:
    try {
        
        if (!nombreM.isEmpty() && !IDmasc.isEmpty() &&
            !color.isEmpty() && !Tsangre.isEmpty() && !Tvida.isEmpty() && !especie.isEmpty()) {

            // Escribe los datos en el archivo "clientes.txt"
            FileWriter writer = new FileWriter("mascotas.csv", true);
            BufferedWriter bw = new BufferedWriter(writer);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(CCliente);
            pw.print("|"+IDmasc);
            pw.print("|"+nombreM);
            pw.print("|"+color);
            pw.print("|"+Tsangre);
            pw.print("|"+Tvida);
            pw.println("|"+especie);
            pw.close();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            System.out.println("Datos guardados correctamente.");
            //ListadoM listadoM = new ListadoM();
            //listadoM.refrescarLista();
        } else {
           JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
           System.out.println("Por favor, completa todos los campos.");
        }
        
    } catch (IOException ex) {
        System.err.println("Error al guardar los datos: " + ex.getMessage());
    }      

    }//GEN-LAST:event_btnGuardarMasctActionPerformed

    private void txtTsangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTsangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTsangreActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed
     public void setWhite() {
        txtNmasc.setBackground(Color.WHITE);
        txtCedula.setBackground(Color.WHITE);
        txtColor.setBackground(Color.WHITE);
        txtTsangre.setBackground(Color.WHITE);
        txtMascID.setBackground(Color.WHITE);
        txtTvida.setBackground(Color.WHITE);
        txtEspecie.setBackground(Color.WHITE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarMasct;
    private javax.swing.JButton btnVaciarMasct;
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
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtMascID;
    private javax.swing.JTextField txtNmasc;
    private javax.swing.JTextField txtTsangre;
    private javax.swing.JTextField txtTvida;
    // End of variables declaration//GEN-END:variables
}
