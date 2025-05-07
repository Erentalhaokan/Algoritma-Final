package Final_Projesi;
import java.util.ArrayList;
import java.util.List;
public class CalmaListesi {
    private List<Sarkı> sarkılar;

    public CalmaListesi() {
        this.sarkılar = new ArrayList<>();
    }

    public void sarkiEkle(Sarkı sarki) {
        this.sarkılar.add(sarki);
        System.out.println("'" + sarki.getAd() + "'çalma listesine eklendi.");
    }

    public void calmaListesiniGoster() {
        if (sarkılar.isEmpty()) {
            System.out.println("Çalma listesi boş...");
        } else {
            System.out.println("---Çalma listesi----");
            for (int i = 0; i < sarkılar.size(); i++) {
                System.out.println((i + 1) + "." + sarkılar.get(i));
            }
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {
        CalmaListesi benimListem = new CalmaListesi();
        Sarkı sarkı1 = new Sarkı("Unuttun mu beni", "Sezen Aksu");
        Sarkı sarkı2 = new Sarkı("Tükeneceğiz", "Sezen Aksu");
        Sarkı sarkı3 = new Sarkı("Firuze", "Sezen Aksu");
        Sarkı sarkı4 = new Sarkı("Gündüzüm seninle","Ferdi Özbeğen");
        Sarkı sarkı5 = new Sarkı("Olsun","Sertab Erener");
        Sarkı sarkı6 = new Sarkı("Yanarım","Sertab Erener");
        Sarkı sarkı7 = new Sarkı("Kül","Cem Adrian");
        Sarkı sarkı8 = new Sarkı("Derinlerde","Cem Adrian");
        Sarkı sarkı9 = new Sarkı("Kapkara","Sıla");
        Sarkı sarkı10 = new Sarkı("Vurgunum","Ahmet Kaya");
        benimListem.sarkiEkle(sarkı1);
        benimListem.sarkiEkle(sarkı2);
        benimListem.sarkiEkle(sarkı3);
        benimListem.sarkiEkle(sarkı4);
        benimListem.sarkiEkle(sarkı5);
        benimListem.sarkiEkle(sarkı6);
        benimListem.sarkiEkle(sarkı7);
        benimListem.sarkiEkle(sarkı8);
        benimListem.sarkiEkle(sarkı9);
        benimListem.sarkiEkle(sarkı10);

        benimListem.calmaListesiniGoster();
    }
}
