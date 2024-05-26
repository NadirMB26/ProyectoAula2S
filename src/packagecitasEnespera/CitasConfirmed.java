
package packagecitasEnespera;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class CitasConfirmed extends javax.swing.JPanel {
   DefaultTableModel modelo = new DefaultTableModel();
            int filas;
    private ImageIcon imagenFondo;
    List<String[]> citasList; 
    public CitasConfirmed() {
        initComponents();
        
        imagenFondo = new ImageIcon(getClass().getResource("/packagecitasEnespera/perror.jpg"));

        setOpaque(false);
        //refrescarLista();
        modelo.addColumn("N_Cita"); 
        modelo.addColumn("Cc_Cliente");
        modelo.addColumn("Mascota");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado de cita");
        txtDescripcion.setEditable(false);
        tablaCitasConf();
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
    
    public void tablaCitasConf() {
        try {
            citasList = citasConf("citasConf.csv"); 

            for (String[] data : citasList) {
                Object[] rowData = new Object[data.length];
                for (int i = 0; i < data.length; i++) {
                    String[] splitData = data[i].split("=");
                    if (splitData.length > 1) {
                        rowData[i] = splitData[1].trim();
                    } else {
                        rowData[i] = "";
                    }
                }
                modelo.addRow(rowData);
            }

            tblusuarios2.setModel(modelo);
        } catch (IOException ex) {
            
        }
    }
    
    private List<String[]> citasConf(String fileName) throws IOException {
        List<String[]> citasList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); 
                citasList.add(data);
            }
        }
        return citasList;
    }
    
    
    public void refrescarLista() {
        // Read data from citasConf.csv and update JLabels
        try (BufferedReader br = new BufferedReader(new FileReader("citasConf.csv"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Citas{") && linea.endsWith("}")) {
                    linea = linea.substring(6, linea.length() - 1); 

                    String[] datos = linea.split(","); 

                    for (String dato : datos) {
                        String[] keyValue = dato.split("=");

                        if (keyValue.length == 2) {
                            String key = keyValue[0].trim();
                            String value = keyValue[1].trim();
                    
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
                                    etiConfnum.setText(value);
                                    break;
                                case "Descrip":
                                    txtDescripcion.setText(value);
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
     
    private String getDescripcion(int selectedRow) {
    if (selectedRow >= 0 && selectedRow < citasList.size()) {
        String descriptionData = citasList.get(selectedRow)[7]; 
        if (descriptionData.contains("=")) {
            descriptionData = descriptionData.split("=")[1].trim();
            if (descriptionData.endsWith("}")) {
                descriptionData = descriptionData.substring(0, descriptionData.length() - 1);
            }
        }
        return descriptionData; 
    }
    return "";
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
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblusuarios2 = new javax.swing.JTable();

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

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        tblusuarios2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblusuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblusuarios2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblusuarios2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(etiEstateCONF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiConfnum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiCitauser)
                                .addGap(18, 18, 18)
                                .addComponent(etiCcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(etiIngDesc1)
                                            .addGap(76, 76, 76))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                            .addComponent(etiHfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(etiNameM1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiCita, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiConfnum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiEstateCONF)
                            .addComponent(etiCCliente)
                            .addComponent(etiCita, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiHsal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiHfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiNameM1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(etiIngDesc1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblusuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblusuarios2MouseClicked
        int selectedRow = tblusuarios2.getSelectedRow();
        if (selectedRow >= 0) {
            String description = getDescripcion(selectedRow);
            txtDescripcion.setText(description);
        }
        this.modelo = (DefaultTableModel) tblusuarios2.getModel();
        int seleccion = tblusuarios2.getSelectedRow();
        etiCita.setText(tblusuarios2.getValueAt(seleccion, 0).toString());
        etiCcliente.setText(tblusuarios2.getValueAt(seleccion, 1).toString());
        etiMascota.setText(tblusuarios2.getValueAt(seleccion, 2).toString());
        etiHent.setText(tblusuarios2.getValueAt(seleccion, 3).toString());
        etiHsal.setText(tblusuarios2.getValueAt(seleccion, 4).toString());
        etiFecha.setText(tblusuarios2.getValueAt(seleccion, 5).toString());
        etiConfnum.setText(tblusuarios2.getValueAt(seleccion, 6).toString());
        txtDescripcion.setText(tblusuarios2.getValueAt(seleccion, 7).toString());
        filas = seleccion;
    }//GEN-LAST:event_tblusuarios2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblusuarios2;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
