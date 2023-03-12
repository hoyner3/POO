import java.util.LinkedList;
public class Agenda {
    //Atributo
    private LinkedList<Contacto> contactos;
    //Constructor
    public Agenda() {
        this.contactos = new LinkedList<Contacto>();
    }

    //Metodos de la clase
    //Metodo para agregar un contacto a la agenda
    public void agregarContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }
    //Metodo para eliminar un contacto de la agenda
    public void eliminarContacto(Contacto contacto) {
        this.contactos.remove(contacto);
    }
    //Metodo para modificar un contacto de la agenda
    public void modificarContacto(Contacto contactoAnterior, Contacto contactoNuevo) {
        int index = this.contactos.indexOf(contactoAnterior);
        if (index >= 0) {
            this.contactos.set(index, contactoNuevo);
        }
    }

    //Metodo para obtener la lista de contactos
    public LinkedList<Contacto> obtenerContactos() {
        return this.contactos;
    }
    
   
    
    
}
