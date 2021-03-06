/*
*
* This class :
* - permit to visualise all employee save in array
*
 */

package better.view;

import better.service.Personnel;

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

        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(boxLayout);

        //Taking array implement in class "service/Personnel.java"
        visuTable = new JTable(Personnel.getInstance().salaryArray(), new java.lang.String[]{"Nom", "Prénom", "Age", "Profession", "Salaire"});

        btnBackToMenu = new JButton("Retour Menu");

        add(btnBackToMenu);
        add(visuTable);

        btnBackToMenu.addActionListener(viewController::displayMenu); //Return to menu
    }
}
