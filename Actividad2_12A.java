import java.sql.SQLOutput;
import java.util.Scanner;

public class Actividad2_12A {
    public static void main(String[] args) {
        // calculo de la letra del DNi
        Scanner sn = new Scanner(System.in);
        int numeroDni, calculo;
        char letra=' ';
        System.out.println("Indica el número de DNI SIN la letra");
        numeroDni= sn.nextInt();
        calculo=numeroDni%23; // 0  al 22
        switch (calculo){
            case 0->letra='T';
            case 1->letra='R';
            case 2->letra='W';
            case 3->letra='A';
            case 4->letra='G';
            case 5->letra='M';
            case 6->letra='Y';
            case 7->letra='F';
            case 8->letra='P';
            case 9->letra='D';
            case 10->letra='X';
            case 11->letra='B';
            case 12->letra='N';
            case 13->letra='J';
            case 14->letra='Z';
            case 15->letra='S';
            case 16->letra='Q';
            case 17->letra='V';
            case 18->letra='H';
            case 19->letra='L';
            case 20->letra='C';
            case 21->letra='K';
            case 22->letra='E';
        }
        System.out.println("La letra del iDNI " + numeroDni +" es " + letra);
    }
}
