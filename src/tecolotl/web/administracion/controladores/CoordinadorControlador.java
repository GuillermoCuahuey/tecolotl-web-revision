package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.CoordinadorModelo;
import tecolotl.web.administracion.modelo.LicenciasModelo;
import tecolotl.web.administracion.modelo.MotivoBloqueoModelo;
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
    private List<LicenciasModelo> licenciasModeloLista;
    private List<MotivoBloqueoModelo> motivoBloqueoModelos;
    private MotivoBloqueoModelo motivoBloqueoModelo;
    private LicenciasModelo licenciasModelo;
    @PostConstruct
    public void init() {
        coordinadorModelos = new ArrayList<>();
        licenciasModeloLista = new ArrayList<>();
        motivoBloqueoModelos = new ArrayList<>();
        licenciasModelo = new LicenciasModelo(15681,"21DBA0004C",25);
        motivoBloqueoModelo = new MotivoBloqueoModelo(12,"default");
        for (int i = 0; i < 33; i++) {
            coordinadorModelos.add(new CoordinadorModelo("Mr.Martin","Jaime Martinez Sanchez","correo@gmail.com",i % 2 == 0,2));
        }
        for (int i = 0; i< 5; i++){
            licenciasModeloLista.add(new LicenciasModelo(i,"licencia".concat(String.valueOf(i)),25));
        }
        for (int i = 0; i<5; i++){
            motivoBloqueoModelos.add(new MotivoBloqueoModelo(i+1,"bloqueo".concat(String.valueOf(i))));
        }

        getCollectionDataModel().setWrappedData(coordinadorModelos);
    }

    public MotivoBloqueoModelo getMotivoBloqueoModelo() {
        return motivoBloqueoModelo;
    }

    public void setMotivoBloqueoModelo(MotivoBloqueoModelo motivoBloqueoModelo) {
        this.motivoBloqueoModelo = motivoBloqueoModelo;
    }

    public List<MotivoBloqueoModelo> getMotivoBloqueoModelos() {
        return motivoBloqueoModelos;
    }

    public void setMotivoBloqueoModelos(List<MotivoBloqueoModelo> motivoBloqueoModelos) {
        this.motivoBloqueoModelos = motivoBloqueoModelos;
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

    public List<LicenciasModelo> getLicenciasModeloLista() {
        return licenciasModeloLista;
    }

    public void setLicenciasModeloLista(List<LicenciasModelo> licenciasModeloLista) {
        this.licenciasModeloLista = licenciasModeloLista;
    }
}




