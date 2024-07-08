package T2.models;

import T2.interfaces.AbstractFactory;
import T2.interfaces.Adreca;
import T2.interfaces.NumTlfn;

public class FactoryImplement implements AbstractFactory {


    @Override
    public Adreca getAdreca(String pais) {
        if (pais.equalsIgnoreCase("Espanya")) {
            return new AdrecaEspanya();
        } else if (pais.equalsIgnoreCase("Grècia")) {
            return new AdrecaGrecia();
        } else if (pais.equalsIgnoreCase("Itàlia")) {
            return new AdrecaItalia();
        }
        return null;

    }

    @Override
    public NumTlfn getNumTlfn(String pais) {
        if (pais.equalsIgnoreCase("Espanya")) {
            return new TlfnEspanya();
        } else if (pais.equalsIgnoreCase("Grècia")) {
            return new TlfnGrecia();
        } else if (pais.equalsIgnoreCase("Itàlia")) {
            return new TlfnItalia();
        }
        return null;

    }

}
