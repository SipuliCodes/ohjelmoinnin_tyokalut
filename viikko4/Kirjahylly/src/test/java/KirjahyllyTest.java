import static org.junit.jupiter.api.Assertions.*;

class KirjahyllyTest {
    private Kirjahylly k;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        k = new Kirjahylly();
    }

    @org.junit.jupiter.api.Test
    void lisaaKirja() {
        k.lisaaKirja("Learn Python");
        assertEquals(1, k.getKirjojaHyllyssa());
        k.lisaaKirja("");
        assertEquals(1, k.getKirjojaHyllyssa());
    }

    @org.junit.jupiter.api.Test
    void viimeksiLisatty() {
        k.lisaaKirja("Java koira");
        assertEquals("Java koira", k.viimeksiLisatty());
        k.lisaaKirja("Learn Python");
        assertEquals("Learn Python", k.viimeksiLisatty());

    }

    @org.junit.jupiter.api.Test
    void onkoKirjaHyllyssa() {
        k.lisaaKirja("C++ kissa");
        assertTrue(k.onkoKirjaHyllyssa("C++ kissa"));
        assertFalse(k.onkoKirjaHyllyssa("Rust ruoste"));
    }

    @org.junit.jupiter.api.Test
    void getKirjojaHyllyssa() {
        assertEquals(0, k.getKirjojaHyllyssa());
        k.lisaaKirja("Javascript kala");
        assertEquals(1, k.getKirjojaHyllyssa());
        k.lisaaKirja("Rust ruoste");
        assertEquals(2, k.getKirjojaHyllyssa());
    }
}