package tecolotl.web.profesor.controladores;

import tecolotl.web.profesor.modulo.ProfesorModelo;
import tecolotl.web.profesor.modulo.SalonModelo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class DahsboardProfesorControldor {
    private List<ProfesorModelo> profesorModelos;
    private List<SalonModelo> salonModelos;
    private List<String> color;

    @PostConstruct
    public void init(){
        profesorModelos = new ArrayList<>();
        salonModelos = new ArrayList<>();
        color = new ArrayList<>();
        for (int i = 0; i<4 ; i++){
            profesorModelos.add(new ProfesorModelo("Profesor".concat(String.valueOf(i)),"Apellido".concat(String.valueOf(i)),10,""));
        }
        for (int i = 0; i<4;i++){
            salonModelos.add(new SalonModelo(i+1, Character.getName(97 + i)));

        }
        color.add("rgba(51,153,255,0.6)");
        color.add("rgba(60, 186, 159,0.6)");
        color.add("rgba(137, 93, 246,0.6)");
        color.add("rgba(232, 195, 185,0.6)");

    }


    public List<ProfesorModelo> getProfesorModelos() {
        return profesorModelos;
    }

    public void setProfesorModelos(List<ProfesorModelo> profesorModelos) {
        this.profesorModelos = profesorModelos;
    }

    public List<SalonModelo> getSalonModelos() {
        return salonModelos;
    }

    public void setSalonModelos(List<SalonModelo> salonModelos) {
        this.salonModelos = salonModelos;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }
}
