package Final_Projesi;
import java.util.*;
public class Sarkı{
    private String ad;
    private String sanatci;
    public Sarkı(String ad, String sanatci){
        this.ad=ad;
        this.sanatci=sanatci;
    }
    public String getAd(){
        return ad;
    }
    public String getSanatci(){
        return sanatci;
    }
    public String toString(){
        return "Şarkı Adı:"+ad+",Sanatçı:"+sanatci;
    }
}
