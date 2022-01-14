package model;

public enum MaritalStatus {
  CASADX ("Casadx"),
  VIUDX ("Viudx"),
  SOLTERX ("Solterx"),
  DIVORCIADX ("Divorciadx"),
  CONVIVIENTE_CIVIL ("Conviviente Civil");

  private String value;
  MaritalStatus(String value){
    this.value = value;
  }

  @Override
  public String toString(){
    return this.value;
  }

  public static MaritalStatus enumOf(String value){
    switch (value){
      case "Casadx" -> {
        return MaritalStatus.CASADX;
      }
      case "Viudx" -> {
        return MaritalStatus.VIUDX;
      }
      case "Solterx" -> {
        return MaritalStatus.SOLTERX;
      }
      case "Divorciadx" -> {
        return MaritalStatus.DIVORCIADX;
      }
      case "Conviviente Civil" -> {
        return MaritalStatus.CONVIVIENTE_CIVIL;
      }
    }
    return null;
  }
}
