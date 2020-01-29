package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleDotComGame {
    public static void main(String[] args) throws IOException {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random()*5);
        int [] locations = {randomNum,randomNum+1,randomNum+2};
        dot.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive){
            String guess = helper.getUserInput("Введите число: ");
            String result = dot.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + "попыток(и)" );
            }
        }

    }
}
