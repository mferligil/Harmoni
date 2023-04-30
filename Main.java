import java.util.Scanner;
public class Main {
    //Girilen sayının harmonik serisini bulan program. n girilirse 1 + 1/2 +1/3 + 1/4 +1/5 + ....... + 1/n şeklinde.
    public static void main(String[] args) {
        double number,total=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        number=reader.nextDouble();
        for(double i=1;i<=number;i++){
            total=total+(1/i);
        }
        System.out.println(total);
    }
}