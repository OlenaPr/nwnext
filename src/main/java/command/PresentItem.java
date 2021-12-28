package command;

import present.Caramel;
import present.Chocolate;
import present.Sweets;
import present.Waffles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PresentItem {
    private String presentName;
    private double presentWeight;
    private double presentSugar;
    private List<Sweets> sweetsList = new ArrayList<>();

    public PresentItem() {
    }

    public PresentItem(String presentName, double presentWeight, double presentSugar, List<Sweets> sweetsList) {
        this.presentName = presentName;
        this.presentWeight = presentWeight;
        this.presentSugar = presentSugar;
        this.sweetsList = sweetsList;
    }

    public void addSmall( PresentItem  presentItem){

        presentItem.setPresentName("Small");
        presentItem.addSweetsToList(new Chocolate(100, 5));
        presentItem.addSweetsToList(new Chocolate(100, 5));
        presentItem.addSweetsToList(new Waffles(12, 15));
        presentItem.addSweetsToList(new Caramel(23, 45));
    }
    public void addMedium( PresentItem  presentItem){
        presentItem.setPresentName("Medium");
        presentItem.addSweetsToList(new Chocolate(15, 5));
        presentItem.addSweetsToList(new Chocolate(10, 5));
        presentItem.addSweetsToList(new Chocolate(10, 5));
        presentItem.addSweetsToList(new Waffles(12, 15));
        presentItem.addSweetsToList(new Waffles(12, 15));
        presentItem.addSweetsToList(new Caramel(23, 45));
        presentItem.addSweetsToList(new Caramel(33, 65));
        System.out.println(presentItem);
    }
    public void addBig( PresentItem  presentItem){
        presentItem.setPresentName("Big");
        presentItem.addSweetsToList(new Chocolate(10, 5));
        presentItem.addSweetsToList(new Chocolate(10, 5));
        presentItem.addSweetsToList(new Chocolate(10, 5));
        presentItem.addSweetsToList(new Chocolate(10, 5));
        presentItem.addSweetsToList(new Waffles(12, 15));
        presentItem.addSweetsToList(new Waffles(12, 15));
        presentItem.addSweetsToList(new Waffles(12, 15));
        presentItem.addSweetsToList(new Waffles(12, 15));
        presentItem.addSweetsToList(new Caramel(23, 45));
        presentItem.addSweetsToList(new Caramel(23, 45));
        presentItem.addSweetsToList(new Caramel(23, 45));
        presentItem.addSweetsToList(new Caramel(33, 65));
        System.out.println(presentItem);

    }
    public void fff(int t1, int t2,Sweets sweets,Scanner scanner,PresentItem presentItem){
        System.out.println("введіть вагу");
        t1=scanner.nextInt();
        sweets.setWeightSweets(t1);
        System.out.println("введіть вміміст цукру");
        t2=scanner.nextInt();
        sweets.setSugarSweets(t2);
        presentItem.addSweetsToList(sweets);
    }
    public void  sss(int a1,int a2,Scanner scanner,PresentItem presentItem){
        System.out.println("введіть min цукру");
        a1 = scanner.nextInt();
        System.out.println("введіть max цукру");
        a2 = scanner.nextInt();
        presentItem.selectBySugar(a1, a2);
    }

    public void addSweetsToList(Sweets sweets) {
        sweetsList.add(sweets);
    }

    public void findPresentWeight() {
        for (Sweets sweets : sweetsList) {
            presentWeight += sweets.getWeightSweets();
        }
    }

    public void findPresentSugar() {
        for (Sweets sweets : sweetsList) {
            presentSugar += sweets.getSugarSweets();
        }
    }

    public void sortBySugar() {
        sweetsList.sort(new Comparator<Sweets>() {
            @Override
            public int compare(Sweets s1, Sweets s2) {
                return s1.getSugarSweets() - s2.getSugarSweets();
            }
        });
        System.out.println("\nAfter sort:");
        for (Sweets sweets : sweetsList) {
            System.out.println(sweets);
        }

    }

    public void selectBySugar(int min, int max) {
        System.out.println("\nAfter sort:");
        for (Sweets sweets : sweetsList) {
            if (sweets.getSugarSweets() >= min && sweets.getSugarSweets() <= max) {
                System.out.println(sweets);
            }
        }
    }

    public void sortByWeight() {
        sweetsList.sort(new Comparator<Sweets>() {
            @Override
            public int compare(Sweets s1, Sweets s2) {
                return s1.getWeightSweets() - s2.getWeightSweets();
            }
        });
        System.out.println("\nAfter sort:");
        for (Sweets sweets : sweetsList) {
            System.out.println(sweets);
        }

    }


    public String getPresentName() {
        return presentName;
    }

    public void setPresentName(String presentName) {
        this.presentName = presentName;
    }

    public double getPresentWeight() {
        return presentWeight;
    }

    public void setPresentWeight(double presentWeight) {
        this.presentWeight = presentWeight;
    }

    public double getPresentSugar() {
        return presentSugar;
    }

    public void setPresentSugar(double presentSugar) {
        this.presentSugar = presentSugar;
    }

    public List<Sweets> getSweetsList() {
        return sweetsList;
    }

    public void setSweetsList(List<Sweets> sweetsList) {
        this.sweetsList = sweetsList;
    }

    @Override
    public String toString() {
        return "PresentItem{" +
                "presentName='" + presentName + '\'' +
                ", presentWeight=" + presentWeight +
                ", presentSugar=" + presentSugar +
                ", sweetsList=" + '\n' + sweetsList;
    }
}
