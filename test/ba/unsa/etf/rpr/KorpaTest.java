package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa a=new Korpa();
        a.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertEquals(1,a.DajBrArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa a=new Korpa();
        a.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        a.izbaciArtiklSaKodom("1");
        assertEquals(0,a.DajBrArtikala());
    }




    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa a=new Korpa();
        a.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertEquals(1000,a.dajUkupnuCijenuArtikala());
    }
}