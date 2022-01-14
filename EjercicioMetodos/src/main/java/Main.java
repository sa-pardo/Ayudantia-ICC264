import java.util.Arrays;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    startProgram();
  }

  public static void startProgram() {
    System.out.println("Bienvenido.");
    String bounds = getArrayBounds();
    executeMenu(generateArray(bounds));
  }

  public static void executeMenu(int[] array) {
    while (true) {
      showMenu();
      int option = getMenuOption();
      validateMenu(option, array);
    }
  }

  public static int getMenuOption(){
    while(true) {
      String input = getInput("Seleccione una opcion:");
      int option = Integer.parseInt(input);
      if ( -1 < option && option < 5){
        return option;
      }
      else{
        System.out.println("Elija entre las opciones especificadas");
      }
    }
  }

  public static void validateMenu(int option, int[] array) {
    switch (option) {
      case 1 -> showArray(array);
      case 2 -> {
        System.out.print("Pares: ");
        showArray(generateEvenArray(array));
        System.out.print("Imares: ");
        showArray(generateOddArray(array));
      }
      case 3 -> {
        System.out.print("Primos: ");
        showArray(generatePrimesArray(array));
      }
      case 4 -> {
        String bounds = getArrayBounds();
        executeMenu(generateArray(bounds));
      }
      case 0 -> System.exit(0);
    }
  }

  public static String getInput(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);
    return scanner.next();
  }

  public static void showArray(int[] array) {
    System.out.println(Arrays.toString(array));
  }

  public static int[] generatePrimesArray(int[] array) {
    int[] oddArray = new int[array.length];
    int position = 0;
    for (int j : array) {
      if (isPrime(j)) {
        oddArray[position] = j;
        position++;
      }
    }
    return stripArray(oddArray);
  }

  public static int[] generateOddArray(int[] array) {
    int[] oddArray = new int[array.length];
    int position = 0;
    for (int j : array) {
      if (isOdd(j)) {
        oddArray[position] = j;
        position++;
      }
    }
    return stripArray(oddArray);
  }

  public static int[] generateEvenArray(int[] array) {
    int[] evenArray = new int[array.length];
    int position = 0;
    for (int j : array) {
      if (!isOdd(j)) {
        evenArray[position] = j;
        position++;
      }
    }
    return stripArray(evenArray);
  }

  public static int[] stripArray(int[] array) {
    int position = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        position = i;
        break;
      }
    }
    int[] newArray = new int[position];
    System.arraycopy(array, 0, newArray, 0, newArray.length);
    return newArray;
  }

  public static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isOdd(int number) {
    return number % 2 != 0;
  }

  public static int[] generateArray(String limitesStr) {
    int[] bounds = parseBounds(limitesStr);
    int length = bounds[1] - bounds[0];
    int[] array = new int[length + 1];
    for (int i = 0; i < array.length; i++) {
      array[i] = bounds[0] + i;
    }
    return array;
  }

  public static int[] parseBounds(String boundsStr) {
    System.out.println(boundsStr);
    String[] boundsSplit = boundsStr.split("-");
    System.out.println(Arrays.toString(boundsSplit));
    int[] parsedBounds = new int[2];
    parsedBounds[0] = Integer.parseInt(boundsSplit[0]);
    parsedBounds[1] = Integer.parseInt(boundsSplit[1]);
    return parsedBounds;
  }

  public static String getArrayBounds() {
    while(true){
      String boundsStr = getInput("Ingrese los limites del conjunto, separados por un guion");
      if(boundsStr.contains("-")){
        return boundsStr;
      }
      else {
        System.out.println("Limites incorrectos, siga el siguiente ejemplo: 1-10");
      }
    }
  }


  public static void showMenu() {
    System.out.println("-------------");
    System.out.println("[1] Mostrar Conjunto");
    System.out.println("[2] Mostrar numeros pares e impares");
    System.out.println("[3] Mostrar numeros primos");
    System.out.println("[4] Cambiar limites del conjunto");
    System.out.println("");
    System.out.println("[0] Salir");
  }
}
