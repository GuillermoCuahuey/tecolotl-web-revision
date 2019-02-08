package tecolotl.web.controlador;

import tecolotl.web.modelo.ProfesorModelo;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import java.util.ArrayList;
import java.util.List;

@Model
public class HolaControlador {

    private List<ProfesorModelo> profesorLista;

    @PostConstruct
    public void init() {
        profesorLista = new ArrayList<>();
        for (int i = 0; i <20; i++) {
            profesorLista.add(new ProfesorModelo("profe", "Jose Luis", "apellido"));
        }
    }

    public List<ProfesorModelo> getProfesorLista() {
        return profesorLista;
    }

    public void setProfesorLista(List<ProfesorModelo> profesorLista) {
        this.profesorLista = profesorLista;
    }
}
