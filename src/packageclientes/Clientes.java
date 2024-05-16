
package packageclientes;

import java.util.ArrayList;


public class Clientes {
    String ndocumento; 
    String apellido;
    String nombre;
    String direccion;
    String correo;
    String telefono;
    
      public Clientes() {
    }

    public Clientes(String ndocumento, String apellido, String nombre, String direccion, String correo, String telefono) {
        this.ndocumento = ndocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNdocumento() {
        return ndocumento;
    }

    public void setNdocumento(String ndocumento) {
        this.ndocumento = ndocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "ndocumento=" + ndocumento + ", apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    


 
    
    
    

  
    
    
}
