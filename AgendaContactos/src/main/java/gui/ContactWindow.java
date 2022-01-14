package gui;

import model.Contact;
import model.Gender;
import model.MaritalStatus;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ContactWindow extends JFrame {

  private TextInputPanel nameInput;
  private TextInputPanel emailInput;
  private TextInputPanel countryInput;
  private RadioButtonSelector genderSelector;
  private DropDownList maritalStatusSelector;
  private AgendaWindow previousFrame;

  public ContactWindow(AgendaWindow previousFrame) {
    this.previousFrame = previousFrame;
    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

    addInputPanels();

    addButtonPanel();

    setDefaultProperties();
  }

  /**
   * Agrega todos los botones al JPanel llamada buttonsPanel
   */
  private void addButtonPanel() {
    JPanel buttonsPanel = new JPanel(new FlowLayout());
    add(buttonsPanel);

    JButton addButton = new JButton("Agregar");
    addButton.addActionListener(e -> createContact());
    buttonsPanel.add(addButton);

    JButton cancelButton = new JButton("Cancelar");
    cancelButton.addActionListener(e -> returnToLastFrame());
    buttonsPanel.add(cancelButton);
  }

  /**
   * Agrega todos los inputs al JFrame
   */
  private void addInputPanels() {
    nameInput = new TextInputPanel("Nombre: ");
    add(nameInput);

    emailInput = new TextInputPanel("Email: ");
    add(emailInput);

    countryInput = new TextInputPanel("Pais: ");
    add(countryInput);

    genderSelector = new RadioButtonSelector("Genero: ", new String[]{"Hombre", "Mujer", "No binario"});
    add(genderSelector);

    maritalStatusSelector = new DropDownList("Estado Civil: ", MaritalStatus.values());
    add(maritalStatusSelector);
  }

  /**
   * Vuelve a la ventana anterior
   */
  private void returnToLastFrame() {
    this.previousFrame.setVisible(true);
    this.setVisible(false);
  }

  /**
   * Comprueba que los inputs de texto se hayan rellenado
   * @return
   */
  private boolean areInputsFilled() {
    if (nameInput.getValue().length() == 0 ||
        emailInput.getValue().length() == 0 ||
        countryInput.getValue().length() == 0) {
      JOptionPane.showMessageDialog(null,
          "Por favor ingresa todos los datos solicitados",
          "Error", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    return true;
  }

  /**
   * Crea un nuevo objeto de tipo Contact con los datos ingresados por el usuario y
   * lo agrega al TableModel de la ventana AgendaWindow
   */
  private void createContact() {
    if (!areInputsFilled()) {
      return;
    }
    System.out.println(emailInput.getValue());
    Contact aux = new Contact(
        nameInput.getValue(),
        emailInput.getValue(),
        countryInput.getValue(),
        Gender.enumOf(genderSelector.getSelection()),
        maritalStatusSelector.getSelection()
    );
    this.previousFrame.getModel().addRow(aux.toTableRow());
    returnToLastFrame();
  }

  private void setDefaultProperties() {
    setSize(800, 500);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
}
