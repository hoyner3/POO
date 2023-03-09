
public class TipoCarro extends Carro {

    public TipoCarro(String marca, String modelo, String matricula, double precioVenta, double precioComp,
            TipoCarro tipo, Exposicion exposicion) {
        super(marca, modelo, matricula, precioVenta, precioComp, tipo, exposicion);//el super es para que se pueda usar el constructor de la clase padre
    }

    /**
     * Default constructor
     */
    
}