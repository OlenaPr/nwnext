package command;

public class FindSugarCommand implements Command{
    PresentItem presentItem;
    public FindSugarCommand( PresentItem presentItem){
        this.presentItem = presentItem;
    }
    @Override
    public void execute() {
        presentItem.findPresentSugar();
    }
}
