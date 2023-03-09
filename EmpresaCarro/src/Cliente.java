
public class Cliente extends Persona {

 
    private TipoCliente tipo;

    

    public Cliente(String nombre, String cédula, String teléfono, String correo, String direción, TipoCliente tipo) {
        super(nombre, cédula, teléfono, correo, direción);
        this.tipo = tipo;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    

}