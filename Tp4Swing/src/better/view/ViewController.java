package better.view;

import static javax.swing.SwingUtilities.invokeLater;

public class ViewController
{
    public static void viewController()
    {
        HomeView menu = new HomeView();
        menu.affichageMenu();
    }

}
