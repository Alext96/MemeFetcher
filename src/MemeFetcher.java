import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class MemeFetcher {

    public static void main(String[] args) throws AWTException, IOException, URISyntaxException {

       FetchPicture();

    }



    /*public static void checkDomain() throws URISyntaxException, IOException, AWTException {

        //Scanner scanner = new Scanner(System.in);

        Robot robot = new Robot();

        FileReader file = new FileReader("E:\\AMAZON KDP\\Tempdomain.txt");
        BufferedReader reader = new BufferedReader(file);
        String text = "";
        String line;
        line = reader.readLine();

        if (line != null) {
            line = reader.readLine();
            //line = scanner.nextLine();
            switch (text){
                case "https://www.g":
                    break;
                default:
                    robot.delay(100);
                    robot.mouseMove(583, 44);
                    robot.delay(100);
                    robot.mousePress(InputEvent.BUTTON1_MASK); //leftclick
                    robot.delay(100);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.delay(4000);
                    break;
        }


        }
    }*/

    private static void FetchPicture() throws AWTException, IOException, URISyntaxException {

        Robot robot = new Robot();

        int numberOfPictures = 0;

        while (numberOfPictures <= 100) {

            robot.mouseMove(471, 658);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            //rightclick
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);;
            robot.delay(100);
            //leftclick
            robot.mouseMove(637, 1107);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(1500);

            //enter
           robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            //EXIT POPUP SHIT
            robot.delay(100);
            robot.mouseMove(583, 44);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_MASK); //leftclick
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(100);

            /*//check domain name
            robot.mouseMove(354, 89);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_MASK); //leftclick
            robot.delay(100);
            robot.mouseMove(183, 92);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(100);

            //COPY CURL
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_C);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_C);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(100);

            //MOVE TO NOTEPAD
            robot.mouseMove(1994, 865);
            robot.delay(100);

            //CLICK ON NOTEPAD
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(100);

            //PASTE INTO NOTEPAD
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(100);

            //PRESS ENTER
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            //SAVE NOTEPAD FILE
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_S);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_S);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(1000);

            //CHECK FOR DOMAIN
            checkDomain();

            //MOVE BACK TO BROWSER
            robot.mouseMove(1021, 31);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(100);*/


            //right arrow key
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_RIGHT);
            robot.delay(100);

            numberOfPictures++;
        }



        }



    }

