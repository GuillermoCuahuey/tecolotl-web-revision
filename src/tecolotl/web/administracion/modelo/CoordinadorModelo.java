package tecolotl.web.administracion.modelo;

public class CoordinadorModelo {
   private String nickname;
   private String nombre;
   private String email;
    private boolean activo;
    private int licecias;

    public CoordinadorModelo(String nickname, String nombre, String email, boolean activo, int licecias) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
        this.licecias = licecias;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getLicecias() {
        return licecias;
    }

    public void setLicecias(int licecias) {
        this.licecias = licecias;
    }
}
