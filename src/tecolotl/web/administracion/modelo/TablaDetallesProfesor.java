package tecolotl.web.administracion.modelo;

public class TablaDetallesProfesor {

    private String nombre;
    private String apellidop;
    private String apellidom;
    private String tareas;
    private String tareas_revisar;
    private Integer id;

    public TablaDetallesProfesor() {
    }

    public TablaDetallesProfesor(String nombre, String apellidop, String apellidom, String tareas, String tareas_revisar, Integer id) {
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.tareas = tareas;
        this.tareas_revisar = tareas_revisar;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public String getTareas_revisar() {
        return tareas_revisar;
    }

    public void setTareas_revisar(String tareas_revisar) {
        this.tareas_revisar = tareas_revisar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
