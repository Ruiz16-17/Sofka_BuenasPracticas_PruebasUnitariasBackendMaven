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

        Menu menu = new Menu();
        menu.showMenu();
    }
}
