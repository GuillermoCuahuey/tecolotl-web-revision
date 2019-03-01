package tecolotl.web.profesor.modulo;


import java.util.ArrayList;
import java.util.List;

public class SalonModelo {
    private int grado;
    private String grupo;

    public SalonModelo(int grado, String grupo) {
        this.grado = grado;
        this.grupo = grupo;

    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
