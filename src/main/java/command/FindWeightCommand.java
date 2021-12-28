package command;

public class FindWeightCommand implements Command{
    PresentItem presentItem;
    public FindWeightCommand( PresentItem presentItem){
        this.presentItem = presentItem;
    }
    @Override
    public void execute() {
        presentItem.findPresentWeight();
    }
}
