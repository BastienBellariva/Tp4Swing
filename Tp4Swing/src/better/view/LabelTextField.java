/*
*
* This class :
* - permit to generate text field with label
* - is a good solution to not writing a lot of line only for a form.
*
 */

package better.view;

import javax.swing.*;
import java.awt.*;

public class LabelTextField extends JPanel
{
    private JTextField textField;
    private JLabel label;

    public LabelTextField(String myLabel)
    {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));//Permit to return in the line for all new text field

        label = new JLabel(myLabel);
        add(label);

        textField = new JTextField();
        setMaximumSize(new Dimension(200, 20));
        add(textField);
    }

    //Essential for using value in text field
    public String getValue()
    {
        return textField.getText();
    }
}
