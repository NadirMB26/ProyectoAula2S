
package packagecitasEnespera;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class CitasConfirmed extends javax.swing.JPanel {
    
    
    private ImageIcon imagenFondo;
    public CitasConfirmed() {
        initComponents();
        
        imagenFondo = new ImageIcon(getClass().getResource("/packagecitasEnespera/perror.jpg"));
        
        setOpaque(false);
        refrescarLista();
        Descripcion.setEditable(false);
        
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
    
    
    public void refrescarLista() {
        // Read data from citasConf.csv and update JLabels
        try (BufferedReader br = new BufferedReader(new FileReader("citasConf.csv"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Citas{")) { // Check if line starts with "Citas{"
                    linea = linea.substring(6, linea.length() - 1); // Extract data within curly braces

                    String[] datos = linea.split(","); // Split by comma (assuming comma-separated key-value pairs)

                    for (String dato : datos) {
                        String[] keyValue = dato.split("="); // Split each key-value pair by equal sign

                        if (keyValue.length == 2) {
                            String key = keyValue[0].trim(); // Extract and trim key
                            String value = keyValue[1].trim(); // Extract and trim value

                            // Update the corresponding JLabel based on the key
                            switch (key) {
                                case "IDcita":
                                    etiCita.setText(value);
                                    break;
                                case "CcCliente":
                                    etiCcliente.setText(value);
                                    break;
                                case "Mascota":
                                    etiMascota.setText(value);
                                    break;
                                case "Hentrada":
                                    etiHent.setText(value);
                                    break;
                                case "Hsalida":
                                    etiHsal.setText(value);
                                    break;
                                case "Fecha":
                                    etiFecha.setText(value);
                                    break;
                                case "ConfCita":
                                    etiConfnum.setText(value); // Assuming ConfCita refers to confirmation number
                                    break;
                                case "Descrip":
                                    Descripcion.setText(value);
                                    break;
                                default:
                                    // Handle unknown keys (optional)
                                    System.out.println("Clave desconocida: " + key);
                                    break;
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etiEstateCONF = new javax.swing.JLabel();
        etiConfnum = new javax.swing.JLabel();
        etiCCliente = new javax.swing.JLabel();
        etiCita = new javax.swing.JLabel();
        etiCitauser = new javax.swing.JLabel();
        etiDiaCita1 = new javax.swing.JLabel();
        etiHinicio1 = new javax.swing.JLabel();
        etiHfinal1 = new javax.swing.JLabel();
        etiCcliente = new javax.swing.JLabel();
        etiFecha = new javax.swing.JLabel();
        etiHent = new javax.swing.JLabel();
        etiHsal = new javax.swing.JLabel();
        etiNameM1 = new javax.swing.JLabel();
        etiMascota = new javax.swing.JLabel();
        etiIngDesc1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/lista.png"))); // NOI18N
        jLabel1.setText("Listado Citas");

        etiEstateCONF.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiEstateCONF.setText("Estado de la cita");

        etiCCliente.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiCCliente.setText("No de cita");

        etiCitauser.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiCitauser.setText("Cita asignada a el usuario");

        etiDiaCita1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiDiaCita1.setText("Fecha de la cita");

        etiHinicio1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiHinicio1.setText("Hora de entrada");

        etiHfinal1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiHfinal1.setText("Hora de salida");

        etiNameM1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiNameM1.setText("Mascota");

        etiIngDesc1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        etiIngDesc1.setText("Descripcion de la cita");

        Descripcion.setColumns(20);
        Descripcion.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        Descripcion.setRows(5);
        jScrollPane3.setViewportView(Descripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(etiIngDesc1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiEstateCONF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiCitauser)
                                        .addGap(18, 18, 18)
                                        .addComponent(etiCcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiDiaCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(etiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiHinicio1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(etiHent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(etiHfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(etiNameM1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(etiMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiConfnum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiCita, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiConfnum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiEstateCONF)
                            .addComponent(etiCCliente)
                            .addComponent(etiCita, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiCcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiCitauser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiDiaCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiHinicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiHent, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etiHfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiNameM1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiIngDesc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel etiCCliente;
    private javax.swing.JLabel etiCcliente;
    private javax.swing.JLabel etiCita;
    private javax.swing.JLabel etiCitauser;
    private javax.swing.JLabel etiConfnum;
    private javax.swing.JLabel etiDiaCita1;
    private javax.swing.JLabel etiEstateCONF;
    private javax.swing.JLabel etiFecha;
    private javax.swing.JLabel etiHent;
    private javax.swing.JLabel etiHfinal1;
    private javax.swing.JLabel etiHinicio1;
    private javax.swing.JLabel etiHsal;
    private javax.swing.JLabel etiIngDesc1;
    private javax.swing.JLabel etiMascota;
    private javax.swing.JLabel etiNameM1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
