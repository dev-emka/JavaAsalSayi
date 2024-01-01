//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int toplamAsal=0;
        for (int i=2;i<=100;i++){
          if (Asalmi(i)){
              System.out.println(i);
              toplamAsal++;
          }
        }
        System.out.println("1'den 100'e kadar toplam "+toplamAsal+" adet asal sayı var.");
    }
    public static boolean Asalmi(int sayi){
        boolean isAs;
        int bolenadet=0;
        for (int i=1;i<=100;i++){
            if (sayi%i==0)
                bolenadet+=1;
        }
        isAs=bolenadet<=2?true:false;
        return isAs;
    }
}