
package ejericio_d;

/**
 *
 * @author munchi
 */
public class Ciclista {
    private final int AMATEUR=1;
    private final int SEMIPROFESIONAL =2;
    private final int PROFESIONAL=3;
    private static final int tipo=0;
    
    public static int getTipo(){
        return(tipo);
    }
    
    public Ciclista analizar(int tipo){
        throws IllegalArgumentException{
            if (tipo==1||tipo==2||tipo=3){
                this.tipo=tipo;
                return new Ciclista();
            }else
            {
            throws new IllegalArgumentException(
            "Tipo de dato Incorrecto!!!");   
            }
        }
        
    }
    
}
