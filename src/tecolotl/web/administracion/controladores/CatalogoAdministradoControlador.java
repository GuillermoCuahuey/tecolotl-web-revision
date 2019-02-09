package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named
public class CatalogoAdministradoControlador extends PaginacionControlador<TablaModelo> {

    @PostConstruct
    public void init() {
        Collection<TablaModelo> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaModelo>) collection).add(new TablaModelo("nombre", i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

}
