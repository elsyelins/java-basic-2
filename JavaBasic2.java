import java.util.Scanner;

//introduce if else

public class JavaBasic2{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int nilai;
        nilai = scan.nextInt();
        scan.close();   

        if(nilai >81 && nilai <= 100){
            System.out.println("Nilai anda : A");
        } else if (nilai > 60 && nilai <= 80){
            System.out.println("Nilai anda : B");
        } else if (nilai > 40 && nilai <= 60){
            System.out.println ("Nilai anda : C");
        } else if (nilai > 20 && nilai <= 40){
            System.out.println("Nilai anda : D");
        } else if (nilai >= 0 && nilai <= 20){
            System.out.println("Nilai anda : E");
        } else {
            System.out.println("Invalid Number");
        }
    }    
}