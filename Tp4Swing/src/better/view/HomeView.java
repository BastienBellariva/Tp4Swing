package better.view;

import javax.swing.*;

public class HomeView extends JPanel
{
    private final ViewController viewController;
    private JPanel contentPane;
    private JButton btnVisualiser;
    private JButton btnAjouter;

    public HomeView(ViewController viewController)
    {
        super();
        this.viewController = viewController;
        btnVisualiser = new JButton("Vis");
        btnAjouter = new JButton("Ajout");
        add(btnAjouter);
        add(btnVisualiser);

        btnAjouter.addActionListener(viewController::displayAdd);
        btnVisualiser.addActionListener(viewController::displayVisu);
    }
}