import javax.swing.*;

public class J0080StringCompare {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Enter the First Name:- ");
        String name2 = JOptionPane.showInputDialog("Enter the second Name:- ");

        if(name1.compareTo(name2)==0)
            System.out.println("name1 equal to name2");
        else if (name1.compareTo(name2)<0)
            System.out.println("Name1 is first and Name2 is second");
        else if (name1.compareTo(name2)>0)
            System.out.println("Name2 is first and Name 1 is second");
        else
            System.out.println("invalid input");
    }
}
