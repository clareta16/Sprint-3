package T2.models;

import T2.interfaces.NumTlfn;

public class TlfnItalia implements NumTlfn {
    private final String prefix = "+39";
    private String num;

    public TlfnItalia() {

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

