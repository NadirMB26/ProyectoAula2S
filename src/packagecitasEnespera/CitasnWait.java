
package packagecitasEnespera;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class CitasnWait extends javax.swing.JPanel {
    
    
//    private ImageIcon imagenFondo;
//
//    public MiPanel(String rutaImagen) {
//        super();
//        this.imagenFondo = new ImageIcon(rutaImagen);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        if (imagenFondo != null) {
//            Dimension dimensiones = getSize();
//            Graphics2D g2d = (Graphics2D) g;
//            g2d.drawImage(imagenFondo.getImage(), 0, 0, dimensiones.width, dimensiones.height, null);
//        }
//    }
//}
    private ImageIcon imagenFondo;
    public CitasnWait() {
        initComponents();
//        this.setSize(300, 400); //se selecciona el tamaño del panel
        
        imagenFondo = new ImageIcon(getClass().getResource("/packagecitasEnespera/HojaDEBlock.jpg"));
        
        setOpaque(false);
        refrescarLista();

        
        //tblMascotas.setModel();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (imagenFondo != null) {
            Dimension dimensiones = getSize();
            Graphics2D g2d = (Graphics2D) g;

            // Dibuja la imagen de fondo para que cubra todo el panel
            g2d.drawImage(imagenFondo.getImage(), 0, 0, dimensiones.width, dimensiones.height, null);
        }
    }
    
     public void refrescarLista(){
 
    }
     
//    public void paint(Graphics grafico) {
//        Dimension height = getSize();
//        ImageIcon Img = new ImageIcon(getClass().getResource("/Images/Diagrama.png"));
//        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
//        setOpaque(false);
//        super.paintComponent(grafico);
//    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/lista.png"))); // NOI18N
        jLabel1.setText("Listado Citas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
