package ventanas;


import modelo.Tarea;
import modelo.TareaSingleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TareaInputPanel extends JPanel implements ActionListener {

  JTextField tareaInput;
  JButton ingresarTareaButton;
  VentanaPrincipal principal;

  public TareaInputPanel(VentanaPrincipal principal) {
    this.principal = principal;
    // Define el LayoutManager del JPanel
    setLayout(new FlowLayout());

    // Instanciacion y agregacion de los componentes al JPanel
    JLabel tareaLabel = new JLabel("Ingresa una tarea: ");
    add(tareaLabel);

    tareaInput = new JTextField(25);
    add(tareaInput);

    ingresarTareaButton = new JButton("Ok");
    add(ingresarTareaButton);
    // Define metodo a llamar cuando se active una accion de este componente
    ingresarTareaButton.addActionListener(this);
  }

  // Implementacion de la interfaz ActionListener
  @Override
  public void actionPerformed(ActionEvent e) {
    Tarea tarea = new Tarea(tareaInput.getText());
    ArrayList<Tarea> tareas = TareaSingleton.getInstance().getTareas();
    tareas.add(tarea);

    this.principal.actualizarLista();
  }
}
