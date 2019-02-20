package tecolotl.web.administracion.modelo;

public class TablaProfesores {

    private String nombre;
    private String numgrupos;
    private String tareasasignadas;
    private String tareasporasignar;
    private Integer id;

    public TablaProfesores() {
    }

    public TablaProfesores(String nombre, String numgrupos, String tareasasignadas, String tareasporasignar, Integer id) {
        this.nombre = nombre;
        this.numgrupos = numgrupos;
        this.tareasasignadas = tareasasignadas;
        this.tareasporasignar = tareasporasignar;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumgrupos() {
        return numgrupos;
    }

    public void setNumgrupos(String numgrupos) {
        this.numgrupos = numgrupos;
    }

    public String getTareasasignadas() {
        return tareasasignadas;
    }

    public void setTareasasignadas(String tareasasignadas) {
        this.tareasasignadas = tareasasignadas;
    }

    public String getTareasporasignar() {
        return tareasporasignar;
    }

    public void setTareasporasignar(String tareasporasignar) {
        this.tareasporasignar = tareasporasignar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
