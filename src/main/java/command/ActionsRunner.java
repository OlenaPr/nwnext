package command;


//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import present.*;

import java.io.*;
import java.util.Scanner;


public class ActionsRunner {

    private static Logger Log = LogManager.getLogger(ActionsRunner.class);
    public static void main(String[] args) throws IOException {

        PresentItem presentItem = new PresentItem();
        Developer developer = new Developer(
                new FindSugarCommand(presentItem),
                new FindWeightCommand(presentItem),
                new SortbySugarCommand(presentItem),
                new SortbyWeightCommand(presentItem)

        );

        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        boolean isTrue = true;
        int g = 0;

        int t1 = 0;
        int t2 = 0;
        int a1 = 0;
        int a2 = 0;
        firstInfo();
        do {

            if (g == 1) {

                presentItem.addSmall(presentItem);
                developer.findPresentSugar.execute();
                developer.findPresentWeight.execute();
                System.out.println(presentItem);

                secondInfo();
                int b = scanner.nextInt();

                switch (b) {
                    case 1:
                        Sweets s1 = new Caramel(0, 0);
                         presentItem.fff(t1,t2,s1,scanner,presentItem);
                        Log.fatal("Something is wrong with the file");
                    break;
                    case 2:
                        Sweets s2 = new Waffles(0, 0);
                        presentItem.fff(t1,t2,s2,scanner,presentItem);
                    break;
                    case 3:
                        Sweets s3 = new Chocolate(0, 0);
                        presentItem.fff(t1,t2,s3,scanner,presentItem);
                    break;

                }
                presentItem.findPresentSugar();
                presentItem.findPresentWeight();

                BufferedReader br = null;
                try {
                    File file = new File("file.txt");

                    if (!file.exists())
                        file.createNewFile();
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(presentItem);
                    pw.close();
                    br = new BufferedReader(new FileReader("file.txt"));
                    String line;
                    while((line = br.readLine()) !=null){
                        System.out.println(line);
                    }
                }catch(IOException e){
                    Log.error("Something is wrong with the file");
                }finally {
                    try {
                        br.close();
                    }catch(IOException e){
                        Log.error("Something is wrong with the file");
                    }
                }


                thirdInfo();
                int c = scanner.nextInt();
                switch (c) {
                    case 1:
                        developer.sortBySugar.execute();
                    break;
                    case 2:
                        developer.sortByWeigh.execute();
                    break;
                    case 3:
                        presentItem.sss(a1,a2,scanner,presentItem);
                    break;
                }
                System.out.println("Натисніть 4 щоб вийти");
            }

            if (g == 2) {

                presentItem.addMedium(presentItem);
                developer.findPresentSugar.execute();
                developer.findPresentWeight.execute();
                System.out.println(presentItem);

                secondInfo();
                int b1 = scanner.nextInt();
                switch (b1) {
                    case 1:
                        Sweets s1 = new Caramel(0, 0);
                        presentItem.fff(t1,t2,s1,scanner,presentItem);
                    break;
                    case 2:
                        Sweets s2 = new Waffles(0, 0);
                        presentItem.fff(t1,t2,s2,scanner,presentItem);
                    break;
                    case 3:
                        Sweets s3 = new Chocolate(0, 0);
                        presentItem.fff(t1,t2,s3,scanner,presentItem);
                    break;
                }
                presentItem.findPresentSugar();
                presentItem.findPresentWeight();
                BufferedReader br = null;
                try {
                    File file = new File("file.txt");

                    if (!file.exists())
                        file.createNewFile();
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(presentItem);
                    pw.close();
                    br = new BufferedReader(new FileReader("file.txt"));
                    String line;
                    while((line = br.readLine()) !=null){
                        System.out.println(line);
                    }
                }catch(IOException e){
                    Log.error("Something is wrong with the file");
                }finally {
                    try {
                        br.close();
                    }catch(IOException e){
                        Log.error("Something is wrong with the file");
                    }
                }


                thirdInfo();
                int c = scanner.nextInt();
                switch (c) {
                    case 1:
                        developer.sortBySugar.execute();
                    break;
                    case 2:
                        developer.sortByWeigh.execute();
                    break;
                    case 3:
                        presentItem.sss(a1,a2,scanner,presentItem);
                    break;
                }
                System.out.println("Натисніть 4 щоб вийти");
            }
            if (g == 3) {

                presentItem.addBig(presentItem);
                developer.findPresentSugar.execute();
                developer.findPresentWeight.execute();
                System.out.println(presentItem);

                secondInfo();
                int b2 = scanner.nextInt();

                switch (b2) {
                    case 1:
                        Sweets s1 = new Caramel(0, 0);
                        presentItem.fff(t1,t2,s1,scanner,presentItem);
                    break;
                    case 2:
                        Sweets s2 = new Waffles(0, 0);
                        presentItem.fff(t1,t2,s2,scanner,presentItem);
                    break;
                    case 3:
                        Sweets s3 = new Chocolate(0, 0);
                        presentItem.fff(t1,t2,s3,scanner,presentItem);
                    break;

                }
                presentItem.findPresentSugar();
                presentItem.findPresentWeight();

                BufferedReader br = null;
                try {
                    File file = new File("file.txt");

                    if (!file.exists())
                        file.createNewFile();
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(presentItem);
                    pw.close();
                    br = new BufferedReader(new FileReader("file.txt"));
                    String line;
                    while((line = br.readLine()) !=null){
                        System.out.println(line);
                    }
                }catch(IOException e){
                    Log.error("Something is wrong with the file");
                }finally {
                    try {
                        br.close();
                    }catch(IOException e){
                        Log.error("Something is wrong with the file");
                    }
                }

                thirdInfo();
                int c = scanner.nextInt();
                switch (c) {
                    case 1:
                        developer.sortBySugar.execute();
                    break;
                    case 2:
                        developer.sortByWeigh.execute();
                    break;
                    case 3:
                        presentItem.sss(a1,a2,scanner,presentItem);
                    break;
                }
                System.out.println("Натисніть 4 щоб вийти");
            }
            if (g == 4) {
                System.exit(0);
            }
            g = s.nextInt();
        }
        while (isTrue);
    }
    public static void firstInfo(){
        System.out.println("Виберіть розмір подарунка.");
        System.out.println("Натисніть 1 щоб вибрати малий подарунок");
        System.out.println("Натисніть 2 щоб вибрати середній подарунок");
        System.out.println("Натисніть 3 щоб вибрати великий подарунок");
        System.out.println("Натисніть 4 щоб вийти");
    }
    public static void secondInfo(){
        System.out.println("Щоб додати карамель натиніть 1");
        System.out.println("Щоб додати вафлю натиніть 2");
        System.out.println("Щоб додати шоколадку натиніть 3");
    }
    public static void thirdInfo(){
        System.out.println("Щоб посортувати за вмістом цукру натиніть 1");
        System.out.println("Щоб посортувати за вагою натиніть 2");
        System.out.println("Щоб знайти за діапазони цукру натиніть 3");
    }
}


