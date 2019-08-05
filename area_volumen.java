import java.util.Scanner;

/**
 * Programa para hallar área y volumen de un circulo y esfera
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class area_volumen
{
    public static void main(String[] args)
    {
        double r,area,volumen;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Por favor inserte el radio del objeto");
        r = Teclado.nextDouble();
        
        //calculo de area
        area = Math.PI * Math.pow(r,2);
        
        //calculo del volumen
        volumen = (4/3)*Math.PI*(r*r*r);
        
        System.out.println("el área del circulo es " + area);
        System.out.println("el el volumen de la esfera es " + volumen);
    }
}
