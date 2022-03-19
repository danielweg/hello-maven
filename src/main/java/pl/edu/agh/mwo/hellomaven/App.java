package pl.edu.agh.mwo.hellomaven;

/**
 * Simple main application.
 */
public class App {

    public static final int FAIR_NUMBER = 4;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        return FAIR_NUMBER;
    }
}
