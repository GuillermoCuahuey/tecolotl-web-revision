package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.GradoModelo;
import tecolotl.web.administracion.modelo.GrupoModelo;
import tecolotl.web.administracion.modelo.TablaModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class DetallesProfesorGrupoControlador extends PaginacionControlador<TablaModelo> {

    private List<GrupoModelo> grupoModelos;

    @PostConstruct
    public void init() {
        grupoModelos=new ArrayList<>();
        char [] s = new char[7];
        s[1]='A';
        s[2]='B';
        s[3]='C';
        s[4]='D';
        s[5]='E';
        s[6]='F';

        for (int i=1; i < 7; i++) {

            grupoModelos.add(new GrupoModelo("Grupo "+ s[i],i));
        }
    }

    public List<GrupoModelo> getGrupoModelos() {
        return grupoModelos;
    }

    public void setGrupoModelos(List<GrupoModelo> grupoModelos) {
        this.grupoModelos = grupoModelos;
    }


}
