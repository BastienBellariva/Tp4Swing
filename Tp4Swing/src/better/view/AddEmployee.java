/*
*
* This class :
* - permit to create employee
* - manage the form for insert employee in array
* - is the view for add employee
*
*/

package better.view;

import better.domain.*;
import better.service.Personnel;

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

    private JButton btnCancel;
    private JButton btnAddEmployee;

    //Assembly and formatting
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
        comboTypeEmployee();
        add(comboType);

        //Form part with button
        btnCancel = new JButton("Retour Menu");
        btnAddEmployee = new JButton("Ajouter");
        add(btnCancel);
        add(btnAddEmployee);

        //Actions button on click
        btnCancel.addActionListener(viewController::displayMenu); //Return to menu
        btnAddEmployee.addActionListener(e -> insertEmployeeInArray()); //Insert informations in array's employee
        btnAddEmployee.addActionListener(viewController::displayAdd); //Refresh panel add employee
    }

    //Add employee in array
    private void insertEmployeeInArray()
    {
        //Recovery of values
        String valueFirstName = firstName.getValue();
        String valueLastName = lastName.getValue();
        String valueAge = age.getValue();
        String valueEnterDate = enterDate.getValue();
        String valueSalaryParam = salaryParam.getValue();

        //Switch for select the right constructor (not the best method but it's work)
        switch (comboType.getSelectedItem().toString())
        {
            case "Vendeur":
                Personnel.getInstance().ajouterEmploye(new Vendeur(valueFirstName, valueLastName, valueAge, valueEnterDate, Double.parseDouble(valueSalaryParam)));
                break;

            case "Représentant":
                Personnel.getInstance().ajouterEmploye(new Representant(valueFirstName, valueLastName, valueAge, valueEnterDate, Double.parseDouble(valueSalaryParam)));
                break;

            case "Technicien":
                Personnel.getInstance().ajouterEmploye(new Technicien(valueFirstName, valueLastName, valueAge, valueEnterDate, Integer.parseInt(valueSalaryParam)));
                break;

            case "Manutentionnaire":
                Personnel.getInstance().ajouterEmploye(new Manutentionnaire(valueFirstName, valueLastName, valueAge, valueEnterDate, Integer.parseInt(valueSalaryParam)));
                break;

            case "Technicien à risque":
                Personnel.getInstance().ajouterEmploye(new TechnARisque(valueFirstName, valueLastName, valueAge, valueEnterDate, Integer.parseInt(valueSalaryParam)));
                break;
        }
    }

    //Implement ComboBox for form
    private void comboTypeEmployee()
    {
        //Declaration and initializing comboBox
        comboType = new JComboBox();
        comboType.addItem("Vendeur");
        comboType.addItem("Répresentant");
        comboType.addItem("Technien");
        comboType.addItem("Manutentionnaire");
        comboType.addItem("Technicien à risque");
        comboType.setMaximumSize(new Dimension(200,20));

        labelType = new JLabel("Type d'employé"); //Label declaration

        //Viewing
        this.add(labelType);
        this.add(comboType);
    }
}

