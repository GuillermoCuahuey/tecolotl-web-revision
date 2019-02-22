package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.GradoModelo;
import tecolotl.web.administracion.modelo.GrupoModelo;
import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequestScoped
@Named
public class DetallesProfesorGradoControlador extends PaginacionControlador<TablaModelo> {

    private TablaModelo tablaModelo;
    private List<GradoModelo> gradoModelos;
    private List<GrupoModelo> grupoModelos;



    @PostConstruct
    public void init() {
        tablaModelo = new TablaModelo();
        gradoModelos=new ArrayList<>();

        Collection<TablaModelo> collection = new ArrayList<>();

        getCollectionDataModel().setWrappedData(collection);
        for (int i=1; i <7; i++) {
            gradoModelos.add(new GradoModelo("Grado °"+i ,i));
        }

    }
    public List<GradoModelo> getGradoModelos() {
        return gradoModelos;
    }

    public void setGradoModelos(List<GradoModelo> gradoModelos) {
        this.gradoModelos = gradoModelos;
    }
}
