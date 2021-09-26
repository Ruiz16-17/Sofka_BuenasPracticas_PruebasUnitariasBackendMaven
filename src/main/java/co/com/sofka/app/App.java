package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import co.com.sofka.app.menu.Menu;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        /*BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();
        Long result = calculator.sum( number1, number2 );

        System.out.println( number1 + " + " + number2 + " = " + result );

        System.out.println( "Enter number 1: " );
        String textNumber3 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber4 = bufferedReader.readLine();

        float number3 = Float.parseFloat( textNumber3 );
        float number4 = Float.parseFloat( textNumber4 );

        float result2 = calculator.divide( number3, number4 );

        System.out.println( number3 + " + " + number4 + " = " + result2 );*/
        Menu menu = new Menu();
        menu.showMenu();
    }
}
