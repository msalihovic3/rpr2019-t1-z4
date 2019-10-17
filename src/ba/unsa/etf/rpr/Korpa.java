package ba.unsa.etf.rpr;

public class Korpa {
    private final int max=50;
    private Artikl [] artikli;
    private int br_artikala;

    public Korpa(){
        br_artikala=0;
        artikli=new Artikl[50];

    }
    public boolean dodajArtikl(Artikl a){
        if(br_artikala<max){
            artikli[br_artikala]=a;
            br_artikala++;
            return true;
        }
        return false;


    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl pom;
        for(int i=0; i<br_artikala; i++){
            if(artikli[i].getKod()==kod){
                pom=artikli[i];
                for(int j=i; j<br_artikala-1; j++ ){
                    artikli[j]=artikli[j+1];
                }
                br_artikala--;
                return pom;
            }

        }



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
