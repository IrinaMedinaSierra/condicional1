
import java.util.Scanner;

public class Actividad2_13A {
    public static void main(String[] args) {
        /* Granja y cálculo de raciones*/
        Scanner sn = new Scanner(System.in);
        //Variables
        int numerosAnimales;
        double cantidadComida,kiloXanimal,racion;
        System.out.println("Indica el número de animales en la Granja");
        numerosAnimales= sn.nextInt();
        System.out.println("Indica la cantidad de comida disponible");
        cantidadComida=sn.nextDouble();
        System.out.println("Indica cuanta comida come cada animal");
        kiloXanimal=sn.nextDouble();

        /* Analizamos los datos, si la cantidadComida > numeroAnimales * kiloXanimal , entonces
        * tedrian suficiente comida
        * */
        if (cantidadComida>=numerosAnimales*kiloXanimal){
            System.out.println("Hay suficiente comida");
        }else{
            System.out.println("Falta comida en la Granja, hay que ajustar la racion");
            //si esta condicion se cumple, solicitan que calcule la ración nesaria
            // y evitemos la division entre 0
            if (numerosAnimales!=0){
                racion=cantidadComida/numerosAnimales;
                System.out.println("Ajustando a lo que hay, los animales comeran " + racion + "kg" +
                        " y no tendran los kilos iniciales ("+ kiloXanimal+"kg)");
            }

        }





    }


}
