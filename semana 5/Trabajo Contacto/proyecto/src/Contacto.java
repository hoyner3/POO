public class Contacto  {
    
    //Atributos
    private Persona persona;
    private String tipo;
    private int telefono;
    private String email;
    
    //Constructor
    
    public Contacto(Persona persona, String tipo, int telefono, String email) {
        this.persona = persona;
        this.tipo = tipo;
        this.telefono = telefono;
        this.email = email;
    }

    //Getter Setter
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    

    
    
}
