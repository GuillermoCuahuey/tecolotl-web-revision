package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.TablaColonia;
import tecolotl.web.administracion.modelo.TablaDetallesProfesor;
import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named
public class DetalleProfesorGrupoControlador extends PaginacionControlador<TablaModelo> {

    private TablaDetallesProfesor tablaDetallesProfesor;

    @PostConstruct
    public void init() {
        Collection<TablaDetallesProfesor> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaDetallesProfesor>) collection).add(new TablaDetallesProfesor("Alumno"+i,"Luna","Bustillo", "20", "15",i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaDetallesProfesor getTablaDetallesProfesor() {
        return tablaDetallesProfesor;
    }

    public void setTablaDetallesProfesor(TablaDetallesProfesor tablaDetallesProfesor) {
        this.tablaDetallesProfesor = tablaDetallesProfesor;
    }
}
