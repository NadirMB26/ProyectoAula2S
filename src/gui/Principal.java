
package gui;


import java.awt.BorderLayout;
import packagecitas.citaspantalla;
import packageclientes.Registrar;
import packagemascotas.mascotaspantalla;


public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnCE = new javax.swing.JButton();
        btnGTC = new javax.swing.JButton();
        btnGM = new javax.swing.JButton();
        btnGC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contentp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        btnCE.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/calendario.png"))); // NOI18N
        btnCE.setText("Citas en Espera");

        btnGTC.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/cronograma.png"))); // NOI18N
        btnGTC.setText(" Gestion Citas");
        btnGTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGTCActionPerformed(evt);
            }
        });

        btnGM.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/mascotas.png"))); // NOI18N
        btnGM.setText("Gestion Mascota");
        btnGM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGMActionPerformed(evt);
            }
        });

        btnGC.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/atencion-al-cliente (2).png"))); // NOI18N
        btnGC.setText("Gestion Cliente");
        btnGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("CLINICAS MASCOTAS");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("HISTORIAS ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(btnGC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGTC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        javax.swing.GroupLayout contentpLayout = new javax.swing.GroupLayout(contentp);
        contentp.setLayout(contentpLayout);
        contentpLayout.setHorizontalGroup(
            contentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        contentpLayout.setVerticalGroup(
            contentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(contentp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCActionPerformed
        clientespantalla p1=new clientespantalla();
        p1.setSize(980,520);
        p1.setLocation(0, 0);
        contentp.removeAll();
        contentp.add(p1,BorderLayout.CENTER);
        contentp.revalidate();
        contentp.repaint();
    
    }//GEN-LAST:event_btnGCActionPerformed

    private void btnGMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGMActionPerformed
        mascotaspantalla p1=new mascotaspantalla();
        p1.setSize(980,520);
        p1.setLocation(0, 0);
        contentp.removeAll();
        contentp.add(p1,BorderLayout.CENTER);
        contentp.revalidate();
        contentp.repaint();
    }//GEN-LAST:event_btnGMActionPerformed

    private void btnGTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGTCActionPerformed
        citaspantalla p5=new citaspantalla();
        p5.setSize(980,520);
        p5.setLocation(0, 0);
        contentp.removeAll();
        contentp.add(p5,BorderLayout.CENTER);
        contentp.revalidate();
        contentp.repaint();
    }//GEN-LAST:event_btnGTCActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnGC;
    private javax.swing.JButton btnGM;
    private javax.swing.JButton btnGTC;
    private javax.swing.JPanel contentp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
