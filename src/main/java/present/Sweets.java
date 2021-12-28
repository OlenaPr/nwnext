package present;

public abstract class Sweets {

    private int weightSweets;
    private int sugarSweets;

    public Sweets() {
    }

    public Sweets(int weightSweets, int sugarSweets) {
        this.weightSweets = weightSweets;
        this.sugarSweets = sugarSweets;
    }

    public int getWeightSweets() {
        return weightSweets;
    }

    public void setWeightSweets(int weightSweets) {
        this.weightSweets = weightSweets;
    }

    public int getSugarSweets() {
        return sugarSweets;
    }

    public void setSugarSweets(int sugarSweets) {
        this.sugarSweets = sugarSweets;
    }

    @Override
    public String toString() {
        return " " +
                "weightSweets=" + weightSweets +
                ", sugarSweets=" + sugarSweets + '\n'
                ;
    }
}
