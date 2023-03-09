
public class Exposicion {

    /**
     * Default constructor
     */
 

    public Exposicion(String ubicación, String nombre) {
        this.ubicación = ubicación;
        this.nombre = nombre;
    }
    private String nombre;
    private String ubicación;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicación() {
        return ubicación;
    }
    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    
}