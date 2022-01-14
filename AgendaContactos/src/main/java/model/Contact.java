package model;

public class Contact {

  private static long ID_COUNT = 1;

  private long id;
  private String name;
  private String email;
  private String country;
  private Gender gender;
  private MaritalStatus maritalStatus;

  public Contact(long id, String name, String email, String country, Gender gender, MaritalStatus maritalStatus) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.country = country;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
    ID_COUNT++;
  }

  public Contact(String name, String email, String country, Gender gender, MaritalStatus maritalStatus) {
    this.id = ID_COUNT++;
    this.name = name;
    this.email = email;
    this.country = country;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public MaritalStatus getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatus maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public String[] toTableRow(){
    String[] row = {
        String.valueOf(this.id),
        this.name,
        this.email,
        this.country,
        this.gender.toString(),
        this.maritalStatus.toString()
    };
    return row;
  }

  @Override
  public String toString() {
    return "Contact{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", country='" + country + '\'' +
        ", gender=" + gender +
        ", maritalStatus=" + maritalStatus +
        '}';
  }
}
