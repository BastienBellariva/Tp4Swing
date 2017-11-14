package better.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.invokeLater;


public class ViewController extends JFrame
{
    public static void main(String[] args)
    {
        invokeLater(ViewController::run);
    }

    private static void run()
    {
        ViewController frame = new ViewController();
        frame.getContentPane().add(new HomeView(frame));
        //frame.pack();
        frame.setSize(800, 200);
        frame.setVisible(true);
    }

    public void displayMenu(ActionEvent actionEvent)
    {
        this.getContentPane().removeAll();
        this.getContentPane().add(new HomeView(this));
        this.pack();
        this.setVisible(true);
        this.revalidate();
        this.repaint();
    }

    public void displayAdd(ActionEvent actionEvent)
    {
        this.getContentPane().removeAll();
        this.getContentPane().add(new AddEmployee(this));
        //this.pack();
        this.setVisible(true);
        this.revalidate();
        this.repaint();
    }

    public void displayVisu(ActionEvent actionEvent)
    {
        this.getContentPane().removeAll();
        this.getContentPane().add(new VisuEmployee(this));
        //this.pack();
        this.setVisible(true);
        this.revalidate();
        this.repaint();
    }


}
