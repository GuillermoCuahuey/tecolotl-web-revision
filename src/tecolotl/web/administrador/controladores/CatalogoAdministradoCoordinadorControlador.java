package tecolotl.web.administrador.controladores;

import tecolotl.web.administrador.modelo.GradoModelo;
import tecolotl.web.administrador.modelo.GrupoModelo;
import tecolotl.web.administrador.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequestScoped
@Named
public class CatalogoAdministradoCoordinadorControlador extends PaginacionControlador<TablaModelo> {

    private TablaModelo tablaModelo;
    private List<GradoModelo> gradoModelos;
    private List<GrupoModelo> grupoModelos;



    @PostConstruct
    public void init() {
        tablaModelo = new TablaModelo();
        gradoModelos=new ArrayList<>();
        grupoModelos=new ArrayList<>();
        char [] s = new char[7];
        s[1]='A';
        s[2]='B';
        s[3]='C';
        s[4]='D';
        s[5]='E';
        s[6]='F';
        Collection<TablaModelo> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaModelo>) collection).add(new TablaModelo("nombre"+ i, i));
        }
        getCollectionDataModel().setWrappedData(collection);
        for (int i=1; i <7; i++) {
            gradoModelos.add(new GradoModelo("Grado °"+i ,i));
        }
        for (int i=1; i < 7; i++) {
            gradoModelos.add(new GradoModelo("Grupo "+ s[i],i));
        }
    }

    public List<GrupoModelo> getGrupoModelos() {
        return grupoModelos;
    }

    public void setGrupoModelos(List<GrupoModelo> grupoModelos) {
        this.grupoModelos = grupoModelos;
    }

    public TablaModelo getTablaModelo() {
        return tablaModelo;
    }

    public void setTablaModelo(TablaModelo tablaModelo) {
        this.tablaModelo = tablaModelo;
    }
    public List<GradoModelo> getGradoModelos() {
        return gradoModelos;
    }

    public void setGradoModelos(List<GradoModelo> gradoModelos) {
        this.gradoModelos = gradoModelos;
    }
}
