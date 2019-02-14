package tecolotl.web.administracion.modelo;

public class LicenciasModelo {
    private int id;
    private String cct;
    private int diasRestantes;

    public LicenciasModelo(int id, String cct, int diasRestantes) {
        this.id = id;
        this.cct = cct;
        this.diasRestantes = diasRestantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCct() {
        return cct;
    }

    public void setCct(String cct) {
        this.cct = cct;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }
}
