import javax.swing.*;
import java.awt.event.*;

class Calculator extends WindowAdapter
{
    public JFrame mainframe;
    public JButton b1,b2,b3,b4;

    public Calculator(int width, int height, String Title)
    {
        mainframe = new JFrame(Title);
        mainframe.setSize(width,height);
        mainframe.setVisible(true);

        mainframe.addWindowListener(this);

        b1  = new JButton("Add");
        b2  = new JButton("Sub");
        b3  = new JButton("Mult");
        b4  = new JButton("Div");

        b1.setBounds(1,80,50,20);
        b2.setBounds(90,80,50,20);
        b3.setBounds(180,80,50,20);
        b4.setBounds(290,280,80,40);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);

    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}

class MarvellousCalculator
{
    public static void main(String arg[])
    {
        Calculator cobj = new Calculator(400,400,"Marvellous Calculator");
    }
}