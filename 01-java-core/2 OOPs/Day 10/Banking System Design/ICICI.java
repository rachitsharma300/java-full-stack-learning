// ICICI Bank class implementing OnlineBankingFeatures and extending INDBank
public class ICICI extends INDBank implements OnlineBankingFeatures {

    @Override
    public double getInterestRate() {
        return 6.0;
    }

    @Override
    public void transferMoney() {
        System.out.println("ICICI: Transferring Money Online...");
    }

    @Override
    public void checkBalance() {
        System.out.println("ICICI: Checking Balance Online...");
    }
}
