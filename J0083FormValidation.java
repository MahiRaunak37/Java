import javax.swing.*;

public class J0083FormValidation {
    public static void main(String[] args) {
        String input;
        int number;
        int count=0;
        boolean check = true;

        input = JOptionPane.showInputDialog("Enter the number between 1 to 100");
        number = Integer.parseInt(input);

        while((number < 1 || number > 100) && check)
        {
            JOptionPane.showMessageDialog(null,"This is not Valid input");
            input = JOptionPane.showInputDialog("Enter the number between 1 to 100");
            number = Integer.parseInt(input);
            count++;
            if(count<3)
                check = true;
            else
                check = false;
            
        }
        JOptionPane.showMessageDialog(null,"Valid Input");
    }
}
