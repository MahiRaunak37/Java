import javax.swing.*;

public class J0082CharAt {
    public static void main(String[] args) {
        char letter;
        String input;
        input = JOptionPane.showInputDialog("Enter the String ");
        for (int i=0;i< input.length();i++)
        {
            letter = input.charAt(i);
            System.out.println(letter);
        }
    }
}
