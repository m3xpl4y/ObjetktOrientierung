package at.maximilian.FotoApparat.classes;

import java.util.Scanner;

public class InputScanner {
    protected Scanner stringSC = new Scanner(System.in);
    protected Scanner intSC = new Scanner(System.in);
    protected Scanner doubleSC = new Scanner(System.in);

    public InputScanner() {
    }

    public String inputString(String word)
    {
        word = stringSC.nextLine();
        return word;
    }
    public int inputInt(int number)
    {
        number = intSC.nextInt();
        return number;
    }
    public double inputDouble(double dNumber)
    {
        dNumber = doubleSC.nextDouble();
        return dNumber;
    }
}
