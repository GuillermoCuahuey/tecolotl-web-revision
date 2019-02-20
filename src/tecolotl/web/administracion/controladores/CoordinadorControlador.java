package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.CoordinadorModelo;
import tecolotl.web.administracion.modelo.LicenciasModelo;
import tecolotl.web.controlador.PaginacionControlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@RequestScoped
@Named
public class CoordinadorControlador extends PaginacionControlador<CoordinadorModelo> {
    private List<CoordinadorModelo> coordinadorModelos;
    private LicenciasModelo licenciasModelo;

    @PostConstruct
    public void init() {
        coordinadorModelos = new ArrayList<>();
        licenciasModelo = new LicenciasModelo(15681,"21DBA0004C",25);
        for (int i = 0; i < 33; i++) {
            coordinadorModelos.add(new CoordinadorModelo("Mr.Martin","Jaime Martinez Sanchez","correo@gmail.com",i % 2 == 0,2));
        }
        getCollectionDataModel().setWrappedData(coordinadorModelos);
    }

    public List<CoordinadorModelo> getCoordinadorModelos() {
        return coordinadorModelos;
    }

    public void setCoordinadorModelos(List<CoordinadorModelo> coordinadorModelos) {
        this.coordinadorModelos = coordinadorModelos;
    }

    public LicenciasModelo getLicenciasModelo() {
        return licenciasModelo;
    }

    public void setLicenciasModelo(LicenciasModelo licenciasModelo) {
        this.licenciasModelo = licenciasModelo;
    }
}




