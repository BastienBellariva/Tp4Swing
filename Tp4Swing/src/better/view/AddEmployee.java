package better.view;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JPanel
{
    private ViewController viewController;

    private LabelTextField firstName;
    private LabelTextField lastName;
    private LabelTextField age;
    private LabelTextField enterDate;
    private LabelTextField salaryParam;

    private JComboBox comboType;
    private JLabel labelType;

    //Assemblage et mise en forme
    public AddEmployee(ViewController viewController)
    {
        super();

        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(boxLayout);

        this.viewController = viewController;

        //Form part with label and field text
        firstName = new LabelTextField("Prénom");
        add(firstName);

        lastName = new LabelTextField("Nom");
        add(lastName);

        age = new LabelTextField("Age");
        add(age);

        enterDate = new LabelTextField("Date d'entrée");
        add(enterDate);

        salaryParam = new LabelTextField("Paramètre du salarié");
        add(salaryParam);

        //Form part with combo box
        this.comboTypeEmployee();

    }

    //Méthode pour implémenter le comboBox "Type d'employé"
    private void comboTypeEmployee()
    {
        //Déclaration et initialisation du comboBox
        comboType = new JComboBox();
        comboType.addItem("Vendeur");
        comboType.addItem("Répresentant");
        comboType.addItem("Technien");
        comboType.addItem("Manutentionnaire");
        comboType.addItem("Technicien à risque");
        comboType.setMaximumSize(new Dimension(200,20));

        labelType = new JLabel("Type d'employé"); //Déclaration du label

        //Affichage
        this.add(labelType);
        this.add(comboType);
    }
}
