// HDFC Bank class implementing OnlineBankingFeatures and extending INDBank
public class HDFC extends INDBank implements OnlineBankingFeatures {

    @Override
    public double getInterestRate() {
        return 6.5;
    }

    @Override
    public void transferMoney() {
        System.out.println("HDFC: Transferring Money Online...");
    }

    @Override
    public void checkBalance() {
        System.out.println("HDFC: Checking Balance Online...");
    }
}
