package gui;

import model.MaritalStatus;

import javax.swing.*;
import java.awt.*;

public class DropDownList extends JPanel {

  private JComboBox<Object> dropDownList;

  /**
   * Recibe la etiqueta que tendra el panel y las opciones que puede seleccionar el usuario como un arreglo de String
   * @param label
   * @param options
   */
  public DropDownList(String label, Object[] options){

    setLayout(new FlowLayout());

    JLabel listLabel = new JLabel(label);
    add(listLabel);

    dropDownList = new JComboBox<>(options);
    add(dropDownList);
  }

  /**
   * Obtiene el item seleccionado por el usuario.
   * Se parsea al Enum MaritalStatus correspondiente.
   * @return
   */
  public MaritalStatus getSelection(){
    return (MaritalStatus) this.dropDownList.getSelectedItem();
  }

}
