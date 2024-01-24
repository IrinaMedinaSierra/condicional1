import java.util.Scanner;

public class Actividad2_5P {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int aforo, numeroVendidas;
        double precioEntrada, recaudacion;
        System.out.println("Indique el precio por Entrada");
        precioEntrada=sn.nextDouble();
        System.out.println("Indique el Aforo del Local");
        aforo=sn.nextInt();
        System.out.println("Número de Entradas vendidas");
        numeroVendidas=sn.nextInt();
        ///calculo de la recaudación
        recaudacion=numeroVendidas*precioEntrada;

        // Tomar deciciones basadas en el AFORO
        if (numeroVendidas>aforo){
            System.out.println("OverBooking!!!!! Busca un local mas Grande");
        }else {
            if (numeroVendidas < aforo * 0.2) { // si el aforo es menor del 20% se cancela el concieto
                System.out.println("Se CANCELA el concierto");
            } else if (numeroVendidas < aforo * 0.5) {
              //  precioEntrada -= (precioEntrada * 0.25);
              //  recaudacion = numeroVendidas * precioEntrada;
                recaudacion*=0.75;
                System.out.println("Entradas al 25%");
            } else {
                System.out.println("El concierto es normal");
            }
        }
        System.out.println("La Recaudación del concierto es de " + recaudacion + "€");








    }
}
