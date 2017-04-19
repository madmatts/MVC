package app.model;

/**
 * Created by Matts on 19.04.2017.
 */
public class Value {
    private double value;

    public Value(){

    }

    public Value(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
