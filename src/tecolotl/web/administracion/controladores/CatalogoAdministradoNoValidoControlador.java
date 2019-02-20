package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.administracion.modelo.TablaNoValido;
import tecolotl.web.administracion.modelo.TablaValido;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named
public class CatalogoAdministradoNoValidoControlador extends PaginacionControlador<TablaModelo> {

    private TablaNoValido tablaNoValido;

    @PostConstruct
    public void init() {
        Collection<TablaNoValido> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaNoValido>) collection).add(new TablaNoValido("Profe", "Juan" + i, "Luna","Luna","luna@escuadon.com.mx","psw",i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaNoValido getTablaNoValido() {
        return tablaNoValido;
    }

    public void setTablaNoValido(TablaNoValido tablaNoValido) {
        this.tablaNoValido = tablaNoValido;
    }
}
