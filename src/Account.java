import java.util.Scanner;

public class Account {
  private String nameAccount;
  private float quantity;

  public Account () {

  }

  public String getNameAccount() {
    return nameAccount;
  }

  public void setNameAccount(String nameAccount) {
    this.nameAccount = nameAccount;
  }

  public float getQuantity() {
    return quantity;
  }

  public void setQuantity(float quantity) {
    this.quantity = quantity;
  }

  public void showData () {
    System.out.println("La cuenta es: " + nameAccount);
    System.out.println("Cantidad: $ " + quantity);
  }
  public void insertQuantity (float quantityToSave) {
    if (quantityToSave > 0 ){
      quantity += quantityToSave;
    }
  }
  public void catchQuantity (float quantityToSave) {
    quantity -= quantityToSave;
  }
}
