package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.administracion.modelo.TablaProfesores;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named
public class CatalogoAdministradoDetalleProfesorControlador extends PaginacionControlador<TablaModelo> {

    private TablaProfesores tablaProfesores;

    @PostConstruct
    public void init() {
        Collection<TablaProfesores> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaProfesores>) collection).add(new TablaProfesores("Mario Mauricio Bustillo Díaz" + i,"8"+i,"2" +i,"4"+i,i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaProfesores getTablaProfesores() {
        return tablaProfesores;
    }

    public void setTablaProfesores(TablaProfesores tablaProfesores) {
        this.tablaProfesores = tablaProfesores;
    }
}
