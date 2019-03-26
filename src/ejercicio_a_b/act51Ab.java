package ejercicio_a_b;

/**
 *
 * @author munchi
 */
public class act51Ab {
    //para poder tabjar con el atributo desde contenido estatico este tiene q ser estatico
    private static final String s ="Javabeando";
    public static void main (String[] args){
        System.out.println("Resultado: "+metodoC(metodoB(s)) );
    }
    private static String metodoB(String s){
        s = s + "Codigo mascarita";
        return s;
    }
    public static int metodoC(String s){
        int cuenta = 0;
        for (int i=0; i<s.length();i++)
            if(Character.isUpperCase(s.charAt(i))) cuenta++;
        return cuenta;   
    }   
}
