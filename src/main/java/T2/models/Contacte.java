package T2.models;

import T2.interfaces.Adreca;
import T2.interfaces.NumTlfn;

public class Contacte {
    private String nom;
    private String cognom;
    private Adreca adreca;
    private NumTlfn tlfn;

    public Contacte(String nom, String cognom, Adreca adreca, NumTlfn tlfn) {
        this.nom = nom;
        this.cognom = cognom;
        this.adreca = adreca;
        this.tlfn = tlfn;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public Adreca getAdreca() {
        return adreca;
    }

    public void setAdreca(Adreca adreca) {
        this.adreca = adreca;
    }

    public NumTlfn getTlfn() {
        return tlfn;
    }

    public void setTlfn(NumTlfn tlfn) {
        this.tlfn = tlfn;
    }

    @Override
    public String toString() {
        return "Contacte{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", adreca=" + adreca +
                ", tlfn=" + tlfn +
                '}';
    }
}
