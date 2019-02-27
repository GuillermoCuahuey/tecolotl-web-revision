package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named
public class CatalogoAdministradoBloqueControlador extends PaginacionControlador<TablaModelo> {

    private TablaModelo tablaModelo;

    @PostConstruct
public void init() {
    Collection<TablaModelo> collection = new ArrayList<>();
    for (int i=0; i < 33; i++) {
        ((ArrayList<TablaModelo>) collection).add(new TablaModelo("Motivo" + i, i));
    }
    getCollectionDataModel().setWrappedData(collection);
}

    public TablaModelo getTablaModelo() {
        return tablaModelo;
    }

    public void setTablaModelo(TablaModelo tablaModelo) {
        this.tablaModelo = tablaModelo;
    }
}
