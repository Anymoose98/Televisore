
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class funzioniTV {

    // Dichiarazioni
    boolean acceso = false;
    HashMap<Integer, String> canaliValidi = new HashMap<>();
    int volume = 1;

    // Funzione per accendere
    public boolean accendi() {
        if (!acceso) {
            acceso = true;
        } else {
            return !acceso;
        }
        return acceso;
    }

    // funzione per spegnere
    public boolean spegni() {
        if (acceso) {
            acceso = false;
        } else {
            return !acceso;
        }
        return acceso;
    }

    // Funzione canali
    public HashMap<Integer, String> creazioneCanale() {

        Random r = new Random();

        HashMap<Integer, String> canali = new HashMap<>();
        canali.put(1, "Rai1");
        canali.put(2, "Rai2");
        canali.put(3, "Rai3");
        canali.put(4, "Canale4");
        canali.put(5, "Canale5");
        canali.put(6, "Italia1");
        canali.put(7, "La7");

        for (Map.Entry<Integer, String> entry : canali.entrySet()) {
            canali c = new canali(entry.getKey(), entry.getValue(), r.nextDouble(100), r.nextInt(100) + 1);
            if (c.potenzaRilevata > 30) {
                canaliValidi.put(c.nrCanale, c.nomeCanale);
            }
        }

        return canaliValidi;
    }

    public int aumentaVolume() {

        volume++;
        return volume;
    }

    public int diminuisciVolume() {
        volume--;

        return volume;
    }

    public String guardaCanale(int nr) {
        String nome = "";
        if (canaliValidi.containsKey(nr)) {
            nome = canaliValidi.get(nr);
        }
        return nome;
    }
}
