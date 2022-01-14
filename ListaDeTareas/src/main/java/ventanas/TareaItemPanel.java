package ventanas;

import modelo.Tarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareaItemPanel extends JPanel {

  private JCheckBox tareaCheckbox;
  private VentanaPrincipal principal;

  public TareaItemPanel(VentanaPrincipal principal, Tarea tarea) {
    this.principal = principal;
    // Define el LayoutManager del JPanel
    setLayout(new FlowLayout());

    // Instanciacion y agregacion de los componentes al JPanel
    tareaCheckbox = new JCheckBox();
    tareaCheckbox.setSelected(tarea.isEstaTerminada());
    add(tareaCheckbox);

    // Se define el metodo a llamar cuando se active alguna accion del componente tareaCheckbox

    // En este caso no se implementa la interfaz ActionListener a nivel de clase, sino que se declara
    // dentro del llamado al metodo addActionListener().
    // Se hace esta implementacion porque se requiere pasar distintos parametros al metodo que se va a llamar
    tareaCheckbox.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        cambiarEstadoTarea(tarea);
      }
    });

    // Dependiendo del estado de la tarea el JLabel tendra uno u otro texto
    JLabel tareaLabel = new JLabel();
    if(tarea.isEstaTerminada()){
      tareaLabel.setText("<html><span style='text-decoration: line-through;'>"+tarea.getTitulo()+"</span></html>");
    }else{
      tareaLabel.setText(tarea.getTitulo());
    }
    add(tareaLabel);
  }

  private void cambiarEstadoTarea(Tarea tarea) {
    tarea.setEstaTerminada(!tarea.isEstaTerminada());
    this.principal.actualizarLista();
  }
}
