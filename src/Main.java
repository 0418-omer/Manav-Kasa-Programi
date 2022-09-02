import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double patlican=5.0;
        double muz=0.95;

        System.out.print("Armut kac kilo? : ");
        int armut_kilo=scan.nextInt();
        double top_armut=armut_kilo*armut;

        System.out.print("Elma kac kilo? : ");
        int elma_kilo=scan.nextInt();
        double top_elma=elma_kilo*elma;

        System.out.print("Domates kac kilo? : ");
        int domates_kilo=scan.nextInt();
        double top_domates=domates_kilo*domates;

        double toplam =top_elma+top_armut+top_domates;
        System.out.println("Toplam tutar: "+toplam+ " TL");


    }
}