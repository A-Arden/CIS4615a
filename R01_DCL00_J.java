/*
  Allison Arden
  6. Rule 01. Declarations and Initializations(DCL)
  DCL00-J. Prevent class initialization cycles
   non-compliant code
*/


public class Cycle {
  private final int balance;
  private static final Cycle c = new Cycle();
  private static final int deposit = (int) (Math.random() * 100); // Random deposit
 
  public Cycle() {
    balance = deposit - 10; // Subtract processing fee
  }
 
  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}
