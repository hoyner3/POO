import java.util.Date;



public class App {
    public static void main(String[] args){

        
        Agenda agenda = new Agenda();//Instanciamos la clase Agenda
        Persona persona1 = new Persona("Juan", "Perez", "Calle 1");//Instanciamos la clase Persona
        Contacto contacto1 = new Familia(persona1, "Familia", 12112121, "hoyner@gmail.com", "Hermano", new Date(2020, 12, 12););//Instanciamos la clase Contacto
        //dame un contacto de tipo familia 
        
        System.out.println(agenda);

        
}
