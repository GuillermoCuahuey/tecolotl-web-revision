package tecolotl.web.administrador.controladores;

import tecolotl.web.administrador.modelo.EscuelaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
 import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class DashboardControlador extends PaginacionControlador<EscuelaModelo> {

    private List<EscuelaModelo> escuelaModeloLista;

    @PostConstruct
    public void init() {
        escuelaModeloLista = new ArrayList<>();
        for (int i=0; i < 30; i++) {
            escuelaModeloLista.add(new EscuelaModelo("cct" + i, "Nombre Escuela", i % 2 == 0, 3, 21));
        }
        getCollectionDataModel().setWrappedData(escuelaModeloLista);
    }

}
