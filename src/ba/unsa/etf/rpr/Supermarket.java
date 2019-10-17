package ba.unsa.etf.rpr;

public class Supermarket {
    private final int max=1000;
    private Artikl [] artikli;
    private int br_artikala;

    public Supermarket(int broj){

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

    public boolean dodajArtikl(Artikl a){
        if(br_artikala<max){
            artikli[br_artikala]=a;
            br_artikala++;
            return true;
        }
        return false;

    }
    public Artikl[] getArtikli(){
        return artikli;
    }

}
