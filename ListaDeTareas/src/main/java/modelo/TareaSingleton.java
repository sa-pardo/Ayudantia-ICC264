package modelo;

import java.util.ArrayList;

public class TareaSingleton {

  // Atributo de clase
  private static TareaSingleton singleton;

  // Atributo de instancia
  private ArrayList<Tarea> tareas;

  // Constructor privado para asegurar que nadie fuera de esta clase
  // pueda crear nuevas instancias de esta clase.
  private TareaSingleton(){
    this.tareas = new ArrayList<>();
  }

  // Metodo de clase que devuelve la instancia unica (singleton)
  public static TareaSingleton getInstance(){
    if (singleton == null) {
      singleton = new TareaSingleton();
    }
    return singleton;
  }

  // Metodo de la instancia que devuelve el atributo de instancia
  public ArrayList<Tarea> getTareas(){
    return this.tareas;
  }
}
