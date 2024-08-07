package guiseimggraficos.caixadedialogo;

import javax.swing.*;

public class NameDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is yot name?");

        String message = String.format("Welcome, %s, to Java Programing!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
