
public class Persona {

    protected String nombre;
    protected String cédula;
    protected String teléfono;
    protected String correo;
    protected String direción;

    public Persona(String nombre, String cédula, String teléfono, String correo, String direción) {
        this.nombre = nombre;
        this.cédula = cédula;
        this.teléfono = teléfono;
        this.correo = correo;
        this.direción = direción;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireción() {
        return direción;
    }

    public void setDireción(String direción) {
        this.direción = direción;
    }
    
    

}