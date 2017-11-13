package better.view;

import javax.swing.*;
import java.awt.*;
import static javax.swing.SwingUtilities.invokeLater;

public class VisualiseEmployee
{
    /*public static void main(String[] args)
    {
        invokeLater(VisualiseEmployee::visuEmployee);
    }*/

    public void visuEmployee()
    {
        JFrame visuFrame= new JFrame("Visualize Frame");
        visuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable visuTable = new JTable(new Object[][]
        {
                {"Arthur", "Daniel", "10", "Etudiant", "2000"}

        }, new java.lang.String[]{"Nom", "Prénom", "Age", "Profession", "Salaire"});

        visuFrame.getContentPane().setLayout(new FlowLayout());
        visuFrame.getContentPane().add(new JScrollPane(visuTable));

        visuFrame.pack();
        visuFrame.setVisible(true);
    }
}
