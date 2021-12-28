package present;

public class Caramel extends Sweets {


    public Caramel(int WeightSweets, int sugarSweets) {
        setWeightSweets(WeightSweets);
        setSugarSweets(sugarSweets);
    }

    @Override
    public String toString() {
        return "Caramel- " + super.toString();
    }
}
