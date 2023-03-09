
public class Vendedor extends Persona {

    /**
     * Default constructor
     */

    public Vendedor(String nombre, String cédula, String teléfono, String correo, String direción, double salario,
            TipoVendedor tipo) {
        super(nombre, cédula, teléfono, correo, direción);
        this.salario = salario;
        this.tipo = tipo;
    }
    private double salario;
    private TipoVendedor tipo;
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public TipoVendedor getTipo() {
        return tipo;
    }
    public void setTipo(TipoVendedor tipo) {
        this.tipo = tipo;
    }

    

}