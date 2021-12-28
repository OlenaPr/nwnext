package command;

public class SortbyWeightCommand implements Command{
    PresentItem presentItem;
    public SortbyWeightCommand(PresentItem presentItem){
        this.presentItem = presentItem;
    }
    @Override
    public void execute() {
       presentItem.sortByWeight();
    }
}
