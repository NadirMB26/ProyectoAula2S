
package packagemascotas;

import java.awt.Color;
import javax.swing.JLabel;

public class Mascotas {
    
    public packageclientes.Clientes cliente;
    
    int IDmascota;
    String nombreM;
    String color;
    String Tsangre;
    String Tvida;
    String especie;
    
    public Mascotas() {
        
    }
    
    public Mascotas(int IDmascota, String nombreM, String color, String Tsangre,String Tvida, String especie) {
        this.IDmascota = IDmascota;
        this.nombreM = nombreM;
        this.color = color;
        this.Tsangre = Tsangre;
        this.especie = especie;
    }

    public int getNdocument() {
        return getNdocument();
    }

    public void setNdocumento(int Ndocumento) {
    }
    
    public int getIDmascota() {
        return IDmascota;
    }
    
    public void setIDmascota(int IDmascota) {
        this.IDmascota = IDmascota;
    }

    public String getNombre() {
        return nombreM;
    }

    public void setNombre(String nombre) {
        this.nombreM = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTsangre() {
        return Tsangre;
    }

    public void setTsangre(String Tsangre) {
        this.Tsangre = Tsangre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "Ndocument=" + ", nombreM=" + nombreM + ", color=" + color + ", Tsangre=" + Tsangre + ", especie=" + especie + '}';
    }
  
    
}