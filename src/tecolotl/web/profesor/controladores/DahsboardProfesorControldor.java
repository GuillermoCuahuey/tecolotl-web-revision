package tecolotl.web.profesor.controladores;

import tecolotl.web.profesor.modulo.*;

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
    private List<ColorModelo> colorModelos;
    private List<GraficaModelo> graficaModelos;
    private List<DatosModelo> datosModelos;
    @PostConstruct
    public void init(){
        profesorModelos = new ArrayList<>();
        salonModelos = new ArrayList<>();
        colorModelos = new ArrayList<>();
        graficaModelos = new ArrayList<>();
        datosModelos = new ArrayList<>();

        for (int i = 0; i<4 ; i++){
            profesorModelos.add(new ProfesorModelo("Profesor".concat(String.valueOf(i)),"Apellido".concat(String.valueOf(i)),10,""));
        }
        for (int i = 0; i<4;i++){
            salonModelos.add(new SalonModelo(i+1, Character.getName(97 + i)));

        }

        graficaModelos.add(new GraficaModelo("A",1,"rgba(51,153,255,0.6)",8.5f,10.0f,9.3f,8.6f,7.8f));
        graficaModelos.add(new GraficaModelo("B",1,"rgba(36,113,163,0.6)",7.5f,9.0f,8.7f,7.7f,10.0f));
        graficaModelos.add(new GraficaModelo("C",1,"rgba(20,143,119,0.6)",9.5f,8.0f,2.3f,8.6f,9.8f));
        graficaModelos.add(new GraficaModelo("D",1,"rgba(183,149,11,0.6)",10.0f,9.0f,8.3f,9.6f,8.8f));

        colorModelos.add(new ColorModelo("rgba(51,153,255,0.6)"));
        colorModelos.add(new ColorModelo("rgba(36,113,163,0.6)"));
        colorModelos.add(new ColorModelo("rgba(20,143,119,0.6)"));
        colorModelos.add(new ColorModelo("rgba(183,149,11,0.6)"));




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


    public List<ColorModelo> getColorModelos() {
        return colorModelos;
    }

    public void setColorModelos(List<ColorModelo> colorModelos) {
        this.colorModelos = colorModelos;
    }

    public List<GraficaModelo> getGraficaModelos() {
        return graficaModelos;
    }

    public void setGraficaModelos(List<GraficaModelo> graficaModelos) {
        this.graficaModelos = graficaModelos;
    }


}
