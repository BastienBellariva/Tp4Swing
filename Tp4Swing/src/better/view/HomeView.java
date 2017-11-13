package better.view;

import javax.swing.*;

import java.awt.*;

import static javax.swing.SwingUtilities.invokeLater;

public class HomeView
{
    public static void main(String[] args)
    {
        invokeLater(HomeView::affichageMenu);
    }
    

    public static void affichageMenu()
    {
        //Initialize and configure the frame HomeView
        JFrame homeFrame = new JFrame("Home");
        homeFrame.setSize(new Dimension(600,450)); //Frame Size
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Initialize and configure the Panel HomeView
        JPanel homePanel = new JPanel(new BorderLayout());
        homePanel.setPreferredSize(new Dimension(200, 150)); //Panel Size
        homePanel.setBackground(Color.black);

        //Initialize button for add employee
        JButton buttonAddEmployee = new JButton("Add an employee");
        buttonAddEmployee.addActionListener(e -> System.out.println("buttonAddEmployee"));

        //Initialize and configure button for visualise employee
        JButton buttonVisuEmployee = new JButton("Visualise employee(s)");
        buttonVisuEmployee.addActionListener(e -> System.out.println("buttonVisuEmployee"));

        //Add panel on frame and set his position
        homeFrame.getContentPane().setLayout(new FlowLayout());
        homeFrame.getContentPane().add(homePanel, BorderLayout.CENTER);

        //Add buttons on panel and set their position
        homePanel.add(buttonAddEmployee, BorderLayout.SOUTH); //Button add position
        homePanel.add(buttonVisuEmployee, BorderLayout.NORTH); //Button visu position

        homeFrame.setVisible(true);

    }
}
