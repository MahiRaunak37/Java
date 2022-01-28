import javax.swing.*;                       //importing the swing

public class J0078JOptionClass {
    public static void main(String[] args) {
        String name;                    //creating a string variable
        String surname;

        name = JOptionPane.showInputDialog("Please enter your name:- ");        //input dialog box in JOptionPane
        surname = JOptionPane.showInputDialog("Please enter your surname:- ");
        JOptionPane.showMessageDialog(null,name + " " + surname);   //output dialog box in JOptionPane

        int num1,num2;          //creating a variable of data type integer
        String input;           //creating a variable of data type String
        input = JOptionPane.showInputDialog("please Enter the 1st integer:- ");
        num1 = Integer.parseInt(input);             //taking phaseInt() from Integer Wrapper class it convert integer value from string
                                                    //also for the float value    num (float) = Float.parseFloat(input)
        input = JOptionPane.showInputDialog("please Enter the 2nd integer:- ");
        num2 = Integer.parseInt(input);

        double avg = (num1+num2)/2.0;           //2.0 is use to convert the number to the double value
        JOptionPane.showMessageDialog(null," "+avg);


    }
}
