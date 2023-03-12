import java.util.Date;


public class Familia extends Contacto{

    //Atributos
    private String parentesco;
    private Date cumpleaños;

    

    

    //Constructor
    
    //Getter Setter
    public String getParentesco() {
        return parentesco;
    }

    public Familia(Persona persona, String tipo, int telefono, String email, String parentesco, Date cumpleaños) {
        super(persona, tipo, telefono, email);
        this.parentesco = parentesco;
        this.cumpleaños = cumpleaños;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Date getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Date cumpleaños) {
        this.cumpleaños = cumpleaños;
    }


    
    
    
}
