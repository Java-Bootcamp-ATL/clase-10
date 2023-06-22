import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    personInfo();
    getDataAccount();
  }

  private static void personInfo () {
    Scanner s = new Scanner(System.in);
    Person person = new Person();
    System.out.println("Ingrese el Id: ");
    person.setId(s.nextInt());
    s.nextLine();
    System.out.println("Ingrese el nombre: ");
    person.setName(s.nextLine());
    System.out.println("Ingrese la edad: ");
    person.setAge(s.nextInt());
    s.nextLine();
    System.out.println("Ingrese su cumpleaños: ");
    person.setBirthday(s.nextLine());
    System.out.println("Ingrese el dni: ");
    person.setDni(s.nextLine());

    person.showData();
    person.oldPerson();
  }

  private static void getDataAccount () {
    Account account = new Account();
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese el nombre de la cuenta: ");
    account.setNameAccount(s.nextLine());
    System.out.println("Ingrese la cantidad a depositar: ");
    float quantityToInsert = s.nextFloat();
    account.insertQuantity(quantityToInsert);
    System.out.println("Ingrese la cantidad a retirar: ");
    float quantityToCatch = s.nextFloat();
    account.catchQuantity(quantityToCatch);
    account.showData();
  }
}