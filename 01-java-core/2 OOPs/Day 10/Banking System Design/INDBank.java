// Abstract Bank class
public abstract class INDBank {
    public abstract double getInterestRate();

    public void displayBankInfo() {
        System.out.println("Bank Name: " + this.getClass().getSimpleName());
    }
}
