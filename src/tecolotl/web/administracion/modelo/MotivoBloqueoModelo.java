package tecolotl.web.administracion.modelo;

public class MotivoBloqueoModelo {
    private int id;
    private  String motivoBloque;

    public MotivoBloqueoModelo(int id, String motivoBloque) {
        this.id = id;
        this.motivoBloque = motivoBloque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivoBloque() {
        return motivoBloque;
    }

    public void setMotivoBloque(String motivoBloque) {
        this.motivoBloque = motivoBloque;
    }
}
