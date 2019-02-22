package tecolotl.web.administracion.modelo;

public class GrupoModelo {
    private String grupo;
    private Integer id;
    public GrupoModelo(String grupo, Integer id) {
        this.grupo = grupo;
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
