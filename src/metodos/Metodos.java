
package metodos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {

    public DefaultTableModel buscarMascotas(String buscar) {
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Cc.Cliente", "Mascota", "Color", "Tipo de sangre", "Especie", "Edad"});

        String archivoCSV = "mascotas.csv"; 
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
             String[] datos = linea.split(",");

             
               if (Stream.of(datos).anyMatch(dato -> dato.toLowerCase().contains(buscar.toLowerCase()))) {
                  modelo.addRow(datos);
                }
            }
       } catch (IOException e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error al leer el archivo CSV: " + e.getMessage());
        }

     return modelo;
    }
 
    public DefaultTableModel buscarClientes(String buscar) {
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Cedula", "Nombre", "Apellidos", "Direccion", "Correo", "Telefono"});

        String archivoCSV = "clientes.csv"; 
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
             String[] datos = linea.split(",");

             
               if (Stream.of(datos).anyMatch(dato -> dato.toLowerCase().contains(buscar.toLowerCase()))) {
                  modelo.addRow(datos);
                }
            }
       } catch (IOException e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error al leer el archivo CSV: " + e.getMessage());
        }

     return modelo;
    }
    
    public DefaultTableModel buscarCitas(String buscar) {
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"N_Cita","Cc_Cliente", "Mascota", "Entrada", "Salida", "Fecha"});

        String archivoCSV = "citas.csv"; 
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
             String[] datos = linea.split(",");

             
               if (Stream.of(datos).anyMatch(dato -> dato.toLowerCase().contains(buscar.toLowerCase()))) {
                  modelo.addRow(datos);
                }
            }
       } catch (IOException e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error al leer el archivo CSV: " + e.getMessage());
        }

     return modelo;
    }
    
    public DefaultTableModel buscarCitasConf(String buscar) {
    DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"N_Cita", "Cc_Cliente", "Mascota", "Entrada", "Salida", "Fecha","Estado de cita"});

    String archivoCSV = "citasConf.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");

            // Create a new row to hold processed values without labels and '='
            Object[] processedRow = new Object[datos.length];

            for (int i = 0; i < datos.length; i++) {
                String processedValue;
                if (datos[i].contains("=")) {
                    processedValue = datos[i].split("=")[1].trim();
                } else {
                    processedValue = datos[i].trim(); // Handle cases without '='
                }
                processedRow[i] = processedValue;
            }

            // Check if any processed value contains the search term
            if (Arrays.stream(processedRow).anyMatch(value -> value.toString().toLowerCase().contains(buscar.toLowerCase()))) {
                modelo.addRow(processedRow);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al leer el archivo CSV: " + e.getMessage());
    }

    return modelo;
}

  
}
