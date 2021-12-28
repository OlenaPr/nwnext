package present;

public class Chocolate extends Sweets {
    public Chocolate() {
    }

    public Chocolate(int WeightSweets, int sugarSweets) {
        setWeightSweets(WeightSweets);
        setSugarSweets(sugarSweets);
    }

    @Override
    public String toString() {
        return "Chocolate- " + super.toString();
    }

}
