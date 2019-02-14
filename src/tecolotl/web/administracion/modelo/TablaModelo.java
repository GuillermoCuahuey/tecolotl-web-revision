package tecolotl.web.administracion.modelo;

public class TablaModelo {

    private String nombre;
    private Integer id;

    public TablaModelo() {
    }

    public TablaModelo(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
