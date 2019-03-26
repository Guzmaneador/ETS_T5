package ejercicio_b;

/**
 *
 * @author munchi
 */
public class Cliente {
    String numeroDeTelefono;
    
    public Cliente(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    public void setNumeroDeTelfono(String numeroDeTelefono){
        this.numeroDeTelefono=numeroDeTelefono;
    }
    
}
