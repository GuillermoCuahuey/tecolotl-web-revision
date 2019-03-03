package tecolotl.web.administracion.controladores;

import tecolotl.web.administracion.modelo.*;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class DetalleEscuelaControlador  {
    private EscuelaDetalleModelo escuelaDetalleModelos;
    private List<ContactoModelo> contactoModelo;
    private List<LicenciasModelo> licenciasModelo;
    private List<TipoContactoModelo> tipoContactoModelos;
    @PostConstruct
    public void init() {
            escuelaDetalleModelos = new EscuelaDetalleModelo("21DBA0004C", "Escuela de algun lugar",3,"72758","Puebla","Puebla","calle siempre viva",54,0,"activo","margarita");
            contactoModelo = new ArrayList<>();
            licenciasModelo = new ArrayList<>();
            tipoContactoModelos = new ArrayList<>();
        for (int i=0; i <= 4; i++) {
            contactoModelo.add(new ContactoModelo("Juan Pancracio Filomeno","Coordinador","2226967841"));
        }
        for (int i=0; i<=2;i++) {
            licenciasModelo.add(new LicenciasModelo(i+1,"21DBA0004C",i*i-i));
        }
        for (int i=0;i<3;i++){
            tipoContactoModelos.add(new TipoContactoModelo("TipoContacto".concat(String.valueOf(i))));
        }

    }

    public List<TipoContactoModelo> getTipoContactoModelos() {
        return tipoContactoModelos;
    }

    public void setTipoContactoModelos(List<TipoContactoModelo> tipoContactoModelos) {
        this.tipoContactoModelos = tipoContactoModelos;
    }

    public List<LicenciasModelo> getLicenciasModelo() {
        return licenciasModelo;
    }

    public void setLicenciasModelo(List<LicenciasModelo> licenciasModelo) {
        this.licenciasModelo = licenciasModelo;
    }

    public EscuelaDetalleModelo getEscuelaDetalleModelos() {
        return escuelaDetalleModelos;
    }

    public void setEscuelaDetalleModelos(EscuelaDetalleModelo escuelaDetalleModelos) {
        this.escuelaDetalleModelos = escuelaDetalleModelos;
    }

    public List<ContactoModelo> getContactoModelo() {
        return contactoModelo;
    }

    public void setContactoModelo(List<ContactoModelo> contactoModelo) {
        this.contactoModelo = contactoModelo;
    }
}
