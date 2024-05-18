
package packagemascotas;


public class Mascotas {
 
    String Ndocument;
    String nombreM;
    String color;
    String Tsangre;
    String Tvida;
    String especie;
    
    public Mascotas() {
        
    }
    
    public Mascotas(String Ndocument, String nombreM, String color, String Tsangre,String Tvida, String especie) {
        this.Ndocument = Ndocument;
        this.nombreM = nombreM;
        this.color = color;
        this.Tsangre = Tsangre;
        this.Tvida =  Tvida;
        this.especie = especie;
        
    }
    


    public String getNdocument() {
        return Ndocument;
    }

    public void setNdocumento(String Ndocumento) {
        this.Ndocument = Ndocument;
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
        return "Mascotas{" + "Ndocument="+Ndocument + ", nombreM=" + nombreM + ", color=" + color + ", Tsangre=" + Tsangre + ", especie=" + especie + '}';
    }
  
    
}