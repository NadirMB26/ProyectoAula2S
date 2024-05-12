
package packageclientes;


public class Clientes {
    int ndocumento; 
    String apellido;
    String nombre;
    String direccion;
    String correo;
    int telefono;
    
      public Clientes() {
    }

    public Clientes(int ndocumento, String apellido, String nombre, String direccion, String correo, int telefono) {
        this.ndocumento = ndocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getNdocumento() {
        return ndocumento;
    }

    public void setNdocumento(int ndocumento) {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "ndocumento=" + ndocumento + ", apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    
}
