package better.view;

import javax.swing.*;
import java.awt.*;

public class LabelTextField extends JPanel
{
    private JTextField textField;
    private JLabel label;

    public LabelTextField(String myLabel)
    {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        label = new JLabel(myLabel);
        add(label);

        textField = new JTextField();
        setMaximumSize(new Dimension(200, 20));
        add(textField);
    }

    public String getValue()
    {
        return textField.getText();
    }
}
