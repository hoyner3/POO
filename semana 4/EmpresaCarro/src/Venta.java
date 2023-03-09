
import java.util.*;

/**
 * 
 */
public class Venta {

    /**
     * Default constructor
     */
    
    private Date fecha;
    public Venta(Date fecha, Cliente cliente, Vendedor vendedor, Carro carro) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carro = carro;
    }
    private Cliente cliente;
    private Vendedor vendedor;
    private Carro carro;
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    

}