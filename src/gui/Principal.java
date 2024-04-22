
package gui;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGC = new javax.swing.JButton();
        btnGM = new javax.swing.JButton();
        btnGTC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("HISTORIAS CLINICAS Y CITAS (MASCOTAS)");

        btnGC.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/atencion-al-cliente (2).png"))); // NOI18N
        btnGC.setText("Gestion Cliente");

        btnGM.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/mascotas.png"))); // NOI18N
        btnGM.setText("Gestion Mascota");

        btnGTC.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnGTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/cronograma.png"))); // NOI18N
        btnGTC.setText(" Gestion Citas");

        btnCE.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/calendario.png"))); // NOI18N
        btnCE.setText("Citas en Espera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGC, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnGTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGTC, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
