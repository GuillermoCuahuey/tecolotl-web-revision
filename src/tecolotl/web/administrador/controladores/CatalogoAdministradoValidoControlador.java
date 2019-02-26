package tecolotl.web.administrador.controladores;

import tecolotl.web.administrador.modelo.TablaModelo;
import tecolotl.web.administrador.modelo.TablaValido;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named
public class CatalogoAdministradoValidoControlador extends PaginacionControlador<TablaModelo> {

    private TablaValido tablaValido;

    @PostConstruct
    public void init() {
        Collection<TablaValido> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaValido>) collection).add(new TablaValido("Profe", "Juan" + i, "Luna","Luna","luna@escuadon.com.mx","psw",i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaValido getTablaValido() {
        return tablaValido;
    }

    public void setTablaValido(TablaValido tablaValido) {
        this.tablaValido = tablaValido;
    }
}
