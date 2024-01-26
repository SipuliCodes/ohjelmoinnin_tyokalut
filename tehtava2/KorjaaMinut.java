import java.util.ArrayList;

public class KorjaaMinut {
    public static void main(String[] args) {
        // Testataan metodia erilaisilla syötteillä
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(-1);
        lista.add(3);
        lista.add(-4);
        lista.add(-5);
        lista.add(6);

        poistaNegatiiviset(lista);
        System.out.println(lista);
    }

    /**
     * Metodi poistaa listasta kaikki nollaa pienemmät alkiot
     * @param lista lista, josta alkiot poistetaan
     */
    public static void poistaNegatiiviset(ArrayList<Integer> lista) {
        int indeksi = 0;
        while (indeksi < lista.size()) {
            int alkio = lista.get(indeksi);
            if (alkio < 0) {
                lista.remove(indeksi);
                indeksi--;
            }
            indeksi++;
        }
    }
}
