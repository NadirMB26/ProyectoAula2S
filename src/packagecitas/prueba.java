package packagecitas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class prueba extends javax.swing.JFrame {

    public prueba() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        String archivoTexto = "citas.csv"; // Ruta al archivo de texto

        try (BufferedReader br = new BufferedReader(new FileReader(archivoTexto))) {
            LocalTime horaEntradaNuevaCita = LocalTime.of(10, 20); // Ejemplo: 10:00 AM
            LocalTime horaSalidaNuevaCita = LocalTime.of(12, 30); // Ejemplo: 11:30 AM

            boolean superposicion = false;
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
//                JOptionPane.showMessageDialog(null, partes[3]);
//                JOptionPane.showMessageDialog(null, partes[4]);
                LocalTime horaEntradaExistente = LocalTime.parse(partes[3], DateTimeFormatter.ofPattern("hh:mm a"));
                LocalTime horaSalidaExistente = LocalTime.parse(partes[4], DateTimeFormatter.ofPattern("hh:mm a"));
                
//                LocalTime horaEntradaExistente = LocalTime.parse((partes[3].replace("PM", "").replace("AM", "")).trim());
//                LocalTime horaSalidaExistente = LocalTime.parse((partes[4].replace("PM", "").replace("AM", "")).trim());

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
                JOptionPane.showMessageDialog(null,"La nueva cita puede programarse sin superposición.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

 
    




    }
}

class Cita {

    private int numeroCita;
    private String cedulaCliente;
    private String nombreMascota;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private LocalDate fecha;

    public Cita(int numeroCita, String cedulaCliente, String nombreMascota,
            LocalTime horaEntrada, LocalTime horaSalida, LocalDate fecha) {
        this.numeroCita = numeroCita;
        this.cedulaCliente = cedulaCliente;
        this.nombreMascota = nombreMascota;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
