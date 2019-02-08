package tecolotl.web.modelo;

public class ProfesorModelo {

    private String nickName;
    private String nombre;
    private String apellido;

    public ProfesorModelo(String nickName, String nombre, String apellido) {
        this.nickName = nickName;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
}
