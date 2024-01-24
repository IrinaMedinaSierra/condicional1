import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        int opcion, valor1=0,valor2=0;
        double resultado=0;
        Scanner sn=new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("***** Menú de la Calculadora  *****");
        System.out.println("** 1. Sumar                      **");
        System.out.println("** 2. Restar                     **");
        System.out.println("** 3. Multiplicar                **");
        System.out.println("** 4. Dividir                    **");
        System.out.println("** 5. Salir                      **");
        System.out.println("***********************************");
        System.out.print(" Indica tu opcion->");
        opcion=sn.nextInt();
        if (opcion>=1 && opcion<=4) {
            System.out.println("Indica el valor de valor 1->");
            valor1 = sn.nextInt();
            System.out.println("Indica el valor de valor 2->");
            valor2 = sn.nextInt();
        }
        switch (opcion){
            case 1:{ resultado=valor1+valor2;
                    break;
            }
            case 2:{ resultado=valor1-valor2;
                    break;
            }
            case 3:{ resultado=valor1*valor2;
                    break;
            }
            case 4:{ resultado=valor1/valor2;
                break;
            }
            case 5: {
                System.out.println("Adiooooos..........");
                    break;
            }
            default:{
                System.err.println("La selección del menú solo es del 1 al 5");
                break;
            }

        }
        if (opcion>=1 && opcion<=4)
        System.out.println("El resultado de la operación Seleccionada es : " + resultado);
    }
}
