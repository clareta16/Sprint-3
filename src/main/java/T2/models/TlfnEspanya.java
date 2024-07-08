package T2.models;

import T2.interfaces.NumTlfn;

public class TlfnEspanya implements NumTlfn {
    private final String prefix = "+34";
    private String num;

    public TlfnEspanya() {

    }
        @Override
        public void setNumeroTlfn (String numTlfn) {
        this.num = numTlfn;

        }

    public String getNumeroTlfn() {
        return prefix + this.num;
    }
}

