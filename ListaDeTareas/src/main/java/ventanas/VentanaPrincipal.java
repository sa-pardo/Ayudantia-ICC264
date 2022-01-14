package ventanas;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

  private TareaInputPanel inputPanel;
  private ListaTareasPanel listaPanel;

  public VentanaPrincipal(){
    // Define el LayoutManager del JFrame
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

    // Se crean los paneles que componen la ventana y
    // se agregan al JFrame
    inputPanel = new TareaInputPanel(this);
    add(inputPanel);
    listaPanel = new ListaTareasPanel(this);
    add(listaPanel);

    // Define el tamaño de la ventana
    setSize(500,300);
    // Con esta linea la ventana se centra respecto de la pantalla donde se ejecuta el programa
    setLocationRelativeTo(null);
    setTitle("Paina principal");
    // Define que al cerrar la ventana se termine la ejecucion del programa
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  // Actualiza la visualizacion de la interfaz
  public void actualizarLista(){
    // Se elimina el componente listaPanel y se crea uno nuevo para forzar la actualizacion de la interfaz
    this.remove(listaPanel);
    this.listaPanel = new ListaTareasPanel(this);
    add(listaPanel);

    // Actualiza la UI del componente listaPanel
    this.listaPanel.updateUI();
  }

}
