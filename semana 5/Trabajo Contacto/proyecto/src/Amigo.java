import java.sql.Date;

public class Amigo extends Contacto {

    //Atributos
    private String apodo;
    private Date fechaN;

    //Constructor
    public Amigo(Persona persona,String tipo, int telefono, String email, String apodo, Date fechaN) {
        super(persona, tipo, telefono, email);
        this.apodo = apodo;
        this.fechaN = fechaN;
    }

    //Getter Setter
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

   
    
    
}
