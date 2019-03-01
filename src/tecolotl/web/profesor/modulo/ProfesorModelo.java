package tecolotl.web.profesor.modulo;

public class ProfesorModelo {
    private String nombre;
    private String apellido;
    private int edad;
    private String color;

    public ProfesorModelo(String nombre, String apellido, int edad, String color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.color = color;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
