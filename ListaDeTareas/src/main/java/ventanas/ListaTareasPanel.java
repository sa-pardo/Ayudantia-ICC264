package ventanas;

import modelo.Tarea;
import modelo.TareaSingleton;

import javax.swing.*;
import java.util.ArrayList;

public class ListaTareasPanel extends JPanel {

  public ListaTareasPanel(VentanaPrincipal principal) {
    // Define LayoutManager del JPanel
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    // Se obtiene la lista de tareas del singleton creado;
    ArrayList<Tarea> tareas = TareaSingleton.getInstance().getTareas();

    // Por cada tarea se crea un nuevo panel de tipo TareaItemPanel y se agrega
    // al JPanel
    for (Tarea tarea : tareas) {
      TareaItemPanel tareaItem = new TareaItemPanel(principal, tarea);
      add(tareaItem);
    }
  }

}
