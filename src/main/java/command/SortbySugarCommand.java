package command;

public class SortbySugarCommand implements Command{
    PresentItem presentItem;
    public SortbySugarCommand(PresentItem presentItem){
        this.presentItem = presentItem;
    }
    @Override
    public void execute() {
      presentItem.sortBySugar();
    }
}
