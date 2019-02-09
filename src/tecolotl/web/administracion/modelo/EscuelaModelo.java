package tecolotl.web.administracion.modelo;

public class EscuelaModelo {

    private String cct;
    private String nombre;
    private boolean activo;
    private int licecias;
    private int diasRestantes;

    public EscuelaModelo(String cct, String nombre, boolean activo, int licecias, int diasRestantes) {
        this.cct = cct;
        this.nombre = nombre;
        this.activo = activo;
        this.licecias = licecias;
        this.diasRestantes = diasRestantes;
    }

    public String getCct() {
        return cct;
    }

    public void setCct(String cct) {
        this.cct = cct;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }
}
