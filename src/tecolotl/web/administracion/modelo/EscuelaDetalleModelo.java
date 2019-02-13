package tecolotl.web.administracion.modelo;

public class EscuelaDetalleModelo  {
    private String cct;
    private String nombre;
    private int licecias;
    private String codigo_postal;
    private String municipio;
    private String estado;
    private String calle;

    public EscuelaDetalleModelo(String cct, String nombre, int licecias, String codigo_postal, String municipio, String estado, String calle, String numero_exterior, String numero_interior, String bloqueo) {
        this.cct = cct;
        this.nombre = nombre;
        this.licecias = licecias;
        this.codigo_postal = codigo_postal;
        this.municipio = municipio;
        this.estado = estado;
        this.calle = calle;
        this.numero_exterior = numero_exterior;
        this.numero_interior = numero_interior;
        this.bloqueo = bloqueo;
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

    public int getLicecias() {
        return licecias;
    }

    public void setLicecias(int licecias) {
        this.licecias = licecias;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero_exterior() {
        return numero_exterior;
    }

    public void setNumero_exterior(String numero_exterior) {
        this.numero_exterior = numero_exterior;
    }

    public String getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(String numero_interior) {
        this.numero_interior = numero_interior;
    }

    public String getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(String bloqueo) {
        this.bloqueo = bloqueo;
    }

    private String numero_exterior;
    private String numero_interior;
    private String bloqueo;



}
