import java.util.Scanner;

public class Actividad2_11A {
    public static void main(String[] args) {
        boolean capicua=false; //
        Scanner sn =new Scanner(System.in);
        // Numero entero entre 0  y 9999
        int num,u,d,c,um;
        //*************************
        System.out.println("----- C A P I C U A ------");
        System.out.println("Indica un número entero entre 0 y 9999 ");
        num=sn.nextInt();

        //Evaluamos Matemáticamente
        u=num%10; // obtengo las unidades
        num/=10; // elimino la unidad de num
        d=num%10;  // obtengo las decenas
        num/=10;   // elimino las decenas de num
        c=num%10;  //obtengo las centenas
        num/=10;   //elimino las centenas de num
        um=num;    // obtengo las unidad de millar


        // Evaluación Logica
        if (um==u && d==c){
            capicua=true;
        }else if(um==0 && c==u){
            capicua=true;
        }else if (um==0 && c==0 && d==u){
            capicua=true;
        }else if (um==0 && c==0 && d==0){
            capicua=true;
        }

        if (capicua){ // if (capicua ==true)
            System.out.println("El número escrito es capicua");
        }else{
            System.out.println("El número no es capicua");
        }










    }


}
