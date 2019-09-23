package s069;

public abstract class Mammal { // tag astratta non posso creare un oggetto mammal
    protected int gestation; // giorni necessari per nascere

    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
