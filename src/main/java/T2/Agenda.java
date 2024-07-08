package T2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacte> contactes;

    public Agenda() {
        this.contactes = new ArrayList<>();
    }

    public void afegirContacte(Contacte contacte) {
    contactes.add(contacte);
    }

    public void mostrarAgenda() {
        for (Contacte contacte : contactes) {
            System.out.println(contacte.toString());
        }

    }


}
