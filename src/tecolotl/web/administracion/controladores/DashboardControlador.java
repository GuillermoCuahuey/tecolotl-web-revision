package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.EscuelaModelo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.faces.component.html.HtmlDataTable;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class DashboardControlador {

    private List<EscuelaModelo> escuelaModeloLista;
    private HtmlDataTable htmlDataTable;

    @PostConstruct
    public void init() {
        escuelaModeloLista = new ArrayList<>();
        for (int i=0; i < 30; i++) {
            escuelaModeloLista.add(new EscuelaModelo("wqweqweqe", "Benito Juarex", true, 3, 21));
        }
    }

    public List<EscuelaModelo> getEscuelaModeloLista() {
        return escuelaModeloLista;
    }

    public void setEscuelaModeloLista(List<EscuelaModelo> escuelaModeloLista) {
        this.escuelaModeloLista = escuelaModeloLista;
    }

    public HtmlDataTable getHtmlDataTable() {
        return htmlDataTable;
    }

    public void setHtmlDataTable(HtmlDataTable htmlDataTable) {
        this.htmlDataTable = htmlDataTable;
    }
}
