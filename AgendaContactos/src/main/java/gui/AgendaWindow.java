package gui;

import data.FileManager;
import model.Contact;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.tools.Diagnostic;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.util.ArrayList;

public class AgendaWindow extends JFrame {
  private File file;
  private JPanel tablePanel;
  private JPanel buttonPanel;
  private JTable table;
  private DefaultTableModel model;
  private ContactWindow contactWindow;

  public AgendaWindow(){
    // Se obtiene el archivo con los datos de los contactos
    this.file = FileChooserDialog.chooseFile(JFileChooser.OPEN_DIALOG);

    // Se le asigna BoxLayout al JFrame
    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

    this.contactWindow = new ContactWindow(this);

    this.tablePanel = new JPanel(new FlowLayout());
    add(tablePanel);
    addTablePanelComponents();

    this.buttonPanel = new JPanel(new FlowLayout());
    add(buttonPanel);
    addButtonComponents();


    setDefaultProperties();
  }

  /**
   * Agrega los botones al JPanel llamado buttonPanel
   */
  private void addButtonComponents(){
    JButton addContactButton = new JButton("Agrear Contacto");

    // Nueva forma de agregar un ActionListener

    // Se debe seguir la siguiente nomenclatura:
    // addActionListener(nombre_del_parametro -> metodo_a_ejecutar())
    // el metodo a ejecutar puede recivir parametros EJ: addContact(this.button);
    addContactButton.addActionListener(e -> addContact());
    this.buttonPanel.add(addContactButton);

    JButton terminateProgramButton = new JButton("Cerrar");
    terminateProgramButton.addActionListener(e -> terminateProgram());
    this.buttonPanel.add(terminateProgramButton);
  }

  private void terminateProgram(){
    System.exit(0);
  }

  private void addContact(){
//    ContactWindow contactWindow = new ContactWindow(this);

    contactWindow.setVisible(true);
    this.setVisible(false);
  }

  public DefaultTableModel getModel() {
    return model;
  }

  /**
   * Agrega los contactos como nuevas filas a la tabla
   * A nivel de codigo los contactos se agregan al TableModel que
   * muestra la tabla y no al JTable creado
   */
  private void populateTable(){
    ArrayList<Contact> contacts = FileManager.readFileToContacts(this.file);
    for(Contact contact : contacts){
      this.model.addRow(contact.toTableRow());
    }
  }

  /**
   * Crea el compoenente JTable con su respectivo TableModel
   */
  private void addTablePanelComponents(){
    this.model = new DefaultTableModel();
    model.addColumn("Id");
    model.addColumn("Nombre");
    model.addColumn("Correo");
    model.addColumn("Ciudad");
    model.addColumn("Genero");
    model.addColumn("Estado Civil");

    this.table = new JTable(model);

    JScrollPane jScrollPane = new JScrollPane(this.table);
    this.tablePanel.add(jScrollPane);

    this.populateTable();
  }

  /**
   * Define propiedades por defecto de el JFrame
   */
  private void setDefaultProperties(){
    setSize(800,500);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

}
