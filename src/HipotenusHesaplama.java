import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        int birinciKenar , ikinciKenar , ucuncuKenar , cevre , u;
        double alan;




        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci kenarin uzunlugunu giriniz :");
        birinciKenar = inp.nextInt();

        System.out.println("İkinci kenarin uzunlugunu giriniz : ");
        ikinciKenar = inp.nextInt();

        System.out.println("Ucuncu kenarin uzunlugunu giriniz : ");
        ucuncuKenar = inp.nextInt();

        cevre = birinciKenar + ikinciKenar + ucuncuKenar ;

        u = cevre / 2 ;

        alan = Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));


        System.out.println(alan);





    }
}

