package tecolotl.web.coordinacion.modulo;

public class PeriodoModelo {
    private int id;
    private String periodo;

    public PeriodoModelo(int id, String periodo) {
        this.id = id;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
