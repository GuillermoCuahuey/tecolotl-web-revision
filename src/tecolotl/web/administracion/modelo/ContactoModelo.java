package tecolotl.web.administracion.modelo;

public class ContactoModelo {
    private String nombre;
    private String tipo;
    private String telefono;

    public ContactoModelo(String nombre, String tipo, String telefono) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        telefono = telefono;
    }
}
