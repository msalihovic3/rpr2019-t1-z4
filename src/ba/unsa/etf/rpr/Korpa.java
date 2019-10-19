package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl [] artikli;
    private static int br_artikala;

    public Korpa(){
        br_artikala=0;
        artikli=new Artikl[50];

    }
    public boolean dodajArtikl(Artikl a){
        if(br_artikala<artikli.length){
            artikli[br_artikala]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            br_artikala++;
            return true;
        }
        return false;


    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl pom=null;
        for(int i=0; i<br_artikala; i++){
            if(artikli[i].getKod().equals(kod)){
                pom=artikli[i];
                for(int j=i; j<br_artikala-1; j++ ){
                    artikli[j]=artikli[j+1];
                }
                artikli[br_artikala]= null;
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
