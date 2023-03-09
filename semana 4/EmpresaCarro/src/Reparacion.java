import java.util.Date;
public class Reparacion {

    /**
     * Default constructor
     */
    

    private Date fecha;
    public Reparacion(Date fecha, TipoReparacion tipo, double costo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.costo = costo;
    }
    private TipoReparacion tipo;
    private double costo;
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public TipoReparacion getTipo() {
        return tipo;
    }
    public void setTipo(TipoReparacion tipo) {
        this.tipo = tipo;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    

}