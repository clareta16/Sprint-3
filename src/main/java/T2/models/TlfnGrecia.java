package T2.models;

import T2.interfaces.NumTlfn;

public class TlfnGrecia implements NumTlfn {
    private final String prefix = "+30";
    private String num;

    public TlfnGrecia() {

    }
        @Override
        public void setNumeroTlfn (String numTlfn) {
        this.num = numTlfn;

        }

    public String getNumeroTlfn() {
        return prefix + this.num;
    }

    @Override
    public String toString() {
        return getNumeroTlfn();
    }
}

