package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {


    @Test
    void izbaciArtiklSaKodom() {
        Supermarket a=new Supermarket();
        a.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        a.izbaciArtiklSaKodom("1");
        assertEquals(0,a.DajBrArtikala());
    }

    @Test
    void dodajArtikl() {
        Supermarket a=new Supermarket();
        a.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertEquals(1,a.DajBrArtikala());
    }



}