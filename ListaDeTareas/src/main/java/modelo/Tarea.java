package modelo;

import java.time.LocalDateTime;

public class Tarea {

  private String titulo;
  private LocalDateTime fechaCreacion;
  private boolean estaTerminada;

  public Tarea(String titulo) {
    this.titulo = titulo;
    this.fechaCreacion = LocalDateTime.now();
    this.estaTerminada = false;
  }

  public Tarea(String titulo, LocalDateTime fechaCreacion, boolean estaTerminada) {
    this.titulo = titulo;
    this.fechaCreacion = fechaCreacion;
    this.estaTerminada = estaTerminada;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public LocalDateTime getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(LocalDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public boolean isEstaTerminada() {
    return estaTerminada;
  }

  public void setEstaTerminada(boolean estaTerminada) {
    this.estaTerminada = estaTerminada;
  }

  @Override
  public String toString() {
    return "Tarea{" +
        "titulo='" + titulo + '\'' +
        ", fechaCreacion=" + fechaCreacion +
        ", estaTerminada=" + estaTerminada +
        '}';
  }

}
