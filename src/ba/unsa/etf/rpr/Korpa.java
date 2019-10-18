package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl [] artikli;
    private int br_artikala;

    public Korpa(){
        br_artikala=0;
        artikli=new Artikl[50];

    }
    public boolean dodajArtikl(Artikl a){
        if(artikli[br_artikala] != null){
            artikli[br_artikala]=a;
            br_artikala++;
            return true;
        }
        return false;


    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl pom = new Artikl();
        for(int i=0; i<br_artikala; i++){
            if(artikli[i].getKod().equals(kod)){
                pom=artikli[i];
                for(int j=i; j<br_artikala-1; j++ ){
                    artikli[j]=artikli[j+1];
                }
                br_artikala--;
                break;
            }

        }

        return pom;

    }
    public Artikl[] getArtikli(){
        return artikli;

    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0; i<br_artikala; i++){
            suma += artikli[i].getCijena();
        }
        return  suma;

    }

}
