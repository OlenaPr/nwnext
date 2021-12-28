package command;

public class Developer {
    Command findPresentWeight;
    Command findPresentSugar;
    Command sortBySugar;
    Command sortByWeigh;

    public Developer(Command findPresentWeight, Command findPresentSugar, Command sortBySugar, Command sortByWeigh) {
        this.findPresentWeight = findPresentWeight;
        this.findPresentSugar = findPresentSugar;
        this.sortBySugar = sortBySugar;
        this.sortByWeigh = sortByWeigh;
    }

    public void FindWeight(){
        findPresentWeight.execute();
    }
    public  void SortSugar(){
        sortBySugar.execute();
    }
    public  void SortWeight(){
        sortByWeigh.execute();
    }
    public void FindSugar(){
        findPresentSugar.execute();
    }

}
