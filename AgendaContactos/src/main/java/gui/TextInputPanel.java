package gui;

import javax.swing.*;
import java.awt.*;

public class TextInputPanel extends JPanel {

  private JTextField textField;

  public TextInputPanel(String label){
    setLayout(new FlowLayout());

    JLabel fieldLabel = new JLabel(label);
    add(fieldLabel);

    textField = new JTextField(20);
    add(textField);
  }

  public String getValue(){
    return this.textField.getText();
  }
}
