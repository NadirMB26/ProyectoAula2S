
package packagecitas;

import java.awt.BorderLayout;
import packagemascotas.ActualizarCts;
import packagemascotas.ConsultarCts;
import packagemascotas.EliminarCts;
import packagemascotas.RegistrarMsc;


public class citaspantalla extends javax.swing.JPanel {

    public citaspantalla() {
        initComponents();
       RegistrarCts p1=new RegistrarCts();
        p1.setSize(680,420);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 730, 380));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        btnConsultar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/atencion-al-cliente (3).png"))); // NOI18N
        jLabel2.setText("Gestion de Citas");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistrarCts p1=new RegistrarCts();
        p1.setSize(680,420);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarCts p2=new ActualizarCts();
        p2.setSize(680,420);
        p2.setLocation(0, 0);
        content.removeAll();
        content.add(p2,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ConsultarCts p3=new ConsultarCts();
        p3.setSize(680,420);
        p3.setLocation(0, 0);
        content.removeAll();
        content.add(p3,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        EliminarCts p5=new EliminarCts();
        p5.setSize(680,420);
        p5.setLocation(0, 0);
        content.removeAll();
        content.add(p5,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
