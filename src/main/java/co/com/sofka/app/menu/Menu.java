package co.com.sofka.app.menu;

import co.com.sofka.app.calculator.BasicCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Menu {

    public void showMenu() throws Exception {

        String handleOption = "";
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        do {


            System.out.println( "Enter number:\n" +
                    "1. To sum.\n" +
                    "2. To subtract.\n" +
                    "3. To multiply.\n" +
                    "4. To divide.\n" +
                    "0. To exit.\n" );

            handleOption = bufferedReader.readLine();

        }while (options(handleOption));

    }

    private boolean options(String option) throws Exception {

        BasicCalculator basicCalculator = new BasicCalculator();

        boolean isContinue = !option.equals("0");

        if(option.equals("1")){

            System.out.println("El resultado es: " + basicCalculator.sum(requestNumber(),requestNumber()));
        }

        if(option.equals("2")){

            System.out.println("El resultado es: " + basicCalculator.subtract(requestNumber(),requestNumber()));
        }

        if(option.equals("3")){

            System.out.println("El resultado es: " + basicCalculator.multiply(requestNumber(),requestNumber()));
        }

        if(option.equals("4")){

            System.out.println("El resultado es: " + basicCalculator.divide(requestNumber(),requestNumber()));
        }

        return isContinue;
    }

    private Long requestNumber() throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number: " );
        String textNumber = bufferedReader.readLine();

        Long number = Long.valueOf( textNumber );

        return number;
    }

}
