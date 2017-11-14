package better.view;

import better.domain.*;
import better.service.Personnel;

import javax.jnlp.PersistenceService;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.invokeLater;


public class ViewController extends JFrame
{
    public static void main(String[] args)
    {
        Personnel.getInstance().ajouterEmploye(new Vendeur("Pierre", "Business", "45", "1995", 30000));
        Personnel.getInstance().ajouterEmploye(new Representant("Léon", "Vendtout", "25", "2001", 20000));
        Personnel.getInstance().ajouterEmploye(new Technicien("Yves", "Bosseur", "28", "1998", 1000));
        Personnel.getInstance().ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", "32", "1998", 45));
        Personnel.getInstance().ajouterEmploye(new TechnARisque("Jean", "Flippe", "28", "2000", 1000));
        Personnel.getInstance().ajouterEmploye(new ManutARisque("Al", "Abordage", "30","2001", 45));

        invokeLater(ViewController::run);
    }

    private static void run()
    {
        ViewController frame = new ViewController();
        frame.getContentPane().add(new HomeView(frame));
        //frame.pack();
        frame.setSize(800, 300);
        frame.setVisible(true);
    }

    public void displayMenu(ActionEvent actionEvent)
    {
        this.getContentPane().removeAll();
        this.getContentPane().add(new HomeView(this));
        //this.pack();
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
