import consoleApp.WeatherDataAppGUI;

import javax.swing.*;
import java.text.ParseException;

public class Main {


    public static void main(String args[]) throws ParseException {


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WeatherDataAppGUI app = new WeatherDataAppGUI();
                app.display();
            }
        });

    }}
