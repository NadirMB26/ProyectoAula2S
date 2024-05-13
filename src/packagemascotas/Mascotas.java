
package packagemascotas;

import java.awt.Color;
import javax.swing.JLabel;
import packageclientes.Clientes;

public class Mascotas {
    
    Clientes cliente;
    
    int Ndocument;
    int IDmascota;
    String nombreM;
    String color;
    String Tsangre;
    String Tvida;
    String especie;
    
    public Mascotas() {
        
    }
    
    public Mascotas(int Ndocument, int IDmascota, String nombreM, String color, String Tsangre,Object Tvida, Object especie) {
        this.IDmascota = IDmascota;
        this.nombreM = nombreM;
        this.color = color;
        this.Tsangre = Tsangre;
        this.especie = (String) especie;
        this.Tvida = (String) Tvida;
    }
    


    public int getNdocument() {
        return Ndocument;
    }

    public void setNdocumento(int Ndocumento) {
        this.Ndocument = Ndocument;
    }
    
    public int getIDmascota() {
        return IDmascota;
    }
    
    public void setIDmascota(int IDmascota) {
        this.IDmascota = IDmascota;
    }

    public String getnombreM() {
        return nombreM;
    }

    public void setnombreM(String nombreM) {
        this.nombreM = nombreM;
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
    
    public String getTvida() {
        return Tvida;
    }
    
    public void setTvida(String Tvida) {
        this.Tvida = Tvida;
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