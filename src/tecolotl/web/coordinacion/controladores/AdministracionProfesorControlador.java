package tecolotl.web.coordinacion.controladores;

import tecolotl.web.controlador.PaginacionControlador;
import tecolotl.web.coordinacion.modulo.ProfesorModelo;
import tecolotl.web.coordinacion.modulo.SalonModelo;
import tecolotl.web.coordinacion.modulo.TareaModelo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class AdministracionProfesorControlador extends PaginacionControlador<ProfesorModelo> {
    private List<ProfesorModelo> profesorModeloList;
    private List<SalonModelo> salonModeloList;
    private TareaModelo tareaModelo;

    @PostConstruct
    public void init(){
        profesorModeloList = new ArrayList<>();
        salonModeloList = new ArrayList<>();
        tareaModelo = new TareaModelo(1,"tarea",2,6);
        for (int i = 0; i < 20; i++){
            profesorModeloList.add(new ProfesorModelo("Jose Juan","Martinez","Florez","correo@correo.com","jose" ) );
        }
        for (int i = 0; i < 5; i++){
            salonModeloList.add(new SalonModelo(i,"grupo".concat(String.valueOf(i))));
        }

        getCollectionDataModel().setWrappedData(profesorModeloList);

    }

    public List<ProfesorModelo> getProfesorModeloList() {
        return profesorModeloList;
    }

    public void setProfesorModeloList(List<ProfesorModelo> profesorModeloList) {
        this.profesorModeloList = profesorModeloList;
    }

    public List<SalonModelo> getSalonModeloList() {
        return salonModeloList;
    }

    public void setSalonModeloList(List<SalonModelo> salonModeloList) {
        this.salonModeloList = salonModeloList;
    }

    public TareaModelo getTareaModelo() {
        return tareaModelo;
    }

    public void setTareaModelo(TareaModelo tareaModelo) {
        this.tareaModelo = tareaModelo;
    }
}
