
package Principal;


import java.awt.BorderLayout;
import java.util.*;
import packagecitas.citaspantalla;
import packagecitasEnespera.citasESPpantalla;
import packagemascotas.mascotaspantalla;
import packagemascotas.pantallamascotas;
import packagemascotas.mascotaspantalla;


public class Principal extends javax.swing.JFrame implements Runnable {
    String hora,minutos,segundos,ampm;
    Calendar calendrio;
    Thread hi;
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        hi=new Thread(this);
        hi.start();
        setVisible(true);
    }
public void run(){
Thread ct=Thread.currentThread();
while(ct==hi){
calcula();
reloj.setText(hora+":"+minutos+":"+segundos+":"+ampm);
try{
   Thread.sleep(1000);
}catch(InterruptedException e){
    
}
}
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
        reloj = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contentp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        btnCE.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/calendario.png"))); // NOI18N
        btnCE.setText("Citas en Espera");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnGTC.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/cronograma.png"))); // NOI18N
        btnGTC.setText(" Gestion Citas");
        btnGTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGTCActionPerformed(evt);
            }
        });

        btnGM.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/mascotas.png"))); // NOI18N
        btnGM.setText("Gestion Mascota");
        btnGM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGMActionPerformed(evt);
            }
        });

        btnGC.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/atencion-al-cliente (2).png"))); // NOI18N
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

        reloj.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Hora:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(reloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout contentpLayout = new javax.swing.GroupLayout(contentp);
        contentp.setLayout(contentpLayout);
        contentpLayout.setHorizontalGroup(
            contentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
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
        mascotaspantalla p2=new mascotaspantalla();
        p2.setSize(980,520);
        p2.setLocation(0, 0);
        contentp.removeAll();
        contentp.add(p2,BorderLayout.CENTER);
        contentp.revalidate();
        contentp.repaint();
    }//GEN-LAST:event_btnGMActionPerformed

    private void btnGTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGTCActionPerformed
        citaspantalla p3=new citaspantalla();
        p3.setSize(980,520);
        p3.setLocation(0, 0);
        contentp.removeAll();
        contentp.add(p3,BorderLayout.CENTER);
        contentp.revalidate();
        contentp.repaint();
    }//GEN-LAST:event_btnGTCActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        citasESPpantalla p3=new citasESPpantalla();
        p3.setSize(980,520);
        p3.setLocation(0, 0);
        contentp.removeAll();
        contentp.add(p3,BorderLayout.CENTER);
        contentp.revalidate();
        contentp.repaint();
    }//GEN-LAST:event_btnCEActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel reloj;
    // End of variables declaration//GEN-END:variables


   

    private void calcula() {
Calendar calendario=new GregorianCalendar();
Date fechaHoraActual=new Date();

calendario.setTime(fechaHoraActual);
ampm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
if(ampm.equals("PM")){
    int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
    hora=h>9?""+h:"0"+h;
}else{
hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.HOUR_OF_DAY);
}
    minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
