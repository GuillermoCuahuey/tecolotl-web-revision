package tecolotl.web.administracion.modelo;

public class TablaColonia {

    private String codigopostal;
    private String nombre;
    private String municipio;
    private String estado;
    private Integer id;

    public TablaColonia() {
    }

    public TablaColonia(String codigopostal, String nombre, String municipio, String estado, Integer id) {
        this.codigopostal = codigopostal;
        this.nombre = nombre;
        this.municipio = municipio;
        this.estado = estado;
        this.id = id;
    }


    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
