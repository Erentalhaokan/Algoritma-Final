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
        benimListem.sarkiEkle(sarkı1);
        benimListem.sarkiEkle(sarkı2);
        benimListem.sarkiEkle(sarkı3);

        benimListem.calmaListesiniGoster();
    }
}
