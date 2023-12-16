import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxiServiceController {

    @PostMapping("/solicitud-servicio-taxi")
    public String registrarSolicitud(@RequestBody SolicitudServicioTaxi solicitud) {
        // Aquí iría la lógica para registrar la solicitud en la base de datos o procesarla
        return "Solicitud de servicio de taxi registrada para: " + solicitud.getClienteId();
    }
}
public class SolicitudServicioTaxi {
    private String clienteId;
    private String origen;
    private String destino;

    // Getters y setters
    // ...

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
