package T1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> comandos;

    private Undo() {
        this.comandos = new ArrayList<>();

    }
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void afegirComanda(String comando) {
        comandos.add(comando);
        System.out.println("Comanda " + comando + " afegida!");
    }

    public void eliminarComanda(String comando) {
        if (comandos.contains(comando)) {
            comandos.remove(comando);
            System.out.println("Comanda " + comando + " eliminada!");
        } else {
            System.out.println("No s'ha trobat la comanda");
        }

    }

    public void listHistoryComandos() {
            for (int i = 0; i < comandos.size(); i++) {
               System.out.println(comandos.get(i));
            }
    }
}
