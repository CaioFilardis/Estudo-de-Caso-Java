package guiseimggraficos.desenhoretanguloseovais.domin;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

    private int choice; // escolha do usuário

    // construtor
    public Shapes(int userChoice) {
        this.choice = userChoice;
    }

    // metodo
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for (int i = 1; i < 10; i++) {
            switch (this.choice) {
                case 1 -> {
                    graphics.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                }
                case 2 -> {
                    graphics.drawOval(10 + i * 10, 10 +i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                }
            }
        }
    }
}
