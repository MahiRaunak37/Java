import javax.swing.*;

public class J0081SwitchStatement {
    public static void main(String[] args) {
        int number;
        String input;
        input = JOptionPane.showInputDialog("Enter any Numbers b/w 1-7 ");
        number = Integer.parseInt(input);
        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"Sunday");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Monday");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Tuesday");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Wednesday");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Thursday");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Friday");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Saturday");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid Input");
        }
    }
}
