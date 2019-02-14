package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.TablaColonia;
import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named
public class CatalogoAdministradoColoniaControlador extends PaginacionControlador<TablaModelo> {

    private TablaColonia tablaColonia;

    @PostConstruct
    public void init() {
        Collection<TablaColonia> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaColonia>) collection).add(new TablaColonia("72810", "Colonia" + i, "Margaritos","Pueblo",i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaColonia getTablaColonia() {
        return tablaColonia;
    }

    public void setTablaColonia(TablaColonia tablaColonia) {
        this.tablaColonia = tablaColonia;
    }
}
