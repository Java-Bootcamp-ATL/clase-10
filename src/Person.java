public class Person {
  private int id;
  private String name;
  private int age;
  private String birthday;
  private String dni;

  public Person(){

  }
  public Person(int id, String name, int age, String birthday, String dni) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.birthday = birthday;
    this.dni = dni;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public void showData () {
    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Birthday: " + birthday);
    System.out.println("Dni: " + dni);
  }

  public void oldPerson () {
    if (age > 18){
      System.out.println("Usted es mayor de edad...");
    }else {
      System.out.println("Usted es menor de edad...");
    }
  }
}
