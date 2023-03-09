
public class Carro {

    /**
     * Default constructor
     */
    public Carro(String marca, String modelo, String matricula, double precioVenta, double precioComp, TipoCarro tipo,Exposicion exposicion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precioVenta = precioVenta;
        this.precioComp = precioComp;
        this.tipo = tipo;
        this.exposicion = exposicion;
    }



    private String marca;
    private String modelo;
    private String matricula;
    private double precioVenta;
    private double precioComp;
    private TipoCarro tipo;
    private Exposicion exposicion;

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioComp() {
        return precioComp;
    }

    public void setPrecioComp(double precioComp) {
        this.precioComp = precioComp;
    }

    public TipoCarro getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarro tipo) {
        this.tipo = tipo;
    }

    public Exposicion getExposicion() {
        return exposicion;
    }

    public void setExposicion(Exposicion exposicion) {
        this.exposicion = exposicion;
    }

  
    
}