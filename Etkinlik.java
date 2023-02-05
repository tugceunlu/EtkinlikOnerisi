import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if (heat<5){
            System.out.print("Kayak");
        }

        if (heat>= 5 && heat<= 15){
            System.out.print("Sinema");
        }

        if (heat> 15 && heat<= 25){
            System.out.print("Piknik");
        }

        if (heat > 25) {
            System.out.print("Yüzme");
        }



    }
}
