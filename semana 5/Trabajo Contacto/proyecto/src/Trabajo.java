public class Trabajo extends Contacto{
    //Atributos
    private String empresa;
    private String puesto;

    //Constructor
    public Trabajo(Persona persona, String tipo, int telefono, String email, String empresa, String puesto) {
        super(persona, tipo, telefono, email);
        this.empresa = empresa;
        this.puesto = puesto;
    }

    //Getter Setter
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
    

    
}
