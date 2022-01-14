package gui;

import javax.swing.*;
import java.awt.*;

public class RadioButtonSelector extends JPanel {

  // ButtonGroup se utiliza para asegurar que solo uno de los JRadioButton este selccionado
  // y obtener el que se haya seleccionado
  private ButtonGroup btnGroup;

  /**
   * Recibe la etiqueta que tendra el panel y las opciones que puede seleccionar el usuario
   * @param label
   * @param options
   */
  public RadioButtonSelector(String label, String[] options){
    setLayout(new FlowLayout());

    JLabel labelGroup = new JLabel(label);
    add(labelGroup);

    btnGroup = new ButtonGroup();
    addRadioButtons(options);
  }

  /**
   * Crea un nuevo JRadioButton por cada elemento del array de opciones y los agrega al
   * ButtonGroup
   * @param options
   */
  private void addRadioButtons(String[] options){
    JPanel buttonsPanel = new JPanel(new FlowLayout());
    add(buttonsPanel);

    for(String option : options){
      JRadioButton button = new JRadioButton(option);
      button.setActionCommand(option);
      button.setSelected(true);
      buttonsPanel.add(button);
      btnGroup.add(button);
    }

  }

  /**
   * Obtiene el item seleccionado por el usuario
   * @return
   */
  public String getSelection(){
    return this.btnGroup.getSelection().getActionCommand();
  }

}
