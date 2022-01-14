package model;

public enum Gender {
  MAN("Hombre"),
  WOMAN("Mujer"),
  NON_BINARY("No binario");

  private final String value;

  Gender(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value;
  }

  public static Gender enumOf(String value) {
    switch (value) {
      case "Hombre" -> {
        return Gender.MAN;
      }
      case "Mujer" -> {
        return Gender.WOMAN;
      }
      case "No binario" -> {
        return Gender.NON_BINARY;
      }
    }
    return null;
  }
}
