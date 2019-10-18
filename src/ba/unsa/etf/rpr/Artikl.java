package ba.unsa.etf.rpr;

public class Artikl {
    private String ime= new String ();
    private int cijena;
    private String kod= new String() ;

    public Artikl(){
        this.ime="";
        this.cijena=0;
        this.kod="";
    }
    public Artikl(String ime, int cijena, String kod ){
        this.ime=ime; this.cijena=cijena; this.kod=kod;
    }

    public String getNaziv() {
        return this.ime;
    }
    public int getCijena(){
        return this.cijena;
    }
    public String getKod(){
        return this.kod;
    }
}
