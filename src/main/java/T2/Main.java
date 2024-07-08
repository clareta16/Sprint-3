package T2;

import T2.interfaces.Adreca;
import T2.interfaces.NumTlfn;
import T2.models.Agenda;
import T2.models.Contacte;
import T2.models.FactoryImplement;

public class Main {
    public static void main(String[] args) {
        FactoryImplement factoryImplement = new FactoryImplement();

        Adreca adrecaEspanya = factoryImplement.getAdreca("Espanya");
        Adreca adrecaItalia = factoryImplement.getAdreca("Itàlia");
        Adreca adrecaGrecia = factoryImplement.getAdreca("Grècia");

        NumTlfn tlfnEspanya = factoryImplement.getNumTlfn("Espanya");
        NumTlfn tlfnGrecia = factoryImplement.getNumTlfn("Grècia");
        NumTlfn tlfnItalia = factoryImplement.getNumTlfn("Itàlia");

        adrecaEspanya.setAdreca("c/Casals", "43002", "Tarragona");
        adrecaGrecia.setAdreca("c/Ela", "5694", "Kerkyra");
        adrecaItalia.setAdreca("c/Sn Marino", "1394", "L'Aquila");

        tlfnGrecia.setNumeroTlfn("349583929458");
        tlfnEspanya.setNumeroTlfn("630595839");
        tlfnItalia.setNumeroTlfn("3966124387");

        Contacte nouContacteEspanya = new Contacte("Clara", "Pagès", adrecaEspanya, tlfnEspanya);
        Contacte nouContacteItalia = new Contacte("Mario", "Bros", adrecaItalia, tlfnItalia);
        Contacte nouContacteGrecia = new Contacte("Pannagiotis", "Malaka", adrecaGrecia, tlfnGrecia);

        Agenda agenda = new Agenda();
        agenda.afegirContacte(nouContacteEspanya);
        agenda.afegirContacte(nouContacteGrecia);
        agenda.afegirContacte(nouContacteItalia);

        agenda.mostrarAgenda();

    }

}
