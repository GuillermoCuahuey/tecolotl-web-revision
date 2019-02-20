package tecolotl.web.administracion.modelo;

public class TablaValido {

    private String nick;
    private String nombre;
    private String apellidosm;
    private String apellidosp;
    private String cooreo;
    private String contraseña;
    private Integer id;

    public TablaValido() {
    }

    public TablaValido(String nick, String nombre, String apellidosm, String apellidosp, String cooreo, String contraseña, Integer id) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellidosm = apellidosm;
        this.apellidosp = apellidosp;
        this.cooreo = cooreo;
        this.contraseña = contraseña;
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidosm() {
        return apellidosm;
    }

    public void setApellidosm(String apellidosm) {
        this.apellidosm = apellidosm;
    }

    public String getApellidosp() {
        return apellidosp;
    }

    public void setApellidosp(String apellidosp) {
        this.apellidosp = apellidosp;
    }

    public String getCooreo() {
        return cooreo;
    }

    public void setCooreo(String cooreo) {
        this.cooreo = cooreo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
