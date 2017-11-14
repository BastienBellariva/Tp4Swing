package better.view;

import javax.swing.*;

public class VisuEmployee extends JPanel
{
    private ViewController viewController;
    private JPanel contentPane;
    private JTable visuTable;
    private JButton btnBackToMenu;

    public VisuEmployee(ViewController viewController)
    {
        super();
        this.viewController = viewController;

        visuTable = new JTable(new Object[][]
        {
                {"Arthur", "Daniel", "10", "Etudiant", "2000"}

        }, new java.lang.String[]{"Nom", "Prénom", "Age", "Profession", "Salaire"});

        btnBackToMenu = new JButton("backMenu");

        add(visuTable);
        add(btnBackToMenu);

        btnBackToMenu.addActionListener(viewController::displayMenu);
    }
}
