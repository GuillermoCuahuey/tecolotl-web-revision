package tecolotl.web.profesor.controladores;

import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;
import tecolotl.web.profesor.modulo.TablaAlumnos;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

@RequestScoped
@Named

public class GrupoAlumnosControlador extends PaginacionControlador<TablaAlumnos> {

    private TablaAlumnos tablaAlumnos;

    @PostConstruct

    public void init() {

        int numero = (int) (Math.random() * 8) + 1;
        int numero0 = (int) (Math.random() * 5) + 1;
        int numero1= (int) (Math.random() * 3) + 1;
        int numero2 = (int) (Math.random() * 7) + 1;
        int numero3 = (int) (Math.random() * 6) + 1;
        Collection<TablaAlumnos> collection = new ArrayList<>();
        for (int i=0; i < 33; i++) {
            ((ArrayList<TablaAlumnos>) collection).add(new TablaAlumnos("Alumno" + i,"1","A2",numero,numero0,numero1,numero2,numero3,"9", i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaAlumnos getTablaAlumnos() {
        return tablaAlumnos;
    }

    public void setTablaAlumnos(TablaAlumnos tablaAlumnos) {
        this.tablaAlumnos = tablaAlumnos;
    }
}
