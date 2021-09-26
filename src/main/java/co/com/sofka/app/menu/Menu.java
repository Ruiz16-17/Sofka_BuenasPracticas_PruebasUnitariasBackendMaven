package co.com.sofka.app.menu;

import co.com.sofka.app.calculator.BasicCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Menu {

    public void showMenu() throws IOException {

        String handleOption = "";
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        
        do {


            System.out.println( "Enter number 1: " );
            handleOption = bufferedReader.readLine();

        }while (options(handleOption));

    }

    private boolean options(String option){

        boolean isContinue = !option.equals("0");

        if(option.equals("1")){

        }

        if(option.equals("2")){

        }

        if(option.equals("3")){

        }

        if(option.equals("4")){


        }

        return isContinue;
    }



}
