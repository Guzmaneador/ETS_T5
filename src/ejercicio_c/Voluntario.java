package ejercicio_c;

/**
 *
 * @author munchi
 */
public class Voluntario 
                    extends Persona{//hacemos q sea una subclase de Persona{
    //Creamos el atrivuto idVoluntario;
    private int idVoluntario;
    //Creamos el constructor que heredarael constructor de Persona he inicializara idVoluntario
    
    public Voluntario(String nombre, String apellidos,int edad,int idVoluntario){
        super(nombre, apellidos,edad);
        this.idVoluntario=idVoluntario;
        
    }
    //creamos el metodo mostrarNombreApellidosYFicha() que usando los metodos geter
    //de la super clase usando la palabra super mostrara los dtos de los voluntarios.
    public void mostrarNombreApellidosYFicha(){
        System.out.println("El Nombre es: "+super.getNombre());
        System.out.println("El Apellido es: "+super.getApellidos());
        System.out.println("LA edad es: "+super.getEdad());
        System.out.println("Su Id es: "+this.idVoluntario);
    }
    
}
