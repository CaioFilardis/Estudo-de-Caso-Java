package jogodeazar;

import java.security.SecureRandom;

public class Craps {

    // criando gerador de numeros aleatórios
    private static final SecureRandom randomNumbers = new SecureRandom();

    // ENUM (constantes que representam estado do objeto)
    private enum Status{CONTINUE, WON, LOST};

    // constantes, lançamentos de dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;

        Status gameStatus;
       // int sumOfDice = rollDice();
    }

}
