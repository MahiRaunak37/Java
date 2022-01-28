import javax.swing.*;
public class J0079JOptionIfElse {
    public static void main(String[] args) {
        int n;
        String str;
        str = JOptionPane.showInputDialog("Please enter the number:- ");
        n = Integer.parseInt(str);
        if(n%2==0)
            JOptionPane.showMessageDialog(null,"Even Number");
        else
            JOptionPane.showMessageDialog(null,"Odd Number");
    }
}
