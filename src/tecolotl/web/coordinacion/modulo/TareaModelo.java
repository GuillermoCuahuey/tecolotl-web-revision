package tecolotl.web.coordinacion.modulo;

public class TareaModelo {
    private int id;
    private String nombre;
    private int asiganada;
    private int sinAsingar;

    public TareaModelo(int id, String nombre, int asiganada, int sinAsingar) {
        this.id = id;
        this.nombre = nombre;
        this.asiganada = asiganada;
        this.sinAsingar = sinAsingar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsiganada() {
        return asiganada;
    }

    public void setAsiganada(int asiganada) {
        this.asiganada = asiganada;
    }

    public int getSinAsingar() {
        return sinAsingar;
    }

    public void setSinAsingar(int sinAsingar) {
        this.sinAsingar = sinAsingar;
    }
}


