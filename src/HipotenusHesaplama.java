import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        int birinciKenar , ikincikenar;
        double   hipotenus ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci kenarin uzunlugunu giriniz :");
        birinciKenar = inp.nextInt();

        System.out.println("İkinci kenarin uzunlugunu giriniz : ");
        ikincikenar = inp.nextInt();

        hipotenus = Math.sqrt((birinciKenar*birinciKenar)+(ikincikenar*ikincikenar));

        System.out.println(hipotenus);





    }
}

