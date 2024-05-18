
package packagecitas;

public class Citas {
    
    public packageclientes.Clientes cliente;
    
    String IDcita;
    String CcCliente;
    String Mascota;
    String Hentrada;
    String Hsalida;
    String Fecha;
    String ConfCita;
    String Descrip;
    public Citas() {
        
    }
    
    public Citas(String IDcita, String CcCliente, String Mascota, String Hentrada, String Hsalida, String Fecha) {
        this.IDcita = IDcita;
        this.CcCliente = CcCliente;
        this.Mascota = Mascota;
        this.Hentrada = Hentrada;
        this.Hsalida = Hsalida;
        this.Fecha=Fecha;
        this.CcCliente=CcCliente;
        this.ConfCita="0";
        this.Descrip="";
    }

    public Citas(int idCita, String ccCliente, String mascota, String hEntrada, String hSalida, String fecha, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getIDcita() {
        return IDcita;
    }
    
    public void setIDcita(String IDcita) {
        this.IDcita = IDcita;
    }

    public String getCcCliente() {
        return CcCliente;
    }

    public void setCcCliente(String CcCLiente) {
        this.CcCliente = CcCliente;
    }

    public String getMascota() {
        return Mascota;
    }

    public void setMascota(String Mascota) {
        this.Mascota = Mascota;
    }

    public String getHentrada() {
        return Hentrada;
    }

    public void setTHentrada(String Hentrada) {
        this.Hentrada= Hentrada;
    }

    public String getHsalida() {
        return Hsalida;
    }

    public void setHsalida(String Hsalida) {
        this.Hsalida = Hsalida;
    }
     public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public String getConfCita() {
        return ConfCita;
    }

    public void setConfCita(String ConfCita) {
        this.ConfCita = ConfCita;
    }
    
    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    @Override
    public String toString() {
        return "Citas{" + "IDcita="+IDcita + ",CcCliente=" + CcCliente + ",Mascota=" +Mascota + ", Hentrada=" + Hentrada+ ",Hsalida=" + Hsalida + ", Fecha=" +Fecha+ ",ConfCita=" +ConfCita+",Descrip=" + Descrip +  '}';
    }
  
    
}