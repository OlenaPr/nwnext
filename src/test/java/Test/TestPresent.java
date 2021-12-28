package Test;

import command.ActionsRunner;
import command.PresentItem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import present.Waffles;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import present.Waffles;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



public class TestPresent {
    private static final Logger Log = (Logger) LogManager.getLogger(TestPresent.class);

    @Test
    public void testPrAdd() throws Exception{
        PresentItem presentItem = new PresentItem();
        presentItem.addSweetsToList(new Waffles(45,67));
        presentItem.findPresentWeight();
        int n = (int) presentItem.getPresentWeight();
        Assert.assertEquals(45,n);
    }
    @Test
    public void testPrAdd2() throws Exception{


       try {
           PresentItem presentItem = new PresentItem();
           presentItem.addSweetsToList(new Waffles(45, 67));
           presentItem.findPresentSugar();
           int n = (int) presentItem.getPresentSugar();
           Assert.assertEquals(67, n);
           Log.info("Test is doing great");
       }catch(Exception e){
           Log.info("Test problem");
       }
    }
    @Test
    public void testPrfindW() throws Exception{
        try {
            PresentItem presentItem = new PresentItem();
            presentItem.addSweetsToList(new Waffles(45, 67));
            presentItem.addSweetsToList(new Waffles(45, 67));
            presentItem.findPresentWeight();
            int n = (int) presentItem.getPresentWeight();
            Assert.assertEquals(90, n);
        }catch (Exception e){
            Log.info("Test problem");
        }
    }
    @Test
    public void testPrfindS() throws Exception{
        try{
        PresentItem presentItem = new PresentItem();
        presentItem.addSweetsToList(new Waffles(45,67));
        presentItem.addSweetsToList(new Waffles(45,67));
        presentItem.findPresentSugar();
        int n = (int) presentItem.getPresentSugar();
        Assert.assertEquals(134,n);
        }catch (Exception e){
            Log.info("Test problem");
        }
    }
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }
//    @Test
//    public void testPrselect() throws Exception{
//        PresentItem presentItem = new PresentItem();
//        presentItem.addSweetsToList(new Waffles(45,11));
//        presentItem.addSweetsToList(new Waffles(45,67));
//        presentItem.selectBySugar(10,15);
//        Assert.assertEquals("\n" +
//                "After sort:\n" + "Waffles-  weightSweets=45, sugarSweets=11\n" +
//                "\n", output.toString());
//    }
    @Test
    public void testPrSortS() throws Exception{
        PresentItem presentItem = new PresentItem();
        presentItem.addSweetsToList(new Waffles(10,67));
        presentItem.addSweetsToList(new Waffles(45,8));
        presentItem.sortBySugar();
        Assert.assertEquals("\n" +
                "After sort:\n" +
                "Waffles-  weightSweets=45, sugarSweets=8\n" +
                "\n" +
                "Waffles-  weightSweets=10, sugarSweets=67\n" +
                "\n", output.toString());}
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }





}
