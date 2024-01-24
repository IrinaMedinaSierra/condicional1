import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica tu edad->");
        edad=sn.nextInt();
        if (edad<18)   System.out.println("No puedes entrar a este Pub ni comprar tabaco");
        else  System.out.println("Debes pagar 5€ para entrar");

        //if anidados
        if (edad>18){
            System.out.println("Entras sin problema");
        }else if (edad >5){ // mayor que 5 y menor que 18
            System.out.println("Estas en primaria ");
        }

    }

}
