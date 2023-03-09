
public class Proveedor {

    /**
     * Default constructor
     */
    public Proveedor(String nombre, String teléfono, String dirección) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.dirección = dirección;
    }


    private String nombre;
    private String teléfono;
    private String dirección;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTeléfono() {
        return teléfono;
    }
    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }
    public String getDirección() {
        return dirección;
    }
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    

}