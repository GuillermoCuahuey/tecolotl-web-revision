package tecolotl.web.administracion.modelo;

public class GradoModelo {
    private String grado;
    private Integer id;

    public GradoModelo(String grado, Integer id) {
        this.grado = grado;
        this.id = id;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
