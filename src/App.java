
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        funzioniTV tv = new funzioniTV();
        HashMap<Integer, String> canaliValidi;
        Scanner sc = new Scanner(System.in);
        boolean uscita = true;
        int vol = 1;

        while (uscita) {
            System.out.println("1. Accendi");
            System.out.println("2. Spegni");
            System.out.println("3. Sintonizza canali");
            System.out.println("4. Cambia canale");
            System.out.println("5. Aumenta volume");
            System.out.println("6. Decrementa volume");
            System.out.println("Inserisci un altro valore per uscire");
            int scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    if (tv.accendi()) {
                        System.out.println("Il televisore è stato acceso");
                    } else {
                        System.out.println("Il televisore è gia acceso");
                    }
                    break;
                case 2:
                    if (tv.spegni()) {
                        System.out.println("Il televisore è gia spento");
                    } else {
                        System.out.println("Il televisore è stato spento");
                    }
                    break;
                case 3:
                    if (tv.acceso) {
                        canaliValidi = tv.creazioneCanale();
                        for (Map.Entry<Integer, String> entry : canaliValidi.entrySet()) {
                            System.out.println("Numero: " + entry.getKey() + ", Canale: " + entry.getValue());
                        }
                    } else {
                        System.out.println("Il televisore è spento");
                    }
                    break;
                case 4:
                    System.out.println("Inserisci il numero del canale");
                    int canale = sc.nextInt();
                    if (tv.acceso) {
                        String nome = tv.guardaCanale(canale);
                        if (!nome.equals("")) {
                            System.out.println("Stai guardando il canale: " + nome);
                        } else {
                            System.out.println("Il canale non esiste");
                        }
                    } else {
                        System.out.println("Il televisore è spento");
                    }
                    break;
                case 5:
                    if (tv.acceso) {
                        if (vol < 10) {
                            vol = tv.aumentaVolume();
                            System.out.println("Il volume attuale è: " + vol);
                        } else {
                            System.out.println("Volume massimo raggiunto");
                        }
                    } else {
                        System.out.println("Il televisore è spento");
                    }
                    break;
                case 6:
                    if (tv.acceso) {
                        if (vol > 1) {
                            vol = tv.diminuisciVolume();
                            System.out.println("Il volume attuale è: " + vol);
                        } else {
                            System.out.println("Volume minimo raggiunto");
                        }
                    } else {
                        System.out.println("Il televisore è spento");
                    }
                    break;
                default:
                    uscita = false;
            }
        }

        sc.close();

    }
}
