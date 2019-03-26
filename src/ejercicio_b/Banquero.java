package ejercicio_b;

import java.util.*;

/**
 *
 * @author munchi
 */
public class Banquero 
                  extends Cliente{
    String nombre;//el atributo str es poco entendible asi q lo llamaremos nombre
    int edad;
    //Eliminamos el atributo numeroDeTelefono ya q lo heredara de su superclase
    ArrayList<Hipoteca> hipotecas;
    
    public Banquero(String numeroDeTelefono){
        super(numeroDeTelefono);
        nombre="";
        edad=0;
    }
    
    public void printInformacionCliente(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Telefono: "+this.getNumeroDeTelefono());
        //añadimos this para que recoja el atributo de la superclase
    }
    
    public void printTodaInformacion(){
        printInformacionCliente();
        mostrarHipotecas();
    }
    
    //Metodo geter
    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public void mostrarHipotecas(){
        for (Hipoteca h: hipotecas){System.out.println(h);}//FIN foreach 
    }
    
    //metodos seter
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setEdad(int edad){this.edad=edad;}
    
    
}



class Hipoteca{
    public Hipoteca(){

    }
}