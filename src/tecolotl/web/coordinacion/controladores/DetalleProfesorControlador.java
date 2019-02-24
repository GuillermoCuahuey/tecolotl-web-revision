package tecolotl.web.coordinacion.controladores;

import tecolotl.web.controlador.PaginacionControlador;
import tecolotl.web.coordinacion.modulo.PeriodoModelo;
import tecolotl.web.coordinacion.modulo.ProfesorModelo;
import tecolotl.web.coordinacion.modulo.SalonModelo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class DetalleProfesorControlador extends PaginacionControlador<SalonModelo> {
private ProfesorModelo profesorModelo;
private List<SalonModelo> salonModelos;
private List<PeriodoModelo> periodoModelos;

    @PostConstruct
    public void init(){
        profesorModelo = new ProfesorModelo("Jose","Folomeno","Paez","filomeno@correo.com","el fili");
        salonModelos = new ArrayList<>();
        periodoModelos = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            salonModelos.add(new SalonModelo(i+1,"grupo".concat(String.valueOf(i+1))));
        }
        periodoModelos.add(new PeriodoModelo(1,"Dia"));
        periodoModelos.add(new PeriodoModelo(2,"Semana"));
        periodoModelos.add(new PeriodoModelo(3,"Mes"));
        periodoModelos.add(new PeriodoModelo(4,"Semestre"));
        periodoModelos.add(new PeriodoModelo(5,"Todos"));

        getCollectionDataModel().setWrappedData(salonModelos);

    }

    public ProfesorModelo getProfesorModelo() {
        return profesorModelo;
    }

    public void setProfesorModelo(ProfesorModelo profesorModelo) {
        this.profesorModelo = profesorModelo;
    }

    public List<SalonModelo> getSalonModelos() {
        return salonModelos;
    }

    public void setSalonModelos(List<SalonModelo> salonModelos) {
        this.salonModelos = salonModelos;
    }

    public List<PeriodoModelo> getPeriodoModelos() {
        return periodoModelos;
    }

    public void setPeriodoModelos(List<PeriodoModelo> periodoModelos) {
        this.periodoModelos = periodoModelos;
    }
}
