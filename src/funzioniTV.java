import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class funzioniTV {
    // Dichiarazioni
    boolean acceso = false;
    HashMap<Integer, String> canaliValidi = new HashMap<>();

    // Funzione per accendere
    public boolean accendi() {
        if (acceso) {
            System.out.println("Il televisore è gia acceso");
        }
        return acceso = true;
    }

    // funzione per spegnere
    public boolean spegni() {
        if (!acceso) {
            System.out.println("Il televisore è gia spento");
        }
        return acceso = false;
    }

    // Funzione canali
    public HashMap creazioneCanale(){
            canali c = new canali(0, null, 0, 0);
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
                c = new canali(entry.getKey(), entry.getValue(), r.nextDouble(100), r.nextInt(100)+1);
                if (c.potenzaRilevata > 30) {
                    canaliValidi.put(c.nrCanale,c.nomeCanale);
                }
            }
            return canaliValidi;
    }
}
