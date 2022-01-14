package data;

import model.Contact;
import model.Gender;
import model.MaritalStatus;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {


  /**
   * Comprueba si el archivo existe
   * @param file
   * @return
   */
  public static boolean isFileEmpty(File file){
    if (!file.exists()) return false;
    return file.length() == 0;
  }

  /**
   * Crea el archivo en la ruta que representa el objeto pasado como parametro
   * @param file
   * @return
   */
  public static boolean createFile(File file){
    try {
      return file.createNewFile();
    } catch (IOException e) {
      return false;
    }
  }

  /**
   * Lee el archivo especificado en la ruta representada por el objeto *file* y transforma
   * cada linea a un objeto de tipo Contact.
   * Devuelve un arreglo con todos los objetos credos
   * @param file
   * @return
   */
  public static ArrayList<Contact> readFileToContacts(File file){
    ArrayList<Contact> contacts = new ArrayList<>();
    try {
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String row = myReader.nextLine();
        Contact aux = FileManager.parseRowToContact(row);
        contacts.add(aux);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("El archivo no existe");
      JOptionPane.showMessageDialog(null, "El archivo ingresado no existe");
      e.printStackTrace();
    }
    return contacts;
  }

  /**
   * Recive un Sting con los datos de un contacto separados por "," y crea un nuevo objeto de tipo
   * Contact.
   * El string debe contener los datos en el orden especificado en la guia.
   * @param row
   * @return
   */
  private static Contact parseRowToContact(String row){
    String[] fields = row.split(",");
    return new Contact(
        Long.parseLong(fields[0]),
        fields[1],
        fields[2],
        fields[3],
        Gender.enumOf(fields[4]),
        MaritalStatus.enumOf(fields[5])
    );
  }
}
