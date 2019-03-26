package ejercicio_a_a;

/**
 *
 * @author munchi
 */
public class act51Aa {
    boolean x;
    public static void main(String[] args){
        act51Aa obj = new act51Aa();
        System.out.println("La x es "+obj.x);
        act51Ca c = new act51Ca();//eliminamos lo parametro q le damos al objeto
        //añadimos la frase de salida mas la llamada al metodo getValor del objeto c
        System.out.println("Un objeto con valor "+c.getValor());
    }
    
}//fin clase act51Aa
//package ejericio_a_a; sobrante
//Eliminamos public de la clase
class act51Ca{
    private double valor;
    //creamos el metodo getValor para poder acceder al atributo valor desde otr clase
    public double getValor(){return valor;}    
}

