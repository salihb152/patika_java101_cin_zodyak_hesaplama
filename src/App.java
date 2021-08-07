import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int birthYear;
        String zodiacSign=null;
        Scanner sc= new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz : ");
        birthYear=sc.nextInt();

        switch(birthYear%12){
            case 0: 
            zodiacSign="Maymun";
            break;
            case 1:
            zodiacSign="Horoz";
            break;
            case 2:
            zodiacSign="Köpek";
            break;
            case 3:
            zodiacSign="Domuz";
            break;
            case 4:
            zodiacSign="Fare";
            break;
            case 5:
            zodiacSign="Öküz";
            break;
            case 6:
            zodiacSign="Kaplan";
            break;
            case 7:
            zodiacSign="Tavşan";
            break;
            case 8:
            zodiacSign="Ejderha";
            break;
            case 9:
            zodiacSign="Yılan";
            break;
            case 10:
            zodiacSign="At";
            break;
            case 11:
            zodiacSign="Koyun";
            break;
            default:
            System.out.println("Hatalı değer girdiniz!");
        }
        System.out.println("Çin Zodyağı Burcunuz : " + zodiacSign);
        sc.close();
    }
}
