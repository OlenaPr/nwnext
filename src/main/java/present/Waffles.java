package present;

public class Waffles extends Sweets {

    public Waffles(int WeightSweets, int sugarSweets) {
        setWeightSweets(WeightSweets);
        setSugarSweets(sugarSweets);
    }

    @Override
    public String toString() {
        return "Waffles- " + super.toString();
    }
}
