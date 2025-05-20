// SBI Bank class implementing OnlineBankingFeatures and extending INDBank
public class SBI extends INDBank implements OnlineBankingFeatures {

    @Override
    public double getInterestRate() {
        return 5.5;
    }

    @Override
    public void transferMoney() {
        System.out.println("SBI: Transferring Money Online...");
    }

    @Override
    public void checkBalance() {
        System.out.println("SBI: Checking Balance Online...");
    }
}
