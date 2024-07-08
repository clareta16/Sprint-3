package T2.models;

import T2.interfaces.Adreca;

public class AdrecaEspanya implements Adreca {
    private String adreca;
    private String codiPostal;
    private String ciutat;
    private final String pais;

    public AdrecaEspanya() {
        this.pais = "Espanya";
    }


    @Override
    public void setAdreca(String adreca, String codiPostal, String ciutat) {
        this.adreca = adreca;
        this.codiPostal = codiPostal;
        this.ciutat = ciutat;

    }

    @Override
    public String getAdreca() {
        return adreca + " " + codiPostal + " " + ciutat + " " + pais;
    }

    @Override
    public String toString() {
        return getAdreca();
    }
}

