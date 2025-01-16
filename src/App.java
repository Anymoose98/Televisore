import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        funzioniTV tv = new funzioniTV();
        HashMap<Integer, String> canaliValidi = new HashMap<>();

        canaliValidi = tv.creazioneCanale();

        for (Map.Entry<Integer, String> entry : canaliValidi.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
    }
}
