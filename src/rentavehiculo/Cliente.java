
package rentavehiculo;


public class Cliente {
  private String nombre;
  private String apellido;
  private int cedula;
  private int edad;
  private String telefono;
  private String dircontacto;
  private String categoria;
  private String tarcredito;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int cedula, int edad, String telefono, String dircontacto, String categoria, String tarcredito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.dircontacto = dircontacto;
        this.categoria = categoria;
        this.tarcredito = tarcredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDircontacto() {
        return dircontacto;
    }

    public void setDircontacto(String dircontacto) {
        this.dircontacto = dircontacto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTarcredito() {
        return tarcredito;
    }

    public void setTarcredito(String tarcredito) {
        this.tarcredito = tarcredito;
    }
  
    
}
