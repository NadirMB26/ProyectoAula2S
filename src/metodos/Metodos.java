
package metodos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import packageclientes.Clientes;
import packagemascotas.Mascotas;
import packagemascotas.RegistrarMsc;
public class Metodos {
    Mascotas mascota = new Mascotas();
    Clientes cliente = new Clientes();
    Vector MscPrinc= new Vector();
    
    public void guardarMsc(Mascotas unaMasc){
        MscPrinc.addElement(unaMasc);
    }
    
    public DefaultTableModel ListMasc(){
        Vector pets = new Vector();
        pets.addElement("CCliente");
        pets.addElement("IDmasc");
        pets.addElement("M nombre");  
        pets.addElement("Color");
        pets.addElement("Tsangre");             
        pets.addElement("T vida");
        pets.addElement("Especie");
        
        DefaultTableModel Mascots = new DefaultTableModel(pets,0);
        
        try{
            FileReader read = new FileReader("mascotas.txt");
            BufferedReader br = new BufferedReader(read);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer (d,"|");
                Vector X =new Vector();
                while(dato.hasMoreTokens()){
                    X.addElement(dato.nextToken());
                }
                Mascots.addRow(X);
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null,error);
        }           
        return Mascots;
    }
    
    public ArrayList<Mascotas> buscarMascotas(String CCliente, String archivoMascotas) throws IOException {
        ArrayList<Mascotas> mascotasEncontradas = new ArrayList<>();
        try (
            BufferedReader br = new BufferedReader(new FileReader(archivoMascotas="mascotas.txt"))) {
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("|");
                
                
                //String idCliente = datos[0];
                mascota.setNdocumento(Integer.parseInt(datos[0]));
                
                if  (datos[0].equals(CCliente)) {
                    Mascotas mascota = new Mascotas();
                    mascota.setIDmascota(Integer.parseInt(datos[1]));
                    mascota.setnombreM(datos[2]);
                    mascota.setColor(datos[3]);
                    mascota.setTsangre(datos[4]);
                    mascota.setTvida(datos[5]);
                    mascota.setEspecie(datos[6]);
                    mascotasEncontradas.add(mascota);
                }
            }
            
            
        }catch(Exception e) {
           JOptionPane.showMessageDialog(null, e); 
        }
        return mascotasEncontradas;
    }

}
