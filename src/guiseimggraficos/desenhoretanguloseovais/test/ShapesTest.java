package guiseimggraficos.desenhoretanguloseovais.test;

import guiseimggraficos.desenhoretanguloseovais.domin.Shapes;

import javax.swing.*;

public class ShapesTest {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw reactangles\n" + "Enter 2 to draw ovals");

        int choice = Integer.parseInt(input);

        Shapes painel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(painel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
